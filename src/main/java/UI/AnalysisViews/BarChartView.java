package UI.AnalysisViews;

import Analyzer.AnalysisResult;
import javafx.collections.FXCollections;
import javafx.scene.chart.BarChart;

public class BarChartView extends XYChartView {

    public BarChartView(AnalysisResult data) {
        super("Bar Chart", data);

        BarChart<String, Number> chart = new BarChart<>(xAxis, yAxis);

        chart.getData().addAll(seriesData);

        node = chart;
    }

    @Override
    public void rerender() {
        BarChart<String, Number> chart = (BarChart<String, Number>) node;
        chart.getData().clear();
        chart.setData(FXCollections.observableList(seriesData));
    }
}
