package class_work.classwork_21072022;

import java.util.Random;
import java.util.stream.IntStream;

public class Task4 {
    public static void main(String[] args) {
        int[][] matrix;
        matrix = new int[2][5];

        int a = 0;
        int b = 5;
        int diff = b - a;
        Random random = new Random();
        int c = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                c = random.nextInt(diff + 1);
                c += a;
                matrix[i][j] = c;
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }


        for (int i = 0; i < matrix.length; i++) {
            int total = IntStream.of(matrix[i]).sum();
            int sum = total / 5;

            for (int j = 0; j < matrix[i].length; i++) {
                int total2 = IntStream.of(matrix[i]).sum();
                int sum2 = total2 / 5;
                if (sum < sum2) {
                    System.out.println("Среднее арифметическое 2 строки : " + sum2 + " больше среднего арифметического 1 строки : " + sum);
                }
                System.out.println("Среднее арифметическое 1 строки : " + sum + " больше среднего арифметического 2 строки : " + sum2);

            }

        }



    }
}
