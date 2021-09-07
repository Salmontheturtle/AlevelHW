package ua.masliy.hw7;


public class Vector {
    double x;
    double y;
    double z;
    @Override
    public String toString() {
        return "Vector {" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
    public Vector(double x1, double y1, double z1, double x2, double y2, double z2) {
        this.x = x2 - x1;
        this.y = y2 - y1;
        this.z = z2 - z1;
    }
    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Vector() {
    }
    public Vector random() {
        double x = (Math.random() * (100 + 1) - 1);
        double y = (Math.random() * (100 + 1) - 1);
        double z = (Math.random() * (100 + 1) - 1);
        return new Vector(x, y, z);
    }
    public static Vector[] randomArr(int arrLength) {
        Vector[] array = new Vector[arrLength];
        for (int i = 0; i < arrLength; i++) {
            array[i] = new Vector().random();
        }
        return array;
    }
    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }
    public Vector vectorMult(Vector vector) {
        return new Vector(this.y * vector.z - this.z * vector.y, this.z * vector.x - this.x * vector.z,
                this.x * vector.y - this.y * vector.x);
    }
    public double cos(Vector vector) {
        double scalarMult = this.x * vector.x + this.y * vector.y + this.z * vector.z;
        return (scalarMult) / (length() * vector.length());
    }
    public Vector sum(Vector vector) {
        return new Vector(this.x + vector.x, this.y + vector.y, this.z + vector.z);
    }
    public Vector diff(Vector vector) {
        return new Vector(this.x - vector.x, this.y - vector.y, this.z - vector.z);
    }
}