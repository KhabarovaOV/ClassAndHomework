package class_work.classwork_internal_cycles;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int n = key.nextInt();
        for (int i = n ; i >=0; --i){
            for (int j=n; j> n-i; j--) {
                System.out.print(" ");
            }
            for (int j=n; j>0; j--){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
