package Analyzer;

import Fetchers.*;
import WbApi.WbApiModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class PublicSectorEmploymentShareMaleVsFemale extends AbstractAnalyzer {
    public PublicSectorEmploymentShareMaleVsFemale(String startYear, String endYear, String country) {
        super(startYear, endYear, country);
    }

    @Override
    public AnalysisResult recalculate() throws WbApiModel.WbApiModelException {
        String[] labels = new String[2];
        AbstractFetcher fetcherMale = new PublicSectorEmploymentShareMale(this.startYear, this.endYear, this.country);
        Map<String, Double> maleData = fetcherMale.getData();
        labels[0] = fetcherMale.getLabel();

        AbstractFetcher fetcherFemale = new PublicSectorEmploymentShareFemale(this.startYear, this.endYear, this.country);
        Map<String, Double> femaleData = fetcherFemale.getData();
        labels[1] = fetcherFemale.getLabel();

        return new AnalysisResult(new ArrayList<>(Arrays.asList(
                maleData,
                femaleData
        )), labels);
    }
}
