package class_work.classwork_01082022;

import java.util.Scanner;

public class Task1 {
    public void text() {
        Scanner text1 = new Scanner(System.in);
        System.out.println("Enter text : ");

        String text11 = text1.nextLine();
        Scanner text2 = new Scanner(System.in);
        System.out.println("Enter symbol : ");
        String text22 = text2.nextLine();
        char[] symbol = text11.toCharArray();
        int n = 0;
        for (int i = 0; i < symbol.length; i++) {
            if (symbol[i] == text22.charAt(0)) {
                System.out.println("Index " + i);
                n++;
            }
        }
        System.out.println("the number of letters is " + n);
    }

    public static void main(String[] args) {
        Task1 name = new Task1();
        name.text();
    }
}
