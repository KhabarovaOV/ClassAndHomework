package class_work.classwork_17102022.task2;

import java.util.Scanner;

public class Task2 {
    Integer number = 0;
    Integer number1 = 0;

    public static void main(String[] args) {
        Task2 task2 = new Task2();
        task2.getNumberFromConsole();
        task2.getCorrectNumber();
    }


    public void getNumberFromConsole() {
        Scanner sc = new Scanner(System.in);
        String text = null;
        try {
            System.out.println("Please input a number including 0 and 1");
            text = sc.nextLine();
            number = Integer.parseInt(text);
        } catch (NumberFormatException e) {
            System.out.println(text + " is not a number");
            getNumberFromConsole();
        }

    }

    public void getCorrectNumber() {
        try {
            number1 = Integer.parseInt(String.valueOf(number), 2);
            System.out.println(number1);
            System.out.println("Program is finished");
            verifyInputedNumber();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            getNumberFromConsole();
            getCorrectNumber();
        }
    }

    private void verifyInputedNumber() throws IllegalArgumentException {
        if (number1 < -5 || number1 > 5) {
            throw new IllegalArgumentException("Not in range from -5 to 5");
        }
    }
}
