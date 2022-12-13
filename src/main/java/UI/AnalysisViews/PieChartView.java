package UI.AnalysisViews;

import Analyzer.AnalysisResult;
import javafx.scene.chart.PieChart;

import java.util.*;

public class PieChartView extends AnalysisView {
    private List<PieChart.Data> chartData;

    public PieChartView(AnalysisResult data) {
        super("Pie Chart", data);

        String[] labels = data.getLabels();
        PieChart chart = new PieChart();

        List<PieChart.Data> chartData = getDataAsPieChartData(labels);

        if(chartData.isEmpty()){
            node = null;
            return;
        }

        chart.getData().addAll(chartData);

        node = chart;
    }

    private List<PieChart.Data> getDataAsPieChartData(String[] labels) {
        List<PieChart.Data> chartData = new ArrayList<>();

        for (String label:
             labels) {
            List<Double> values = this.data.get(label).values().stream().toList();
            if(values.get(0) == null)
                return new ArrayList<>();
            chartData.add(new PieChart.Data(label, values.get(0)));
        }
        return chartData;
    }

    @Override
    public void setData(AnalysisResult data) {
        super.setData(data);
        this.chartData = getDataAsPieChartData(data.getLabels());
    }

    @Override
    public void rerender() {
        PieChart chart = (PieChart) node;
        chart.getData().clear();
        chart.getData().addAll(this.chartData);
    }
}