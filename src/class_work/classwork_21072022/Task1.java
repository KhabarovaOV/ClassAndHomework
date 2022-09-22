package class_work.classwork_21072022;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слова одной строкой через пробел");
        String text = sc.nextLine();

        int sum = 0;

        if (text.length() != 0){
            sum++;
            for (int i =0; i< text.length(); i++){
                if (text.charAt(i) == ' '){
                    sum++;
                }
            }
        }
        if (text.charAt(text.length()-1) == ' '){
            sum--;
        }
        System.out.println("Вы ввели " + sum + " слова");
    }

}
