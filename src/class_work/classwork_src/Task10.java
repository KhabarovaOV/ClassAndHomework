package class_work.classwork_src;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер квартиры: ");
        int n = sc.nextInt();
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите количество квартир на 1 этаже: ");
        int m = sc.nextInt();
        int z = m*9;
        if (n>0 && n<=z) {
            System.out.println("Квартира находится в 1 подъезде");
        }
        else if (n>z && n<=z*2){
            System.out.println("Квартира находится в 2 подъезде");
        }
        else if (n>z*2 && n<=z*3){
            System.out.println("Квартира находится в 3 подъезде");
        }
        else if (n>z*3 && n<=z*4){
            System.out.println("Квартира находится в 4 подъезде");
        }
        else if (n>z*4 && n<=z*5){
            System.out.println("Квартира находится в 5 подъезде");
        }
        else if (n>z*5 && n<=z*6){
            System.out.println("Квартира находится в 6 подъезде");
        }

    }
}
