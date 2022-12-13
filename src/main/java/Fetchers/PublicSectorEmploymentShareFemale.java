package Fetchers;

public class PublicSectorEmploymentShareFemale extends AbstractFetcher {

    public PublicSectorEmploymentShareFemale(String sYear, String eYear, String country){
        super(sYear, eYear, country);
        this.indicatorID = "BI.EMP.TOTL.PB.FE.ZS";
    }
    @Override
    public String getLabel() {
        return "Public Sector Employment Share Of Total Employment In Females";
    }
}
