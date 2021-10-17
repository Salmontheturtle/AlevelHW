package ua.masliy.modules.module2.objects;

public class Telephone extends Products {
    private int model;

    public Telephone(String series, String screenType, double price, int model) {
        super(series, screenType, price);
        this.model = model;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }
}
