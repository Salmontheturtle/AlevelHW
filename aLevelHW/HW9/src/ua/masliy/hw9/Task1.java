package ua.masliy.hw9;

public class Task1 {

    public static void main(String[] args) {
        // write your code here
        Earth earth = new Earth();
        Uranus uranus = new Uranus();
        Venus venus = new Venus();
        Jupiter jupiter = new Jupiter();
        System.out.println("Земля: ");
        System.out.println("Атмосфера: " + earth.atmospherePresence());
        System.out.println("Вода: " + earth.waterPresence());
        System.out.println("Радиус равен: " + earth.planetRadius() + "км");
        System.out.println("Ускорение свободного падения равно: " + earth.gravitationalAcceleration() + " м/сек");

        System.out.println("Уран: ");
        System.out.println("Атмосфера: " + uranus.atmospherePresence());
        System.out.println("Вода: " + uranus.waterPresence());
        System.out.println("Радиус равен: " + uranus.planetRadius() + "км");
        System.out.println("Ускорение свободного падения равно: " + uranus.gravitationalAcceleration() + " м/сек");

        System.out.println("Венера: ");
        System.out.println("Атмосфера: " + venus.atmospherePresence());
        System.out.println("Вода: " + venus.waterPresence());
        System.out.println("Радиус равен: " + venus.planetRadius() + "км");
        System.out.println("Ускорение свободного падения равно: " + venus.gravitationalAcceleration() + " м/сек");

        System.out.println("Юпитер: ");
        System.out.println("Атмосфера: " + jupiter.atmospherePresence());
        System.out.println("Вода: " + jupiter.waterPresence());
        System.out.println("Радиус равен: " + jupiter.planetRadius() + "км");
        System.out.println("Ускорение свободного падения равно: " + jupiter.gravitationalAcceleration() + " м/сек");
    }
}
