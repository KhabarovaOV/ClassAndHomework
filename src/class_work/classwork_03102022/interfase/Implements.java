package class_work.classwork_03102022.interfase;

public class Implements implements BMW,Mersedes,Ziguli{
    @Override
    public void timeStart(int start) {
        System.out.println("Время набора скорости " + start);
    }

    @Override
    public void fuelConsumptionTime(int consumption) {
        System.out.println("Время движения " + consumption);
    }

    @Override
    public void collTime(int time) {
        System.out.println("Время гудка равно " + time);
    }

    @Override
    public void speed(int speed) {
        System.out.println("Скорость не главное" + speed);
    }
}
