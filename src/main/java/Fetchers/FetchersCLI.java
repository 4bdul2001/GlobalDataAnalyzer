package Fetchers;

import WbApi.WbApiModel;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FetchersCLI {
    public static void main(String[] args) throws WbApiModel.WbApiModelException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        String country;
        String startYear;
        String endYear;
        int fetcherValue;
        Map<String, String> countryCodes = new HashMap<String, String>();
        Class[] numbersToFetcher = new Class[]{AirPollutionFetcher.class, Co2Fetcher.class,
                                               EducationExpenditureFetcher.class, EnergyUseFetcher.class,
                                               ForestAreaFetcher.class, GdpFetcher.class, HealthExpenditureFetcher.class,
                                               HospitalBedsFetcher.class, MortalityRateFetcher.class, PopulationFetcher.class,
                                               HealthCareAccessProblemsFetcher.class};

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

        //Part 4: Select a fetcher.
        System.out.println("Please select a fetcher from it's corresponding number in parentheses:");
        for(int i=0; i<numbersToFetcher.length; i++){
            System.out.println("(" + (i) + ") " + numbersToFetcher[i].getSimpleName());
        }
        fetcherValue = scanner.nextInt();

        Class classOfFetcher = numbersToFetcher[fetcherValue];
        Constructor constructor = classOfFetcher.getConstructor(String.class, String.class, String.class);
        Object object = constructor.newInstance(startYear, endYear,country);
        AbstractFetcher fetcher = (AbstractFetcher) object;
        dataToConsole(fetcher.getData(), startYear);
    }

    private static void initializeCountryCodes(Map<String, String> countryCodes) {
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

    private static void dataToConsole(Map<String, Double> data, String startYear) {
        int i = 0;
        int year = Integer.parseInt(startYear);
        while(i < data.size()){
            System.out.println("Year: " + (year + i) + ", Value: " + data.get(Integer.toString(year+i)));
            i++;
        }
    }
}