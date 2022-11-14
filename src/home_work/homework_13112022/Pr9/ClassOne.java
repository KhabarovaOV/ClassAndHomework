package home_work.homework_13112022.Pr9;

public class ClassOne {

    public void g() {
        int a = 4;
        int b = 0;
        int S = 0;
        try {
            S = a/b;
        } catch (Exception e) {
            System.out.println("Ошибка");
        }
    }

    public void f() {
        g();
       /* try {
            S = a + b;
            int r = 1;
        } catch (Exception ex) {
            System.out.println("Ошибка 2");
        }*/
    }
}

