package class_work.classwork_10112022.mnogopotochnost.exemple;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainOne {
    public static void main(String[] args) {
        SchetOne schetOne = new SchetOne();

        Person p1 = new Person();
        p1.name = "Katya";
        p1.summ = 180;

        Person p2 = new Person();
        p2.name = "Maria";
        p2.summ = 250;

        ManagerShet tranzakciya1 = new ManagerShet(schetOne, p1);
        ManagerShet tranzakciya2 = new ManagerShet(schetOne, p2);

        ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        service.execute(tranzakciya1);
        service.execute(tranzakciya2);

        service.shutdown();

        System.out.println("hello from main");
    }
}
