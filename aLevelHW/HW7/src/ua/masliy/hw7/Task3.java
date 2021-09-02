package ua.masliy.hw7;

public class Task3 {
    public static void main(String[] args) {
        Vector vector1 = new Vector(3, -2, -1, 2, 5, 6);
        Vector vector2 = new Vector(2, 3, 4);
        Vector vector3 = new Vector().random();
        System.out.println("vector1 length = " + vector1.length());
        System.out.println("vector2 length = " + vector2.length());
        System.out.println("vector3 length = " + vector3.length());
        System.out.println("vector1 x vector2 = " + vector1.vectorMult(vector2));
        System.out.println("vector1 + vector2 = " + vector1.sum(vector2));
        System.out.println("vector1 - vector2 = " + vector1.diff(vector2));
        System.out.println("cos φ = " + vector1.cos(vector2));
        Vector[] array = Vector.randomArr(3);
        for (int i = 0; i < array.length; i++) {
            System.out.println("vector[" + i + "] = " + array[i]);
        }
    }
}
