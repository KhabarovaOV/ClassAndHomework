package class_work.classwork_01082022;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text : ");
        String text = scanner.nextLine();

        char[] array = text.toCharArray();
        for (char x : array) {
            if (Character.isUpperCase(x)) {
                System.out.println("This is JAVA language");
                String[] words = text.split("(?=[A-Z])");
                for (String word : words) {

                    char[] chars = word.toCharArray();
                    for (int i = 0; i < chars.length; i++) {
                        char c = chars[i];
                        if (Character.isUpperCase(c)) {
                            chars[i] = Character.toLowerCase(c);
                        }
                    }
                    System.out.print(new String(chars) + "_");

                }
                break;
            }

            else {
                System.out.println("This is C++ language");
                String[] C = text.split("_");

                for (String c1 : C) {
                    c1.replace("_", "");
                    String first = c1.substring(0, 1);
                    first = first.toUpperCase();
                    String second = c1.substring(1);
                    String all = first + second;
                    System.out.print(all);

                }
                break;
            }
        }
    }
}

