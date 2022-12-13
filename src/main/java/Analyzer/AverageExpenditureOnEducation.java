package Analyzer;

import Fetchers.AbstractFetcher;
import Fetchers.EducationExpenditureFetcher;
import WbApi.WbApiModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class AverageExpenditureOnEducation extends AbstractAnalyzer {

    public AverageExpenditureOnEducation(String startYear, String endYear, String country) {
        super(startYear, endYear, country);
    }

    public AnalysisResult recalculate() throws WbApiModel.WbApiModelException {
        String[] labels = new String[1];
        AbstractFetcher fetcher = new EducationExpenditureFetcher(this.startYear, this.endYear, this.country);
        Map<String, Double> educationExpenditureData = fetcher.getData();
        labels[0] = fetcher.getLabel();

        return new AnalysisResult(new ArrayList<>(Arrays.asList(
                educationExpenditureData
        )), labels);
    }
}
