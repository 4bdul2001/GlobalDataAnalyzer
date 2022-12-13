package Fetchers;

public class PopulationFetcher extends AbstractFetcher{
    public PopulationFetcher(String sYear, String eYear, String country){
        super(sYear, eYear, country);
        this.indicatorID = "SP.POP.TOTL";
    }
    public String getLabel(){return "Population";}
}

