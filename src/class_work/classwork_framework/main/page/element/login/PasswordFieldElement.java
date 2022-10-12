package page.element.login;

import annatation.Element;
import page.element.Input;

@Element(elementName = "Password field element")
public class PasswordFieldElement extends Input {
    public PasswordFieldElement(String elementSelector){
        super(elementSelector);
    }
}
