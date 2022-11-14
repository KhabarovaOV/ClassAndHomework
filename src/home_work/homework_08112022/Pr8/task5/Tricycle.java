package home_work.homework_08112022.Pr8.task5;

public class Tricycle extends Cycle{
    @Override
    public void ride() {
        wheels = 3;
        System.out.println("Tricycle has " + getWheels() + "wheels");
    }

    public void balance(){
        System.out.println("Tricycle has balance");
    }
}
