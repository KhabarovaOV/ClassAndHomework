package example.page.element.login;

import example.page.annotation.Element;
import example.page.element.Input;
@Element(elementName = "login field element")
public class LoginFieldElement extends Input {
    public LoginFieldElement(String elementSelector) {
        super(elementSelector);
    }
}
