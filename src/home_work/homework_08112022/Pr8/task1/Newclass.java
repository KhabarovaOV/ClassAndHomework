package home_work.homework_08112022.Pr8.task1;

public class Newclass extends Detergent{
    void scrub(){
        System.out.println("Один-один");
    }
    void scrub(String s){
        System.out.println("Перегрузка один");
    }
    void sterilize(){
        System.out.println("Новый метод");
    }

}
