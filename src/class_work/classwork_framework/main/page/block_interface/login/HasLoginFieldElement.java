package page.block_interface.login;

import page.element.login.LoginFieldElement;

public interface HasLoginFieldElement {
    LoginFieldElement getLoginFieldElement();

    default void showLoginFieldElementSelector(){
        System.out.println(getLoginFieldElement().elementSelector);
    }
}
