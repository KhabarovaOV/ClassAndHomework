package class_work.classwork_04072022;

public class Task10 {
    public static void main(String[] args) {
        final int height = 176;
        final int weight = 68;
        int ves = height-110;
        int s = weight-ves;
        if (s>0) {
            System.out.println("Необходимо набрать " + s + " кг");
        } else {
            System.out.println("Необходимо сбросить " + s + " кг");
    }
}}
