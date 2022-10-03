package home_work.homework_nasledovanie_01102022.task2;

public class One {
    One(int a){
        System.out.println("Конструктор: a = " + a);
        System.out.println("Finish.");
    }
    {
        int b = 13;
        System.out.println("Объектный блок: b = " + b);
        System.out.println("Second.");
        System.out.println();
    }
    static{
        int c = 25;
        System.out.println("статический блок: c = " + c);
        System.out.println("First.");
        System.out.println();
    }
}
