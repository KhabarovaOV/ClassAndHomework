package class_work.classwork_21072022;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        int[][] matrix;
        matrix = new int[8][5];

        int a = 10;
        int b = 99;
        int diff = b - a;
        Random random = new Random();
        int c = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                c = random.nextInt(diff + 1);
                c += a;
                matrix[i][j] = c;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
