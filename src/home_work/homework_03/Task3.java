package home_work.homework_03;

public class Task3 {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("0123456789");
        a.append(4247);
        System.out.println(a);
        a.delete(0,10);
        System.out.println(a);

        StringBuilder a1 = new StringBuilder("123456789");
        a1.insert(4, 247);
        a1.replace(7,3,"");
        System.out.println(a1);
        a1.replace(3,8, "");
        System.out.println(a1);

        String x = ("0123456789");
        x = x.concat("4247");
        x = x.substring(10,14);
        System.out.println(x);


    }
}
