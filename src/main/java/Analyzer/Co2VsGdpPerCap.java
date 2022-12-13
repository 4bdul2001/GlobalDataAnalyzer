package Analyzer;

import Fetchers.AbstractFetcher;
import Fetchers.Co2Fetcher;
import Fetchers.GdpFetcher;
import WbApi.WbApiModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class Co2VsGdpPerCap extends AbstractAnalyzer{

    public Co2VsGdpPerCap(String sYear, String eYear, String country) {
        super(sYear, eYear, country);
    }

    public AnalysisResult recalculate() throws WbApiModel.WbApiModelException {
        String[] labels = new String[2];
        AbstractFetcher fetcher = new Co2Fetcher(this.startYear, this.endYear, this.country);
        Map<String, Double> co2Data = fetcher.getData();
        labels[0] = fetcher.getLabel();

        fetcher = new GdpFetcher(this.startYear, this.endYear, this.country);
        Map<String, Double> gdpPerCapData = fetcher.getData();
        labels[1] = fetcher.getLabel();

        return new AnalysisResult(new ArrayList<>(Arrays.asList(
                co2Data,
                gdpPerCapData
        )), labels);
    }
}
