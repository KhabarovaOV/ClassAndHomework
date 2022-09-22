package class_work.classwork_src;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        double a,b,c;
        double D;
        System.out.println("введите a, b ? c:");
        Scanner in = new Scanner(System.in);
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        D = b*b-4*a*c;
        if (D>0) {
            double x1, x2;
            x1 = (-b-Math.sqrt(D))/(2*a);
            x2 = (-b+Math.sqrt(D))/(2*a);
            System.out.println("корни найдены: x1 = " + x1 + ", x2 = " +x2);
                    }
        else if (D == 0) {
            double x;
            x = -b/(2*a);
            System.out.println("найден один корень данного уравнения: x = " + x);
                    }
        else {
            System.out.println("корни данного уравнения не найдены!");
        }

    }

}
