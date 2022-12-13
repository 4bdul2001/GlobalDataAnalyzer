package Analyzer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AnalysisResult {
    private String[] Labels;
    private ArrayList<Map<String, Double>> Data;

    public AnalysisResult(ArrayList<Map<String, Double>> Data, String[] Label){
        this.Labels = Label;
        this.Data = Data;
    }

    public ArrayList<Map<String, Double>> getData(){
        return this.Data;
    }

    public String[] getLabels(){
        return this.Labels;
    }

    public Map<String, Double> getValues(int year){
        Map<String, Double> results = new HashMap<>();

        for(int i = 0; i<this.Data.size(); i++){
            results.put(this.Labels[i], this.Data.get(i).get(Integer.toString(year)));
        }
        return results;
    }
}
