package home_work.homework_27102022.task1;

public class Task1 {
    int x = 0;
    Integer y = 0;

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.numbersOne();
        task1.sout();
        task1.numbersTwo();
    }

    public void numbersOne() {
        long xStart = System.currentTimeMillis();
        for (int i = 0; i <= 1000000; i++) {
            x++;
        }
        long xEnd = System.currentTimeMillis();
        System.out.println("Время расчета для переменной int: " + (xEnd - xStart) + " ms");
    }

    public void numbersTwo() {
        long yStart = System.currentTimeMillis();
        for (int i = 0; i <= 1000000; i++) {
            y++;
        }
        long yEnd = System.currentTimeMillis();
        System.out.println("Время расчета для переменной Integer: " + (yEnd - yStart) + " ms");
    }

    public void sout(){
        System.out.println();
    }
}
