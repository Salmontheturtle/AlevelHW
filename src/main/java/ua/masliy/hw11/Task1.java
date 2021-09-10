package ua.masliy.hw11;

public class Task1 {
    public static void main(String[] args) {
        PlanetEnum earth = PlanetEnum.Earth;
        System.out.println("Количество спутников Земли = " + earth.getSatelliteQuantity());
        PlanetEnum uranus = PlanetEnum.Uranus;
        System.out.println("Количество спутников Урана = " + uranus.getSatelliteQuantity());
        PlanetEnum venus = PlanetEnum.Venus;
        System.out.println("Количество спутников Венеры = " + venus.getSatelliteQuantity());
        PlanetEnum jupiter = PlanetEnum.Jupiter;
        System.out.println("Количество спутников Юпитера = " + jupiter.getSatelliteQuantity());
    }
}
