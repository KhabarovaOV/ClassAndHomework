package example.page.element.login;

import example.page.annotation.Element;
import example.page.element.Input;
@Element(elementName = "password field element")
public class PasswortFieldElement extends Input {
    public PasswortFieldElement(String elementSelector) {
        super(elementSelector);
    }
}
