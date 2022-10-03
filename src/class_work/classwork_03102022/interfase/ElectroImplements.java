package class_work.classwork_03102022.interfase;

public class ElectroImplements implements ElectroCar{
    @Override
    public void collTime(int time) {
        System.out.println("Время гудка: " + time);
    }

    @Override
    public void speed(int speed) {
        System.out.println("Скорость равна " + speed+ "км/ч");

    }
}
