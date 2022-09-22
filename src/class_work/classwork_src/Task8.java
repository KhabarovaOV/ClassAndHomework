package class_work.classwork_src;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение x: ");
        int x = sc.nextInt();
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите значение y: ");
        int y = sc.nextInt();
        if(x%2 ==0 && y%2 ==0) {
            System.out.println("YES");
        }
        if(x%2 ==0 && y%2 !=0) {
            System.out.println(" ");
        }
        if(x%2 !=0 && y%2 !=0) {
            System.out.println("YES");
        }
        if(x%2 !=0 && y%2 ==0) {
            System.out.println(" ");
        }
}
}
