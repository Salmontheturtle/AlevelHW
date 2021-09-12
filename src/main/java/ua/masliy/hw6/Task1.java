package ua.masliy.hw6;

public class Task1 {

    public static void main(String[] args) {
	// write your code here
        Phone iPhone = new Phone();
        iPhone.model = "iPhone X";
        iPhone.number = 380509914;
        iPhone.weight = 185.6;
        System.out.println(iPhone.model);
        System.out.println(iPhone.weight);
        System.out.println(iPhone.number);

        System.out.println("  ");

        iPhone.recieveCall("Ilya");

        System.out.println("  ");
        System.out.println("  ");
        System.out.println("  ");

        Phone samsung = new Phone();
        samsung.model = "Galaxy s21";
        samsung.number = 380963981;
        samsung.weight = 224.5;
        System.out.println(samsung.model);
        System.out.println(samsung.weight);
        System.out.println(samsung.number);

        System.out.println("  ");

        samsung.recieveCall("Artem");

        System.out.println("  ");
        System.out.println("  ");
        System.out.println("  ");

        Phone xiaomi = new Phone();
        xiaomi.weight = 256.2;
        xiaomi.model = "Mi 11 Ultra";
        xiaomi.number = 380772839;
        System.out.println(xiaomi.model);
        System.out.println(xiaomi.weight);
        System.out.println(xiaomi.number);

        System.out.println("  ");

        xiaomi.recieveCall("Vadim");
    }
}
