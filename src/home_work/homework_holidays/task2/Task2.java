package home_work.homework_holidays.task2;

public class Task2<x> {
    private  int x;
    private  int y;
    public static void one (){
        int a = 12;
        System.out.println(a);
    }
    public void two (){
        this.x = 10;
        System.out.println(x);
    }

    public static void main(String[] args) {
        Task2 name = new Task2 ();
        name.one();
        name.two();
    }
}
