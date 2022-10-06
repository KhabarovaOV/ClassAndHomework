package class_work.classwork_06102022;


import class_work.classwork_06102022.elements.SearchButton;

public interface HasSearchButton {
    SearchButton getSearchButton();
 default void verifySearchButton(){
     if (getSearchButton().getNumber() == 4){
         System.out.println("true");
     } else {
         System.out.println("false");
     }
 }
}
