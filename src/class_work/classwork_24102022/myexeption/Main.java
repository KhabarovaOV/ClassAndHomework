package class_work.classwork_24102022.myexeption;

public class Main {
    public static void main(String[] args) {
     Main main = new Main();
     try {
         main.myMethodCE();
     }catch (CheckedException e){
         System.out.println(e.getMessage());
     }
        try {
            main.myMethodUnE();
        }catch (UncheckedException e){
            System.out.println(e.getMessage());
        }
    }

   public void myMethodCE() throws CheckedException{
        throw new CheckedException("Hello, find new exception!!!");
   }

   public void myMethodUnE() throws UncheckedException{
        throw new UncheckedException("Hello, find new Unchecked exception!!!");
   }

}
