package ua.Masliy.HW6;

public class Phone {
    public int number;
    public String model;
    public double weight;

    public void setNumber (int num) {
        number = num;
    }

    public int getNumber () {
        return number;
    }

    public void recieveCall(String name) {
        System.out.println("Звонит " + name + "\n" + "+" + getNumber());
    }

    public Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
        System.out.print(number + " " + model + " " + weight);
    }
    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
        System.out.print(number + " " + model);
    }
    public Phone() {

    }
}
