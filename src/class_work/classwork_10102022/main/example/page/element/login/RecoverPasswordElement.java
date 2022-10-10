package example.page.element.login;

import example.page.annotation.Element;
import example.page.element.Link;
@Element(elementName = "recover password element")
public class RecoverPasswordElement extends Link {
    public RecoverPasswordElement(String elementSelector) {
        super(elementSelector);
    }
}
