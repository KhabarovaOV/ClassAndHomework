package home_work.homework_01;

public class Spaceship {
    int a =6;
    int b = 9;
    public void Spaceship1() {
        Spaceship name = new Spaceship();
        System.out.println("a = " + name.a);
    }
    public void Spaceship2() {
        Spaceship name1 = new Spaceship();
        System.out.println("b = " + name1.b);
    }

    public static void main(String[] args) {
        Spaceship mains = new Spaceship();
        mains.Spaceship1();
        mains.Spaceship2 ();
    }


}
