package page.element.login.language_element;

import example.page.annotation.Element;
import page.element.Label;

@Element(elementName = "Title language element")
public class TitleLanguageElement extends Label {
    public TitleLanguageElement(String elementSelector){
        super(elementSelector);
    }
}
