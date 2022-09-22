package class_work.classwork_src;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координату первой точки x = : ");
        int x = sc.nextInt();
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите координату первой точки y = : ");
        int y = sc.nextInt();

        Scanner scnm = new Scanner(System.in);
        System.out.println("Введите координату второй точки x = : ");
        int x1 = sc.nextInt();
        Scanner scnmm = new Scanner(System.in);
        System.out.println("Введите координату второй точки y = : ");
        int y1 = sc.nextInt();
        if(x == x1 && y != y1) {
            System.out.println("Ровная дорога");
        }
        else if (x < x1 && y1 > y) {
            System.out.println("Подъём");}
        else if (x1 < x && y < y1) {
            System.out.println("Спуск");}
        else if (x1 > x && y == y1) {
            System.out.println("Отвес");}
    }
}