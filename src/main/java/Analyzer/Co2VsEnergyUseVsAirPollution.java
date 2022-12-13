package Analyzer;

import Fetchers.*;
import WbApi.WbApiModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class Co2VsEnergyUseVsAirPollution extends AbstractAnalyzer{

    public Co2VsEnergyUseVsAirPollution(String startYear, String endYear, String country) {
        super(startYear, endYear, country);
    }
    public AnalysisResult recalculate() throws WbApiModel.WbApiModelException {
        String[] labels = new String[3];
        AbstractFetcher fetcher = new Co2Fetcher(this.startYear, this.endYear, this.country);
        Map<String, Double> co2Data = fetcher.getData();
        labels[0] = fetcher.getLabel();

        fetcher = new EnergyUseFetcher(this.startYear, this.endYear, this.country);
        Map<String, Double> energyUseData = fetcher.getData();
        labels[1] = fetcher.getLabel();

        fetcher = new AirPollutionFetcher(this.startYear, this.endYear, this.country);
        Map<String, Double> airPollutionData = fetcher.getData();
        labels[2] = fetcher.getLabel();

        return new AnalysisResult(new ArrayList<>(Arrays.asList(
                co2Data,
                energyUseData,
                airPollutionData
        )), labels);
    }
}
