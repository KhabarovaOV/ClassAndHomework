package home_work.homework_04;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int [] matrix;
        matrix = new int [13];

        int a = -1000;
        int b = 1000;
        int diff = b-a;
        Random random = new Random();
        int c = 0;



        for (int i =0; i < matrix.length; i++) {
            c = random.nextInt(diff+1);
            c += a;
            matrix[i] = c;
            System.out.print(matrix[i] + " ");
        }

    }
}


