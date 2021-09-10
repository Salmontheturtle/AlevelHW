package ua.masliy.hw9;

import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Venus venus = (Venus) obj;
        return Double.compare(venus.gravitationalAcceleration(), gravitationalAcceleration()) == 0
                && atmosphere == venus.atmosphere && water == venus.water && venus.radius == radius;

    }

    @Override
    public int hashCode() {
        return Objects.hash(gravitationalAcceleration(), atmosphere, water, radius);
    }
}
