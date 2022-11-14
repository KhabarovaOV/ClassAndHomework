package home_work.homework_14112022.Pr10.task;

public class Singleton {
    private static Singleton singleton;

    private Singleton () {}

    public static Singleton getInstance(){
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public void sayHelloWihHashCode() {
        System.out.println("show hashcode " + hashCode());
    }
}
