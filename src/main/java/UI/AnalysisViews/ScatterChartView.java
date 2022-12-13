package UI.AnalysisViews;

import Analyzer.AnalysisResult;
import javafx.collections.FXCollections;
import javafx.scene.chart.ScatterChart;

public class ScatterChartView extends XYChartView {
    public ScatterChartView(AnalysisResult data) {
        super("Scatter Chart", data);

        ScatterChart<String, Number> chart = new ScatterChart<>(xAxis, yAxis);
        chart.getData().addAll(seriesData);

        node = chart;
    }


    @Override
    public void rerender() {
        ScatterChart<String, Number> chart = (ScatterChart<String, Number>) node;
        chart.getData().clear();
        chart.setData(FXCollections.observableList(seriesData));
    }
}
