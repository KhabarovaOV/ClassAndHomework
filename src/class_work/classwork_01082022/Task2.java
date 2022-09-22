package class_work.classwork_01082022;

import java.util.Scanner;

public class Task2 {
    public String string() {
        String m = "";
        for (int i = 1; i < 1000; i++) {
            if (m.length() >= 1000) {
                break;
            } else {
                m = m + i;
            }
        }
        System.out.println(m);
        return m;
    }

    public void index(String m) {
        Scanner scan = new Scanner(System.in);
        int indexOfNumber = scan.nextInt();
        System.out.println(m.charAt(indexOfNumber));
    }

    public static void main(String[] args) {
        Task2 name = new Task2();
        String str = name.string();
        name.index(str);
    }
}
