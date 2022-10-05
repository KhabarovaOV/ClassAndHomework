package class_work.classwork_03102022.interfase;

public class Mersedes implements Car {
    String name = "Mersedes";

    @Override
    public void assembly() {
        System.out.println("Сборка автомобиля!" + name);
    }

    @Override
    public void autoTransmission() {
        System.out.println("Переключение передач происходит автоматически!" + name);
    }

    @Override
    public void brake() {
        System.out.println("Тормоз есть, ура!" + name);
    }

    @Override
    public void headlights() {
        System.out.println("Фары не работают!" + name);
    }
}
