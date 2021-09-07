package ua.masliy.hw9;

public class Jupiter implements Planet{
    boolean atmosphere = false;
    boolean water = false;
    double radius = 69.911;


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
        return 24.79;
    }
}
