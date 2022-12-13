package Fetchers;

import WbApi.*;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractFetcher {

    protected String indicatorID;
    protected String country;
    protected String startYear;
    protected String endYear;
    protected IWbApiModel model;

    public AbstractFetcher(String sYear, String eYear, String country){
        this.model = new WbApiModel();
        this.country = country;
        this.startYear = sYear;
        this.endYear = eYear;
    }

    public Map<String, Double> getData() throws WbApiModel.WbApiModelException {
        IResponse response = generateResponse();

        Map<String, Double> data = new HashMap<String, Double>();
        int sizeOfResults = response.getSize();

        for(int i=0; i<sizeOfResults;i++){
            if (Integer.parseInt(this.startYear)<=Integer.parseInt(this.endYear)){
                data.put(Integer.toString(Integer.parseInt(this.startYear) + i),
                        response.getValue(Integer.parseInt(this.startYear)+ i));
            } else {
                data.put(Integer.toString(Integer.parseInt(this.endYear) + i),
                        response.getValue(Integer.parseInt(this.endYear)+ i));
            }
        }
        return data;
    }

    private Response generateResponse() throws WbApiModel.WbApiModelException {
        Request request = new Request(this.country, this.indicatorID
                , this.startYear, this.endYear);
        return this.model.getData(request);
    }

    public String getStartYear() {
        return startYear;
    }

    public void setStartYear(String startYear) {
        this.startYear = startYear;
    }

    public String getEndYear() {
        return endYear;
    }

    public void setEndYear(String endYear) {
        this.endYear = endYear;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public abstract String getLabel();



}
