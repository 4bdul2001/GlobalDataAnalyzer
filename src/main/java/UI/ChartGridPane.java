package UI;

import Analyzer.*;
import UI.AnalysisViews.*;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import WbApi.WbApiModel;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.*;

import static UI.AnalysisViews.AnalysisViewFactory.createAnalysisView;

public class ChartGridPane extends BorderPane implements Initializable {
    static final private String[] arrayOfAnalysis = {"Air Pollution vs Forest Area", "Average Expenditure On Education",
            "Average Forest Area", "CO2 vs Energy Use vs Air Pollution",
            "CO2 vs GDP per Capita", "Education Expenditure vs Health Expenditure",
            "Health Care Access Problems vs Mortality Rate",
            "Health Expenditure vs Hospital Beds", "Public Sector Employment Share Male vs Female"};


    static final private String[] Countries = {"BRA", "CAN", "CHN", "FRA", "IND", "ITA", "JPN", "MEX", "PRT", "USA"};

    static final private Map<String, String[]> analysisToCharts = new HashMap<>();
    static final private Map<String, Class<? extends AbstractAnalyzer>> analyzerTypesToClasses = new HashMap<>();

    static {
        analyzerTypesToClasses.put("Air Pollution vs Forest Area", AirPollutionVsForestArea.class);
        analyzerTypesToClasses.put("Average Expenditure On Education", AverageExpenditureOnEducation.class);
        analyzerTypesToClasses.put("Average Forest Area", AverageForestArea.class);
        analyzerTypesToClasses.put("CO2 vs Energy Use vs Air Pollution", Co2VsEnergyUseVsAirPollution.class);
        analyzerTypesToClasses.put("CO2 vs GDP per Capita", Co2VsGdpPerCap.class);
        analyzerTypesToClasses.put("Education Expenditure vs Health Expenditure", EducationExpenditureVsHealthExpenditure.class);
        analyzerTypesToClasses.put("Health Care Access Problems vs Mortality Rate", HealthCareAccessProblemsVsMortalityRate.class);
        analyzerTypesToClasses.put("Health Expenditure vs Hospital Beds", HealthExpenditureVsHospitalBeds.class);
        analyzerTypesToClasses.put("Public Sector Employment Share Male vs Female", PublicSectorEmploymentShareMaleVsFemale.class);


        analysisToCharts.put("Air Pollution vs Forest Area",
                new String[]{"Bar Chart", "Line Chart", "Scatter Chart", "Report"});

        analysisToCharts.put("Average Expenditure On Education",
                new String[]{"Bar Chart", "Line Chart", "Scatter Chart", "Report"});

        analysisToCharts.put("Average Forest Area",
                new String[]{"Bar Chart", "Line Chart", "Scatter Chart", "Report"});

        analysisToCharts.put("CO2 vs Energy Use vs Air Pollution",
                new String[]{"Bar Chart", "Line Chart", "Scatter Chart", "Report"});

        analysisToCharts.put("CO2 vs GDP per Capita",
                new String[]{"Bar Chart", "Line Chart", "Scatter Chart", "Report"});

        analysisToCharts.put("Education Expenditure vs Health Expenditure",
                new String[]{"Bar Chart", "Line Chart", "Scatter Chart", "Report"});

        analysisToCharts.put("Health Care Access Problems vs Mortality Rate",
                new String[]{"Bar Chart", "Line Chart", "Scatter Chart", "Report"});

        analysisToCharts.put("Health Expenditure vs Hospital Beds",
                new String[]{"Bar Chart", "Line Chart", "Scatter Chart", "Report"});

        analysisToCharts.put("Public Sector Employment Share Male vs Female",
                new String[]{"Bar Chart", "Line Chart", "Pie Chart", "Scatter Chart", "Report"});
    }


    private String yearFromSelected;
    private String yearToSelected;
    private String countrySelected;

    private AnalysisResult result;

    private Map<Grid.GRID_POINT, AnalysisView> views;

    public TopMenuView TopMenu;
    public UI.Grid grid;
    public BottomMenuView BottomMenu;
    public List<AnalysisView>  viewList = new ArrayList<>();

