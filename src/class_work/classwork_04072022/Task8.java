package class_work.classwork_04072022;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        final int s = 5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите скорость распространения звука: ");
        double v = sc.nextDouble();
        double m = s*v;
        System.out.println("Расстояние до места удара молнии: " +m);
    }
}
