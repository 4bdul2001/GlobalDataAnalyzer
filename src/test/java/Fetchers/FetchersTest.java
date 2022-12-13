package Fetchers;

import WbApi.WbApiModel;
import org.junit.jupiter.api.*;

import java.util.HashMap;
import java.util.Map;

public class FetchersTest {
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
    void airPollutionTester() throws WbApiModel.WbApiModelException {
        AirPollutionFetcher airPollution = new AirPollutionFetcher(startYear, endYear, country);
        Map<String, Double> map = new HashMap<String, Double>(airPollution.getData());
        Assertions.assertEquals(map.get(startYear), 8.2809835638994);
        Assertions.assertNull(map.get(endYear));
    }
    @Test
    void co2Tester() throws WbApiModel.WbApiModelException {
        Co2Fetcher co2 = new Co2Fetcher(startYear, endYear, country);
        Map<String, Double> map = new HashMap<String, Double>(co2.getData());
        Assertions.assertEquals(map.get(startYear), 16.7576264276587);
        Assertions.assertEquals(map.get(endYear), 16.3315689530885);
    }
    @Test
    void educationExpenditureTester() throws WbApiModel.WbApiModelException {
        EducationExpenditureFetcher educationExpindenture = new EducationExpenditureFetcher(startYear, endYear, country);
        Map<String, Double> map = new HashMap<String, Double>(educationExpindenture.getData());
        Assertions.assertEquals(map.get(startYear), 12.9826002120972);
        Assertions.assertEquals(map.get(endYear), 12.2122402191162);
    }
    @Test
    void energyUseTester() throws WbApiModel.WbApiModelException {
        EnergyUseFetcher energyUse = new EnergyUseFetcher(startYear, endYear, country);
        Map<String, Double> map = new HashMap<String, Double>(energyUse.getData());
        Assertions.assertEquals(map.get(startYear), 8265.07992477285);
        Assertions.assertEquals(map.get(endYear), 8056.3494253004);
    }
    @Test
    void forestAreaTester() throws WbApiModel.WbApiModelException {
        ForestAreaFetcher forestArea = new ForestAreaFetcher(startYear, endYear, country);
        Map<String, Double> map = new HashMap<String, Double>(forestArea.getData());
        Assertions.assertEquals(map.get(startYear), 38.7929818338782);
        Assertions.assertEquals(map.get(endYear), 38.7876307080739);
    }
    @Test
    void gdpTester() throws WbApiModel.WbApiModelException {
        GdpFetcher gdp = new GdpFetcher(startYear, endYear, country);
        Map<String, Double> map = new HashMap<String, Double>(gdp.getData());
        Assertions.assertEquals(map.get(startYear), 24271.0020563821);
        Assertions.assertEquals(map.get(endYear), 23822.0601178964);
    }
    @Test
    void healthExpenditureTester() throws WbApiModel.WbApiModelException {
        HealthExpenditureFetcher healthExpenditure = new HealthExpenditureFetcher(startYear, endYear, country);
        Map<String, Double> map = new HashMap<String, Double>(healthExpenditure.getData());
        Assertions.assertEquals(map.get(startYear), 8.24814415);
        Assertions.assertEquals(map.get(endYear), 8.62482357);
    }
    @Test
    void hospitalBedsTester() throws WbApiModel.WbApiModelException {
        HospitalBedsFetcher hospitalBeds = new HospitalBedsFetcher(startYear, endYear, country);
        Map<String, Double> map = new HashMap<String, Double>(hospitalBeds.getData());
        Assertions.assertEquals(map.get(startYear), 3.77);
        Assertions.assertEquals(map.get(endYear), 3.69);
    }
    @Test
    void mortalityRateTester() throws WbApiModel.WbApiModelException {
        MortalityRateFetcher mortalityRate = new MortalityRateFetcher(startYear, endYear, country);
        Map<String, Double> map = new HashMap<String, Double>(mortalityRate.getData());
        Assertions.assertEquals(map.get(startYear), 9);
        Assertions.assertEquals(map.get(endYear), 10);
    }
    @Test
    void populationTester() throws WbApiModel.WbApiModelException {
        PopulationFetcher population = new PopulationFetcher(startYear, endYear, country);
        Map<String, Double> map = new HashMap<String, Double>(population.getData());
        Assertions.assertEquals(map.get(startYear), 30685730);
        Assertions.assertEquals(map.get(endYear), 31020902);
    }
    @Test
    void healthCareAccessProblemsTest() throws WbApiModel.WbApiModelException {
        HealthCareAccessProblemsFetcher healthCareAccessProblems = new HealthCareAccessProblemsFetcher(startYear, endYear, country);
        Map<String, Double> map = new HashMap<String, Double>(healthCareAccessProblems.getData());
        Assertions.assertNull(map.get(startYear));
        Assertions.assertNull(map.get(endYear));
    }
}