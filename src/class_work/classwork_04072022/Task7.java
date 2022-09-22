package class_work.classwork_04072022;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите величину вклада: ");
        int a = sc.nextInt();
        double p = 5.6;
        double q = a*p/100;
        double sum = a+q;
        double n = sum*p/100;
        double summ= sum+n;
        System.out.println("Величина вклада через 2 года состовляет:" + summ);
    }
}
