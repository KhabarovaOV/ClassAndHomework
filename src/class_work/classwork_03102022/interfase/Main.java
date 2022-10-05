package class_work.classwork_03102022.interfase;

public class Main {
    public static void main(String[] args) {
       Car [] arr = new Car[2];
       arr[0] = new Mersedes();
       arr[1] = new Volvo();

       for (Car elements: arr){
           elements.assembly();
           elements.brake();
           elements.autoTransmission();
           elements.headlights();
           elements.beep();
           System.out.println();
       }
    }
}
