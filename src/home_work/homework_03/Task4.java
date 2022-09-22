package home_work.homework_03;

public class Task4 {
    public static void main(String[] args) {
        boolean a = true;
        for (int i = 2; i <= 10000; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    a = false;
                    break;
                }
            }
            if (a) System.out.println(i);a=true;
        }
    }
}
