package example.page.element.login;

import example.page.annotation.Element;
import example.page.element.Button;
@Element(elementName = "login button element")
public class LoginButtonElement extends Button {

    public LoginButtonElement(String elementSelector) {
        super(elementSelector);
    }
}
