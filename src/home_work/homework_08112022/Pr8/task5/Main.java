package home_work.homework_08112022.Pr8.task5;

import java.util.ArrayList;
import java.util.List;

public class Main {
       public static void main(String[] args) {
        List<Cycle> cycles = new ArrayList<>();
        //Upcasting
        cycles.add(new Unicycle());
        cycles.add(new Bicycle());
        cycles.add(new Tricycle());
        System.out.println(cycles.get(0) instanceof Cycle);
        for (Cycle c: cycles) {
            c.ride();
        }
        //downcusting
        Unicycle unicycle =(Unicycle) cycles.get(0);
        Bicycle bicycle =(Bicycle) cycles.get(1);
        Tricycle tricycle =(Tricycle) cycles.get(2);
        unicycle.ride();
        bicycle.ride();
        tricycle.ride();
        System.out.println(unicycle instanceof Cycle);
    }

   /* public static void main(String[] args) {
        List<Cycle> cycles = new ArrayList<>();

        //Upcasting
        cycles.add(new Unicycle());
        cycles.add(new Bicycle());
        cycles.add(new Tricycle());

        for (Cycle c: cycles) {
            //c.balance();
        }

        //downcusting
        Unicycle unicycle =(Unicycle) cycles.get(0);
        Bicycle bicycle =(Bicycle) cycles.get(1);
        Tricycle tricycle =(Tricycle) cycles.get(2);
        unicycle.balance();
        bicycle.balance();
        tricycle.balance();
    }*/
}
