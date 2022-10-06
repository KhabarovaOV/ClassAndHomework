package class_work.classwork_03102022.interfase;

public class Volvo implements Car {
    String name = "Volvo";

    @Override
    public void assembly() {
        System.out.println("Сборка автомобиля, начали! " + name);
    }

    @Override
    public void autoTransmission() {
        System.out.println("Переключение передач происходит механически! " + name);
    }

    @Override
    public void brake() {
        System.out.println("Тормоз есть! " + name);
    }

    @Override
    public void headlights() {
        System.out.println("Фары работают! " + name);
    }
}
