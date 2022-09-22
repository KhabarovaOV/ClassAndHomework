package class_work.classwork_21072022;

import java.util.Scanner;

public class Calculator {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Calculator name = new Calculator();
        int num1 = name.getInt();
        char operation = name.getOperation();
        int num2 = name.getInt();
        int result = name.calc(num1, operation, num2);
        System.out.println("Result operation: " + result);
    }

    public int getInt() {
        System.out.println("Vvedite chislo: ");
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Vi ne vveli chislo, vvedite povtorno");
            scanner.next();
            num = getInt();
        }
        return num;
    }

    public char getOperation() {
        System.out.println("Vvedite operation: ");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Vi vveli ne pravilnoe znachenie operetion, vvedite povtorno");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public int calc(int num1, char operation, int num2) {
        int result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Operation not understend, again vvod");
                result = calc(num1, getOperation(), num2);

        }
        return result;

    }
}
