package UI.AnalysisViews;

import Analyzer.AnalysisResult;
import javafx.scene.Node;

import java.util.*;

public abstract class AnalysisView {
    protected Map<String, Map<Integer, Double>> data;

    protected Node node;

    private final String viewType;

    private Map<String, Map<Integer, Double>> getAnalysisResultAsSeriesMap(AnalysisResult result) {
        Map<String, Map<Integer, Double>> seriesMap = new HashMap<>();

        String[] labels = result.getLabels();
        List<Map<String, Double>> rawData = result.getData();

        for(int i = 0; i < labels.length; i++) {
            Map<Integer, Double> map = new HashMap<>();
            Map<String, Double> rawDataForLabel = rawData.get(i);

            for (String year: rawDataForLabel.keySet()) {
                Integer intYear = Integer.parseInt(year);
                map.put(intYear, rawDataForLabel.get(year));
            }

            seriesMap.put(labels[i], map);
        }

        return seriesMap;
    }

    public AnalysisView(String viewType, AnalysisResult data) {
        this.viewType = viewType;

        this.data = getAnalysisResultAsSeriesMap(data);
    }

    public String getViewType() {
        return viewType;
    }

    public void setData(AnalysisResult data) {
        this.data = getAnalysisResultAsSeriesMap(data);
    }

    public abstract void rerender();

    public Node getNode() {
        return node;
    }
}