    public ChartGridPane() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(
                "/fxml/ChartGridPane.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    public void onRecalculateClicked(BottomMenuView.RecalculateEvent event) throws
            NoSuchMethodException,
            InvocationTargetException,
            InstantiationException,
            IllegalAccessException,
            WbApiModel.WbApiModelException {
        if (yearFromSelected == null ||
            yearToSelected == null ||
            countrySelected == null ||
            event.getAnalysisName() == null) {
            showWarning("Following fields are required to recalculate: Country, From, To, Analysis method");
            return;
        }
        for (AnalysisView view:
             views.values()) {
            if(!Arrays.stream(analysisToCharts.get(event.getAnalysisName())).toList().contains(view.getViewType())) {
                removeView(view.getViewType());
            }
        }
        if(views.values().stream().map(AnalysisView::getViewType).toList().contains("Pie Chart")) {
            if(!yearToSelected.equals(yearFromSelected)) {
                showWarning("Cannot display a Pie Chart when more then year range is > 1");
                return;
            }
        }

        Class<? extends AbstractAnalyzer> analyzerClass = analyzerTypesToClasses.get(event.getAnalysisName());
        Constructor<? extends AbstractAnalyzer> analyzerConstructor = analyzerClass.getConstructor(
                String.class, String.class, String.class
        );
        AbstractAnalyzer analyzer = analyzerConstructor.newInstance(yearFromSelected, yearToSelected, countrySelected);

        result = analyzer.recalculate();

        for(AnalysisView view: views.values()) {
            if(view != null){
                view.setData(result);
                view.rerender();
            }
        }
    }

    public void onChartAdded(BottomMenuView.SelectedChartEvent event) throws Exception {
        for (AnalysisView view:views.values()) {
            if(view.getViewType().equals(event.getChartName())) {
                showWarning("View is already shown on the screen");
                return;
            }
        }

        if (result == null) {
            // TODO: display a label saying `no data to show`
            showWarning("No data to show");
            return;
        }

        if(event.getChartName().equals("Pie Chart") && !yearToSelected.equals(yearFromSelected)) {
            showWarning("Cannot display a Pie Chart when more then year range is > 1");
            return;
        }

        AnalysisView newView = createAnalysisView(event.getChartName(), result);
        if(newView.getNode() == null) {
            showWarning("Data retrieved from the API was null");
            return;
        }
        viewList.add(newView);
        Grid.GRID_POINT location = grid.addNode(newView.getNode());

        views.put(location, newView);
    }

    public void onChartRemoved(BottomMenuView.SelectedChartEvent event) {
        String chartName = event.getChartName();
        removeView(chartName);
    }

    private void removeView(String viewName) {
        Grid.GRID_POINT toRemove = null;
        for (Grid.GRID_POINT location :
                views.keySet()) {
            if(views.get(location).getViewType().equals(viewName)) {
                grid.removeNode(location);
                toRemove = location;
                break;
            }
        }

        if(toRemove != null) {
            views.remove(toRemove);
        }
    }

    public void onCountryOrYearsSelected(TopMenuView.CountryOrYearsSelectedEvent event) {
        yearFromSelected = event.getFromYear();
        yearToSelected = event.getToYear();
        countrySelected = event.getCountry();
    }

    private static void showWarning(String warning) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.initModality(Modality.APPLICATION_MODAL);
        alert.setContentText(warning);
        alert.showAndWait();
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        int minYear = 1990, maxYear = 2021;

        views = new HashMap<>();
        TopMenu.setAvailableCountries(Arrays.stream(Countries).toList());
        TopMenu.setAvailableFromYears(Arrays.stream(generateYears(minYear, maxYear)).toList());
        TopMenu.availableFromYears.getSelectionModel().selectedItemProperty().addListener(
                (observableValue, oldValue, newValue) -> {
                    System.out.println("old: " + oldValue + ", new: " + newValue);
                    int newYearStart = Integer.parseInt(newValue);
                    TopMenu.setAvailableToYears(Arrays.stream(generateYears(newYearStart, 2021)).toList());
            }
        );

        BottomMenu.setAvailableAnalyses(Arrays.stream(arrayOfAnalysis).toList());

        BottomMenu.availableAnalyses.getSelectionModel().selectedItemProperty().addListener(
                (observableValue, oldValue, newValue) ->
                        BottomMenu.setAvailableCharts(Arrays.stream(analysisToCharts.get(newValue)).toList())
        );
    }

    private String[] generateYears(int startYear, int endYear){
        int size = endYear-startYear;
        String[] years = new String[size+1];

        for(int i=startYear; i<=endYear;i++){
            years[i-startYear]=Integer.toString(i);
        }
        return years;
    }
}
