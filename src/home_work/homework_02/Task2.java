package home_work.homework_02;

import java.util.Scanner;

public class Task2 {
    public static void main(String args[]) {
        System.out.println("Орёл или решка: нажми ENTER");
        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();
        int a = 1;
        int b = 2;
        int random_number1 = a + (int) (Math.random() * b);
        if (random_number1==1){
            System.out.println("Орёл");
        }
        else {
            System.out.println("Решка");
        }
    }
}