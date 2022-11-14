package home_work.homework_10.task5;

public class BaseClass {

    private int count = 0;

    public void doSmth(){
        new BaseClass(){
            public void doSmthAnonimus(){
                System.out.println("Hello from anonimusClass");
                super.count = 15;
                super.showCount();
            }
        }.doSmthAnonimus();
    }

    private  void showCount(){
        System.out.println("Count = " + count);
    }
}
