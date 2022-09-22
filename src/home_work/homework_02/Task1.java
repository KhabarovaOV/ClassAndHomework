package home_work.homework_02;

public class Task1 {
        int storage (String s) {
        return s.length()*2;
    }

    public static void main(String[] args) {
        Task1 name = new Task1();
        System.out.println(name.storage("Hello"));
    }
}
