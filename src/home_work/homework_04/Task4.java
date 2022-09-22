package home_work.homework_04;

public class Task4 {
    public static void main(String[] args) {
        String[][] arrayButterfly = {
                {"1", "1", "1", "1", "1"},
                {"0", "1", "1", "1", "0"},
                {"0", "0", "1", "0", "0"},
                {"0", "1", "1", "1", "0"},
                {"1", "1", "1", "1", "1"}
        };
        for (int i = 0; i < arrayButterfly.length; i++) {
            for (int j = 0; j < arrayButterfly.length; j++) {
                System.out.print(" " + arrayButterfly[i][j] + " ");
            }
            System.out.println();
        }

    }
}

