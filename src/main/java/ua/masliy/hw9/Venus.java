package ua.masliy.hw9;

public class Venus implements Planet{
    boolean atmosphere = false;
    boolean water = false;
    double radius = 6.051;


    public boolean atmospherePresence() {
        return atmosphere;
    }

    public boolean waterPresence() {
        return water;
    }

    public double planetRadius() {
        return radius;
    }
    @Override
    public double gravitationalAcceleration() {
        return 8.87;
    }
}
