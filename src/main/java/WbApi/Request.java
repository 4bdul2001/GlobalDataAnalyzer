package WbApi;

public class Request implements IRequest{
    final private String country;
    final private String indicatorID;
    final private String yearFrom;
    final private String yearTo;

    public Request(String country, String indicatorID
            , String yearFrom, String yearTo){
        this.country = country;
        this.indicatorID = indicatorID;
        this.yearFrom = yearFrom;
        this.yearTo = yearTo;
    }

    public String getCountry() {
        return country;
    }

    public String getIndicatorID() {
        return indicatorID;
    }

    public String getYearFrom() {
        return yearFrom;
    }

    public String getYearTo() {
        return yearTo;
    }

}
