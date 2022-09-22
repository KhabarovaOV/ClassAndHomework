package class_work.classwork_21072022;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = 0;
        while (n <= 3) {
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n <= 3) {
                    System.out.println("Введите число больше 3: ");
                }
            }
        }

        int[] matrix;
        matrix = new int[n];
        int a = 0;
        int b = n;
        int diff = b - a;
        Random random = new Random();
        int c = 0;
        for (int i = 0; i < matrix.length; i++) {
            c = random.nextInt(diff + 1);
            c += a;
            matrix[i] = c;

        }
        System.out.println(Arrays.toString(matrix));

        int [] matrix2 = new int[c];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if(matrix[i]%2 == 0){
                matrix2[index] = matrix[i];
                index++;
            }
        }
        System.out.print(Arrays.toString(matrix2));
    }

}

