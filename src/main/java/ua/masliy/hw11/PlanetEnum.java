package ua.masliy.hw11;

public enum PlanetEnum {
    Earth(1), Venus(0), Jupiter(79), Uranus(27);
    private int satelliteQuantity;
    PlanetEnum(int satelliteQuantity) {
        this.satelliteQuantity = satelliteQuantity;
    }
    public int getSatelliteQuantity() {
        return satelliteQuantity;
    }
}
