package class_work.classwork_src;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение x: ");
        int x = sc.nextInt();
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите значение y: ");
        int y = sc.nextInt();
        if(x >0 && y > 0) {
            System.out.println("Точка находится в 1 четверти");
        }
        else if (x <0 && y > 0) {
            System.out.println("Точка находится в 2 четверти");}
        else if (x <0 && y < 0) {
            System.out.println("Точка находится в 3 четверти");}
        else if (x >0 && y < 0) {
            System.out.println("Точка находится в 4 четверти");}
    }
}
