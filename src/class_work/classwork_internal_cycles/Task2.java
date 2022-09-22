package class_work.classwork_internal_cycles;

public class Task2 {
    public static void main(String[] args) {
        int index=10;
        for(int i=0;i<index;i++) {
            for(int j=0;j<index-i;j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
