package Fetchers;


public class Co2Fetcher extends AbstractFetcher{
    public Co2Fetcher(String sYear, String eYear, String country){
        super(sYear, eYear, country);
        this.indicatorID = "EN.ATM.CO2E.PC";
    }

    public String getLabel(){return "CO2";}
}