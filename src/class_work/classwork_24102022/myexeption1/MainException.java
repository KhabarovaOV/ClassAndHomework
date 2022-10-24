package class_work.classwork_24102022.myexeption1;

import class_work.classwork_24102022.myexeption.CheckedException;

public class MainException {
    public static void main(String[] args) {
        MainException mainException = new MainException();
        try {
           mainException.methodOne();

        }catch (OneException e){
            System.out.println(e.getMessage());
        }
        try {
            mainException.methodTwo();
        } catch (TwoException ex){
            System.out.println(ex.getMessage());
        }
        mainException.methodThree();
    }

    public void methodOne() throws OneException{
       throw new OneException("Just find exception!");
    }

    public void methodTwo() throws TwoException{
        throw new TwoException("Hello Exception!!!!!!");
    }
    public void methodThree() throws ThreeException{
        throw new ThreeException("You idiot!");
    }
}
