package ua.masliy.hw6;

public class Task2 {
    public static void main(String[] args) {
    int[][] triangle = new int[5][];

    triangle[0] = new int[1];
    triangle[1] = new int[2];
    triangle[2] = new int[3];
    triangle[3] = new int[4];
    triangle[4] = new int[5];

    for (int i = 0; i < triangle.length; i++) {
        System.out.println(triangle.length + "!");
        System.out.println("i = " + i);
        for (int j = 0; j < triangle[i].length; j++) {
            System.out.println(triangle[i].length);
            triangle[i][j] = 0;
        }

    }

    for (int i = 0; i < triangle.length; i++) {
        for (int j = 0; i < triangle[i].length; j++) {
            System.out.print(triangle[i][j] + " ");
        }
        System.out.println();
    }

}
}
//Ну я зашёл в дебаггер, поставил брейкпоинт на 25 строке, тк компилятор на неё ругался,
// прокрутил несколько раз и увидел что i не увеличивается, так я понял что-то не так с i,
//и заметил i вместо j, так и устранил ошибку. Хз что ещё можно написать, правда хаха
