package class_work.classwork_src;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        System.out.println("введите номер:");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int x1 = a/100000;
        int x2 = (a/10000)%10;
        int x3 = (a/1000)%10;
        int x4 = (a/100)%10;
        int x5 = (a/10)%10;
        int x6 = a%10;
        if (x1+x2+x3 == x4+x5+x6) {
            System.out.println("билет счастливый");
        }
        else {
            System.out.println("билет не счастливый");
        }
            }
}
