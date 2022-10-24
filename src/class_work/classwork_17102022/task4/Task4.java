package class_work.classwork_17102022.task4;

import java.util.Scanner;

public class Task4 {
    int [] num;
    public static void main(String[] args) {
        Task4 task4 = new Task4();
        task4.getText();
        task4.sumOfNumber();
    }

    public void getText() {
       Scanner sc = new Scanner(System.in);
        String text = null;
        try {
            System.out.println("Please input sum number");
            text = sc.nextLine();

            String[] text1 = text.split("\\+");
            num = new int[text1.length];
            for (int i = 0; i < num.length; i++) {
                num[i] = Integer.parseInt(text1[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println(text + " is not a number");
            getText();
        }
    }

    private void sumOfNumber() {
        int sum = 0;
        for (int x: num
             ) {
            sum += x;
        }
        System.out.println("Sum of number is: " + sum);
    }

}
