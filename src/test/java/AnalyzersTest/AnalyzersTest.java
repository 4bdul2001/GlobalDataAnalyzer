package AnalyzersTest;

import Analyzer.*;
import WbApi.WbApiModel;
import org.junit.jupiter.api.*;

import java.util.HashMap;
import java.util.Map;

public class AnalyzersTest {
    private String startYear;
    private String endYear;
    private String country;

    @BeforeEach
    public void setupParameters(){
        startYear = "2000";
        endYear = "2001";
        country = "can";
    }
    @Test
    void AverageExpenditureOnEducationAnalysisTest() throws WbApiModel.WbApiModelException {
        AverageExpenditureOnEducation averageEduction = new AverageExpenditureOnEducation(startYear, endYear, country);
        AnalysisResult result = averageEduction.recalculate(startYear, endYear, country);
        Map<String, Double> year1 = new HashMap<String, Double>(result.getValues(Integer.parseInt(startYear)));
        Map<String, Double> year2 = new HashMap<String, Double>(result.getValues(Integer.parseInt(endYear)));
        Assertions.assertEquals(result.getLabels().length, 1);
        Assertions.assertEquals(result.getLabels()[0], "EducationExpenditure");
        Assertions.assertEquals(year1.get(result.getLabels()[0]), 12.9826002120972);
        Assertions.assertEquals(year2.get(result.getLabels()[0]), 12.2122402191162);
    }

    @Test
    void AirPollutionVsForestAreaAnalysisTest() throws WbApiModel.WbApiModelException {
        AirPollutionVsForestArea airVSForest = new AirPollutionVsForestArea(startYear, endYear, country);
        AnalysisResult result = airVSForest.recalculate(startYear, endYear, country);
        Map<String, Double> year1 = new HashMap<String, Double>(result.getValues(Integer.parseInt(startYear)));
        Map<String, Double> year2 = new HashMap<String, Double>(result.getValues(Integer.parseInt(endYear)));
        Assertions.assertEquals(result.getLabels().length, 2);
        Assertions.assertEquals(result.getLabels()[0], "AirPollution");
        Assertions.assertEquals(result.getLabels()[1], "ForestArea");
        Assertions.assertEquals(year1.get(result.getLabels()[0]), 8.2809835638994);
        Assertions.assertEquals(year1.get(result.getLabels()[1]), 38.7929818338782);
        Assertions.assertNull(year2.get(result.getLabels()[0]));
        Assertions.assertEquals(year2.get(result.getLabels()[1]), 38.7876307080739);
    }
    @Test
    void CO2VsEnergyUseVsAirPollutionAnalysisTest() throws WbApiModel.WbApiModelException {
        Co2VsEnergyUseVsAirPollution co2VSEnergyVsAir = new Co2VsEnergyUseVsAirPollution(startYear, endYear, country);
        AnalysisResult result = co2VSEnergyVsAir.recalculate(startYear, endYear, country);
        Map<String, Double> year1 = new HashMap<String, Double>(result.getValues(Integer.parseInt(startYear)));
        Map<String, Double> year2 = new HashMap<String, Double>(result.getValues(Integer.parseInt(endYear)));
        Assertions.assertEquals(result.getLabels().length, 3);
        Assertions.assertEquals(result.getLabels()[0], "CO2");
        Assertions.assertEquals(result.getLabels()[1], "EnergyUse");
        Assertions.assertEquals(result.getLabels()[2], "AirPollution");
        Assertions.assertEquals(year1.get(result.getLabels()[0]), 16.7576264276587);
        Assertions.assertEquals(year1.get(result.getLabels()[1]), 8265.07992477285);
        Assertions.assertEquals(year1.get(result.getLabels()[2]), 8.2809835638994);
        Assertions.assertEquals(year2.get(result.getLabels()[0]), 16.3315689530885);
        Assertions.assertEquals(year2.get(result.getLabels()[1]), 8056.3494253004);
        Assertions.assertNull(year2.get(result.getLabels()[2]));
    }

    @Test
    void AverageForestAreaAnalysisTest() throws WbApiModel.WbApiModelException {
        var averageForestArea = new AverageForestArea(startYear, endYear, country);
        AnalysisResult result = averageForestArea.recalculate(startYear, endYear, country);
        Map<String, Double> year1 = new HashMap<String, Double>(result.getValues(Integer.parseInt(startYear)));
        Map<String, Double> year2 = new HashMap<String, Double>(result.getValues(Integer.parseInt(endYear)));
        Assertions.assertEquals(result.getLabels().length, 1);
        Assertions.assertEquals("ForestArea", result.getLabels()[0]);
        Assertions.assertEquals(year1.get(result.getLabels()[0]), 38.7929818338782);
        Assertions.assertEquals(year2.get(result.getLabels()[0]), 38.7876307080739);
    }

    @Test
    void PublicSectorEmploymentShareMaleVsFemaleTest() throws WbApiModel.WbApiModelException {
        var publicSectorEmploymentShare = new PublicSectorEmploymentShareMaleVsFemale("2000", "2000", "MEX");
        AnalysisResult result = publicSectorEmploymentShare.recalculate("2000", "2000", "MEX");
        Map<String, Double> year1 = new HashMap<String, Double>(result.getValues(Integer.parseInt("2000")));
        Assertions.assertEquals(result.getLabels().length, 2);
        Assertions.assertEquals("Public Sector Employment Share Of Total Employment In Males", result.getLabels()[0]);
        Assertions.assertEquals("Public Sector Employment Share Of Total Employment In Females", result.getLabels()[1]);
        Assertions.assertEquals(0.0936650335788727, year1.get(result.getLabels()[0]));
        Assertions.assertEquals(0.145692750811577, year1.get(result.getLabels()[1]));
    }

    @Test
    void EducationExpenditureVsHealthExpenditureTest() throws WbApiModel.WbApiModelException {
        var educationExpenditureVsHealthExpenditure = new EducationExpenditureVsHealthExpenditure(startYear, endYear, country);
        AnalysisResult result = educationExpenditureVsHealthExpenditure.recalculate(startYear, endYear, country);
        Map<String, Double> year1 = new HashMap<String, Double>(result.getValues(Integer.parseInt(startYear)));
        Map<String, Double> year2 = new HashMap<String, Double>(result.getValues(Integer.parseInt(endYear)));
        Assertions.assertEquals(result.getLabels().length, 2);
        Assertions.assertEquals("EducationExpenditure", result.getLabels()[0]);
        Assertions.assertEquals("HealthExpenditure", result.getLabels()[1]);
        Assertions.assertEquals(12.9826002120972, year1.get(result.getLabels()[0]));
        Assertions.assertEquals(8.24814415, year1.get(result.getLabels()[1]));
        Assertions.assertEquals(12.2122402191162, year2.get(result.getLabels()[0]));
        Assertions.assertEquals(8.62482357, year2.get(result.getLabels()[1]));
    }
}