package class_work.classwork_04072022;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число для проверки: ");
        double v = sc.nextDouble();
        if ((v%1) != 0) {
            System.out.println("not a integer");
        } else {
            System.out.println("integer");

        }}
    }
