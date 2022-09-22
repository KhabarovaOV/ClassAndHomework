package class_work.classwork_01082022;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text : ");
        String text1 = scanner.nextLine();
        String[] split = text1.split("[\\s:]");
        int count = 0;
        for (String s : split) {
            if (s.length() % 2 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
