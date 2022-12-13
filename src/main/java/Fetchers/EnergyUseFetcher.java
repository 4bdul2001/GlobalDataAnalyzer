package Fetchers;


public class EnergyUseFetcher extends AbstractFetcher {
    public EnergyUseFetcher(String sYear, String eYear, String country) {
        super(sYear, eYear, country);
        this.indicatorID = "EG.USE.PCAP.KG.OE";
    }
    public String getLabel(){return "EnergyUse";}
}