package class_work.classwork_internal_cycles;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int n = key.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
                    }
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
                    }
            System.out.println();
                }

    }
}