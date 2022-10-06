package class_work.classwork_06102022;

import class_work.classwork_06102022.elements.NameButton;

public interface HasNameButton {

 NameButton getNameButton();
 default void verifyNameButton(){
     if (getNameButton().getNumber() == 7){
         System.out.println("true");
     } else {
         System.out.println("false");
     }
 }
}
