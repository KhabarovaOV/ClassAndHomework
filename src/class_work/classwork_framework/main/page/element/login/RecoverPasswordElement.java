package page.element.login;

import annatation.Element;
import page.element.Link;

@Element(elementName = "Recover password element")
public class RecoverPasswordElement extends Link {
    public RecoverPasswordElement(String elementSelector){
        super(elementSelector);
    }
}
