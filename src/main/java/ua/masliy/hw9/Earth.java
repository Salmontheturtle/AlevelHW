package ua.masliy.hw9;

public class Earth implements Planet {
    boolean atmosphere = true;
    boolean water = true;
    double radius = 6.371;

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
        return 9.798;
    }
}

