package Fetchers;

public class PublicSectorEmploymentShareMale extends AbstractFetcher {

    public PublicSectorEmploymentShareMale(String sYear, String eYear, String country){
        super(sYear, eYear, country);
        this.indicatorID = "BI.EMP.TOTL.PB.MA.ZS";
    }
    @Override
    public String getLabel() {
        return "Public Sector Employment Share Of Total Employment In Males";
    }
}
