package home_work.homework_08112022.Pr8.task5;

public class Bicycle extends Cycle{

    @Override
    public void ride(){
        wheels = 2;
        System.out.println("Bicycle has " + getWheels());
    }

    public void balance(){
        System.out.println("Bicycle has balance");
    }

}
