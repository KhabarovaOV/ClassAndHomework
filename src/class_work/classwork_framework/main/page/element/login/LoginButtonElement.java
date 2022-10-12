package page.element.login;

import annatation.Element;
import page.element.Button;

@Element(elementName = "Login button element")

public class LoginButtonElement extends Button {
public LoginButtonElement(String elementSelector){
    super(elementSelector);
}
}
