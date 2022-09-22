package class_work.classwork_04072022;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество секунд: ");
        double s = sc.nextDouble();
        short d = (short) (s/86400);
        System.out.println("Количество дней: " + d);
        short h = (short) ((s/3600)-(d*24));
        System.out.println("Количество часов: " + h);
        short c = (short) (s%3600);
        System.out.println("Количество секунд: " + c);
    }
}
