package UI.AnalysisViews;

import Analyzer.AnalysisResult;

public class AnalysisViewFactory {
    public static AnalysisView createAnalysisView(String viewType, AnalysisResult data) {
        AnalysisView view;

        switch (viewType) {
            case "Bar Chart" -> view = new BarChartView(data);
            case "Line Chart" -> view = new LineChartView(data);
            case "Scatter Chart" -> view = new ScatterChartView(data);
            case "Pie Chart" -> view = new PieChartView(data);
            case "Report" -> view = new ReportView(data);
            default -> throw new RuntimeException("Unexpected view type:" + viewType);
        }

        return view;
    }
}
