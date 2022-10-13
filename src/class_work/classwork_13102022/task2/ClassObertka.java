package class_work.classwork_13102022.task2;

public class ClassObertka {

    public static void main(String[] args) {
        Integer x = 5;
        Integer y = 7;
        Integer a = 4;
        Integer b = 4;
        System.out.println(a.equals(b));
        System.out.println(x.equals(y));
        System.out.println(x.intValue() == y.intValue());
        System.out.println(x.compareTo(y));
        System.out.println(y.compareTo(x));
        System.out.println(a.compareTo(b));
    }

}
