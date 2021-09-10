package ua.masliy.hw9;

import java.util.Objects;

public class Uranus implements Planet {
    boolean atmosphere = false;
    boolean water = false;
    double radius = 25.362;


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
        Uranus uranus = (Uranus) obj;
        return Double.compare(uranus.gravitationalAcceleration(), gravitationalAcceleration()) == 0
                && atmosphere == uranus.atmosphere && water == uranus.water && uranus.radius == radius;

    }

    @Override
    public int hashCode() {
        return Objects.hash(gravitationalAcceleration(), atmosphere, water, radius);
    }
}
