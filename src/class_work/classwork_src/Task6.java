package class_work.classwork_src;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите год: ");
        int g = sc.nextInt();
        if (g%4 ==0) {
            System.out.println(g + " является высокосным");
        }
        else {
            System.out.println(g + " не является высокосным");
        }

    }
}
