package class_work.classwork_01082022;

import java.util.Scanner;

public class Task3 {
    public String str() {
        Scanner cs = new Scanner(System.in);
        System.out.println("Enter text : ");
        String text = cs.nextLine();
        return text;
    }

    public int[] array1(String text) {
        String[] arr = text.split(" ");
        int[] array = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            array[i] = arr[i].length();
        }
        return array;
    }

    public void numbersOfWords(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum / array.length);
    }

    public static void main(String[] args) {
        Task3 stroka = new Task3();
        String s = stroka.str();
        int[] m = stroka.array1(s);
        stroka.numbersOfWords(m);
    }
}
