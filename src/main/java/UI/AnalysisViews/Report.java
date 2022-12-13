package UI.AnalysisViews;

import Analyzer.AnalysisResult;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Report extends VBox {
    public AnalysisResult result;
    public ArrayList<Map<String, Double>> data;
    @FXML
    public TextArea textAreaReport;
    private static final String INDENT = "\t\t";

    public Report(AnalysisResult result){
        this.result = result;
        this.data = result.getData();

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(
                "/fxml/Report.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    public void generateReport(String analysisMethod){
        String[] Labels = result.getLabels();

        Map<String, Double> yearToValue = data.get(0);
        List<Integer> intYears = new ArrayList<>();
        for (String year:
                yearToValue.keySet()) {
            intYears.add(Integer.parseInt(year));
        }

        Integer minYear = Collections.min(intYears),
                maxYear = Collections.max(intYears);

        StringBuilder reportBuilder = new StringBuilder(analysisMethod + "\n");
        reportBuilder.append("==========================\n");

        for(int i=maxYear; i>=minYear;i--){
            reportBuilder.append("Year " + i + ":\n");
            for(int j=0; j<Labels.length;j++){
                reportBuilder.append(INDENT+Labels[j] + " => " + this.data.get(j).get(Integer.toString(i)) + "\n");
            }
        }
        textAreaReport.appendText(reportBuilder.toString());
    }

    public void setResult(AnalysisResult result){
        this.result = result;
        this.data = result.getData();
    }

}




