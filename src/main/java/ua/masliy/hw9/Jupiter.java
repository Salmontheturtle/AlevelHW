package ua.masliy.hw9;

import java.util.Objects;

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


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Jupiter jupiter = (Jupiter) obj;
        return Double.compare(jupiter.gravitationalAcceleration(), gravitationalAcceleration()) == 0
                && atmosphere == jupiter.atmosphere && water == jupiter.water && jupiter.radius == radius;

    }

    @Override
    public int hashCode() {
        return Objects.hash(gravitationalAcceleration(), atmosphere, water, radius);
    }
}
