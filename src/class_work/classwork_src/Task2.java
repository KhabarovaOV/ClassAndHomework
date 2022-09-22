package class_work.classwork_src;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите час: ");
        int hour = sc.nextInt();
        if(hour <= 6) {
            System.out.println("Ночь");
        }
        else if (hour >6 && hour<= 12) {
            System.out.println("Утро");
        }
        else if (hour >12 && hour<= 18) {
            System.out.println("День");
        }
        else if (hour >18 && hour<=24) {
            System.out.println("Вечер");
        }
        else {
            System.out.println("Не соответствует суткам");
        }
    }
}
