package page.element.login;

import annatation.Element;
import page.element.Input;

@Element(elementName = "Login field element")
public class LoginFieldElement extends Input {
    public LoginFieldElement(String elementSelector){
        super(elementSelector);
    }
}
