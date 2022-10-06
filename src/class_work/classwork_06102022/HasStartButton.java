package class_work.classwork_06102022;


import class_work.classwork_06102022.elements.StartButton;

public interface HasStartButton {

    StartButton getStartButton();

    default void verifyStartButton() {
        if (getStartButton().getNumber() == 5) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
