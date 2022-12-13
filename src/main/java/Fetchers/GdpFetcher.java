package Fetchers;


public class GdpFetcher extends AbstractFetcher {
    public GdpFetcher(String sYear, String eYear, String country) {
        super(sYear, eYear, country);
        this.indicatorID = "NY.GDP.PCAP.CD";
    }
    public String getLabel(){return "GDP";}
}