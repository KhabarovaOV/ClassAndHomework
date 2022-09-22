package class_work.classwork_21072022;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        int [] matrix;
        matrix = new int [12];

        int a = -15;
        int b = 15;
        int diff = b-a;
        Random random = new Random();
        int c = 0;

        int maxNumber = 0;

        for (int i =0; i < matrix.length; i++) {
            c = random.nextInt(diff+1);
            c += a;
            matrix[i] = c;
            System.out.print(matrix[i] + " ");
        }
        for (int j =0; j <matrix.length; j++){
            if (maxNumber<matrix[j]){
                maxNumber = matrix[j];
            }
        }
        System.out.println();
        System.out.println ("Max Number is : " + maxNumber);
    }
}
