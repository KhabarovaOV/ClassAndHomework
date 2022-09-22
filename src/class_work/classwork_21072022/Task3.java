package class_work.classwork_21072022;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] matrix;
        matrix = new int[8];

        int a = 1;
        int b = 10;
        int diff = b - a;
        Random random = new Random();
        int c = 0;
        for (int i = 0; i < matrix.length - 1; i++) {
            c = random.nextInt(diff + 1);
            c += a;
            matrix[i] = c;
            System.out.print(matrix[i] + " ");
        }
        System.out.println();
        int t = 0;
        for (int i = 0; i < matrix.length - 1; i++) {
            if (i % 2 == 1) {
                matrix[i] = 0;
            }
            System.out.print(matrix[i] + " ");
        }
    }
}
