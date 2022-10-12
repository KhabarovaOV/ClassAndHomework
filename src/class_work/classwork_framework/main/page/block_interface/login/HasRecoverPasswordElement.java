package page.block_interface.login;

import page.element.login.RecoverPasswordElement;

public interface HasRecoverPasswordElement {
    RecoverPasswordElement getRecoverPasswordElement();

    default void showRecoverPasswordElementSelector(){
        System.out.println(getRecoverPasswordElement().elementSelector);
    }
}
