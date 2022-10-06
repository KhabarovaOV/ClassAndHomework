package class_work.classwork_06102022;


import class_work.classwork_06102022.elements.RebootButton;

public interface HasRebootButton {
    RebootButton getRebootButton();
 default void verifyRebootButton(){
     if (getRebootButton().getNumber() == 10){
         System.out.println("true");
     } else {
         System.out.println("false");
     }
 }
}
