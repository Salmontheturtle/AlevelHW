package ua.masliy.hw9;

import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
            Earth earth = (Earth) obj;
            return Double.compare(earth.gravitationalAcceleration(), gravitationalAcceleration()) == 0
                    && atmosphere == earth.atmosphere && water == earth.water && earth.radius == radius;

    }

    @Override
    public int hashCode() {
        return Objects.hash(gravitationalAcceleration(), atmosphere, water, radius);
    }
}

