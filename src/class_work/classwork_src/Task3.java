package class_work.classwork_src;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("1-Кошка");
        System.out.println("2-Собака");
        System.out.println("3-Петух");
        System.out.println("4-Лошадь");
        System.out.println("5-Овечка");
        System.out.println("6-Корова");
        System.out.println("7-Волк");
        System.out.println("8-Кукушка");
        System.out.println("9-Воробей");
        System.out.println("10-Ворона");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер выбранного животного:");
        int a = sc.nextInt();

        switch (a){
            case (1): {
                System.out.println("Кошка: мяу-мяу");
                break;
            }
            case (2): {
                System.out.println("Собака: гаф-гаф");
                break;
            }
            case (3): {
                System.out.println("Петух: ку-кареку");
                break;
            }
            case (4): {
                System.out.println("Лошадь: и-го-го");
                break;
            }
            case (5): {
                System.out.println("Овечка: бее-бее");
                break;
            }
            case (6): {
                System.out.println("Корова: му-му");
                break;
            }
            case (7): {
                System.out.println("Волк: ау-ууу");
                break;
            }
            case (8): {
                System.out.println("Кукушка: ку-ку");
                break;
            }
            case (9): {
                System.out.println("Воробей: чирик-чирик");
                break;
            }case (10): {
                System.out.println("Ворона: кар-кар");
                break;
            }
        }
    }
}
