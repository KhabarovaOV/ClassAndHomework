package page.block_interface.login;

import page.element.login.LoginButtonElement;

public interface HasLoginButtonElement {
    LoginButtonElement getLoginButtonElement();

    default void showLoginButtonElement(){
        System.out.println(getLoginButtonElement().elementSelector);
    }
}
