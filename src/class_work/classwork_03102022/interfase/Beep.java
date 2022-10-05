package class_work.classwork_03102022.interfase;

public interface Beep  {
    default void beep(){
        System.out.println("Гудок гудит!");
    }
}
