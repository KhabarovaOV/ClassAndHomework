package class_work.classwork_29092022;

public class Main {
    public static void main(String[] args) {
        Implement nam = new Implement();
        Week[] array = Week.values();
        for (Week light : array
        ) {
            nam.getNameOfDay(light);
        }
    }
}
