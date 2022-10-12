package page.element.login.language_element;

import example.page.annotation.Element;
import page.element.Link;

@Element(elementName = "Language element")
public class LanguageElement extends Link {
    public LanguageElement(String elementSelector){
        super(elementSelector);
    }
}
