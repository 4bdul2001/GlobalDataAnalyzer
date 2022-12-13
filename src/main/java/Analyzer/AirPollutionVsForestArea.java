package Analyzer;

import Fetchers.AbstractFetcher;
import Fetchers.AirPollutionFetcher;
import Fetchers.ForestAreaFetcher;
import WbApi.WbApiModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class AirPollutionVsForestArea extends AbstractAnalyzer{

    public AirPollutionVsForestArea(String startYear, String endYear, String country) {
        super(startYear, endYear, country);
    }

    public AnalysisResult recalculate() throws WbApiModel.WbApiModelException {
        String[] labels = new String[2];
        AbstractFetcher fetcher = new AirPollutionFetcher(this.startYear, this.endYear, this.country);
        Map<String, Double> airPollutionData = fetcher.getData();
        labels[0] = fetcher.getLabel();


        fetcher = new ForestAreaFetcher(this.startYear, this.endYear, this.country);
        Map<String, Double> forestAreaData = fetcher.getData();
        labels[1] = fetcher.getLabel();

        return new AnalysisResult(new ArrayList<>(Arrays.asList(
                airPollutionData,
                forestAreaData
        )), labels);
    }
}
