package home_work.homework_nasledovanie_01102022.task1;

public class Main extends One{
    void mod(int a, double b){
        System.out.println(a*b);
    }

    public static void main(String[] args) {
        One operation = new One();
        operation.mod(12,4);
        operation.mod(12.4,10.1);
        operation.mod(12.6, 2);
        operation.mod(5, 1.3);
    }
}
