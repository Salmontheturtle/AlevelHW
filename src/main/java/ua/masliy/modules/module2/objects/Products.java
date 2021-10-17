package ua.masliy.modules.module2.objects;

public class Products {
    protected String series;
    protected String screenType;
    protected double price;

    public Products(String series, String screenType, double price) {
        this.series = series;
        this.screenType = screenType;
        this.price = price;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
