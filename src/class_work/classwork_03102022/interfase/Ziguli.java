package class_work.classwork_03102022.interfase;

public interface Ziguli extends Car {
    default void timeIgnition(){
        System.out.println("Жигули класс!");
    }
}
