package class_work.classwork_03102022.annotation;


import java.lang.annotation.Annotation;

@DayOfWeek(250)
@DayOfWeek(300)
@DayOfWeek(500)
@NotPovtorAnnotation(15.5)
public class Main {
    public static void main(String[] args) {

        method();
        method1();
        System.out.println(returnMethod());
    }


    public static void method() {
        Main m = new Main();
        try {
            Annotation [] array = m.getClass().getAnnotations();
            for (Annotation exp : array) {
                System.out.println(exp);
            }
        } catch (Exception e) {

        }
    }
    public static  void method1(){
        Main n = new Main();
        boolean a = n.getClass().isAnnotationPresent(NotPovtorAnnotation.class);
        System.out.println(a);
    }
    public static boolean returnMethod(){
        return Main.class.isAnnotationPresent(NotPovtorAnnotation.class);

    }


}
