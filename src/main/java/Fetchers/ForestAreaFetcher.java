package Fetchers;


public class ForestAreaFetcher extends AbstractFetcher {
    public ForestAreaFetcher(String sYear, String eYear, String country) {
        super(sYear, eYear, country);
        this.indicatorID = "AG.LND.FRST.ZS";
    }
    public String getLabel(){return "ForestArea";}
}