package home_work.homework_08112022.Pr8.task4;

public class ClassTwo extends ClassOne{
    //final method don't inherit
    /* void methodOne(){

     }*/

    //private method don't inherit
    /*@Override

      private void methodTwo(){
         System.out.println("new method");
     }*/

    @Override
    public void methodThee() {
        System.out.println("Public method inherit");
    }
}
