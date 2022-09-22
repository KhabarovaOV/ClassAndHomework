package class_work.classwork_01082022;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter line");
        String userInput = scan.next(); // Работает если вводить без пробелов
        int length = userInput.length();
        int m, j, i, n = 0;
        for (m = length % 2 > 0 ? 1 : 2; m < length * 2; m += 2) {
            i = m < length ? m : length * 2 - m;
            for (j = 0; j < length - 1 - i / 2; ++j) {
                System.out.print(" ");
            }

            for(j = 0; j < i; ++j) {
                char c = userInput.charAt(n++ % length);
                c = j == 0 ? Character.toUpperCase(c) : Character.toLowerCase(c);
                System.out.print(c);
            }

            System.out.println("");
        }
    }
    /*public static String removeSpace(String userInput) {
        String withoutspaces = "";
        for (int i = 0; i < userInput.length(); i++) {
            if (userInput.charAt(i) != ' ')
                withoutspaces += userInput.charAt(i);
        }
        return withoutspaces;

    }*/
}
