package class_work.classwork_06102022;

import class_work.classwork_06102022.elements.CloseButton;

public interface HasCloseButton {
    CloseButton getCloseButton();

    default void verifyCloseButton() {
        if (getCloseButton().getNumber() == 3) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
