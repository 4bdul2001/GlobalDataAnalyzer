package UI.AnalysisViews;

import Analyzer.AnalysisResult;
import javafx.collections.FXCollections;
import javafx.scene.chart.LineChart;

public class LineChartView extends XYChartView {

    public LineChartView(AnalysisResult data) {
        super("Line Chart", data);

        LineChart<String,Number> chart = new LineChart<>(xAxis, yAxis);
        chart.getData().addAll(this.seriesData);

        node = chart;
    }

    @Override
    public void rerender() {
        LineChart<String, Number> chart = (LineChart<String, Number>) node;
        chart.getData().clear();
        chart.setData(FXCollections.observableList(seriesData));
    }
}
