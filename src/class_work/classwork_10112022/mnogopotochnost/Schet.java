package class_work.classwork_10112022.mnogopotochnost;

public class Schet extends Thread{
    private int schet = 200;
    public int snatie = 180;

    @Override
    public  void run() {
        for (int i = 0; i < 20; i++) {
            if (schet > 0){
            System.out.println(schet);
            int x = schet-snatie;
            System.out.println(x);
            System.out.println();
            schet = x;
            }else {
                System.out.println("Ошибка: нехватка средств");
                break;
            }
        }
    }
}
