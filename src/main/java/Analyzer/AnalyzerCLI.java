package Analyzer;

import WbApi.WbApiModel;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnalyzerCLI {
    public static void main(String args[]) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, WbApiModel.WbApiModelException {
        String country;
        String startYear;
        String endYear;
        int analyzerValue;
        Map<String, String> countryCodes = new HashMap<String, String>();
        Class[] numbersToAnalyzer = new Class[] {AirPollutionVsForestArea.class,
                                                 AverageExpenditureOnEducation.class, AverageForestArea.class,
                                                 Co2VsEnergyUseVsAirPollution.class, Co2VsGdpPerCap.class,
                                                 EducationExpenditureVsHealthExpenditure.class, HealthExpenditureVsHospitalBeds.class,
                                                 HealthCareAccessProblemsVsMortalityRate.class};

        initializeCountryCodes(countryCodes);
        Scanner scanner = new Scanner(System.in);
        //Part 1: Select country.
        System.out.println("Please select a country from it's corresponding country_name in parentheses:");
        for(String countryName: countryCodes.keySet()){
            System.out.println("(" + countryCodes.get(countryName) +") " + countryName);
        }
        country = scanner.nextLine();

        //Part 2: Select start year.
        System.out.println("Please specify a start year:");
        startYear = scanner.nextLine();

        //Part 3: Select end year.
        System.out.println("Please specify an end year:");
        endYear = scanner.nextLine();

        //Part 4: Select an Analyzer.
        System.out.println("Please select an Analyzer from it's corresponding number in parentheses:");
        for(int i = 0; i<numbersToAnalyzer.length; i++){
            System.out.println("(" + (i) + ") " + numbersToAnalyzer[i].getSimpleName());
        }
        analyzerValue = scanner.nextInt();

        Class classOfAnalyzers = numbersToAnalyzer[analyzerValue];
        Constructor constructor = classOfAnalyzers.getConstructor(String.class, String.class, String.class);
        Object object = constructor.newInstance(startYear, endYear, country);
        AbstractAnalyzer analyzer = (AbstractAnalyzer) object;
        AnalysisResult result = analyzer.recalculate(analyzer.getStartYear(), analyzer.getEndYear(), analyzer.getCountry());
        dateToConsole(result, startYear, endYear);
    }

    private static void initializeCountryCodes(Map<String,String> countryCodes) {
        countryCodes.put("Argentina", "ARG");
        countryCodes.put("Brazil", "BRA");
        countryCodes.put("Canada", "CAN");
        countryCodes.put("China", "CHN");
        countryCodes.put("France", "FRA");
        countryCodes.put("India", "IND");
        countryCodes.put("Italy", "ITA");
        countryCodes.put("Japan", "JPN");
        countryCodes.put("Mexico", "MEX");
        countryCodes.put("Portugal", "PRT");
        countryCodes.put("USA", "USA");
    }
    private static void dateToConsole(AnalysisResult data, String startYear, String endYear) {
        int i = 0;
        int year = Integer.parseInt(startYear);
        int last = Integer.parseInt(endYear);
        Map<String, Double> result;
        while((year+i) <= last){
            result = data.getValues(year+i);
            System.out.println("Year: " + (year + i));
            for(String label: result.keySet()){
                System.out.println(label +": " + result.get(label));
            }
            i++;
        }
    }
}