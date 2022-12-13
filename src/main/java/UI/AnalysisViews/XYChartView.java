package UI.AnalysisViews;

import Analyzer.AnalysisResult;
import javafx.collections.FXCollections;
import javafx.collections.transformation.SortedList;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public abstract class XYChartView extends AnalysisView {
    protected List<XYChart.Series<String,Number>> seriesData;
    protected CategoryAxis xAxis;
    protected NumberAxis yAxis;

    public XYChartView(String viewType, AnalysisResult data) {
        super(viewType, data);

        xAxis = new CategoryAxis();
        yAxis = new NumberAxis();

        // TODO: add labels to axes

        String[] labels = data.getLabels();

        this.seriesData = getDataAsSeriesList(labels);
    }

    @Override
    public void setData(AnalysisResult data) {
        super.setData(data);
        this.seriesData = getDataAsSeriesList(data.getLabels());
    }

    private List<XYChart.Series<String, Number>> getDataAsSeriesList(String[] labels) {
        List<XYChart.Series<String,Number>> seriesList = new ArrayList<>();
        List<Integer> nullYears = new ArrayList<>();

        for (String label:
                labels) {
            List<XYChart.Data<String, Number>> list = new ArrayList<>();
            Map<Integer,Double> yearToValue = this.data.get(label);


            for (Integer year:
                    yearToValue.keySet()) {
                if(nullYears.contains(year))
                    continue;
                if(yearToValue.get(year) == null) {
                    nullYears.add(year);
                    continue;
                }

                list.add(new XYChart.Data<>(year.toString(), yearToValue.get(year)));
            }

            SortedList<XYChart.Data<String, Number>> sortedList = new SortedList<>(FXCollections.observableList(list), Comparator.comparingInt((o) -> Integer.parseInt(o.getXValue())));

            XYChart.Series<String, Number> series = new XYChart.Series<>(sortedList);
            series.setName(label);
            seriesList.add(series);
        }
        return seriesList;
    }
}
