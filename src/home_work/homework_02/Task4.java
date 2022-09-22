package home_work.homework_02;

public class Task4 {
    public static void main(String args[]) {
        int a = 0;
        int b = 10;

        int random_number1 = a + (int) (Math.random() * b);
        int random_number2 = a + (int) (Math.random() * b);
        int random_number3 = a + (int) (Math.random() * b);

        System.out.print(random_number1);
        System.out.print(random_number2);
        System.out.print(random_number3);
        System.out.println();

        if (random_number1 == 0 || random_number2 == 0 || random_number3 == 0) {
            return;
        }

        int c = (random_number1 + random_number2 + random_number3) / 3;
        System.out.println(c);
    }
}
