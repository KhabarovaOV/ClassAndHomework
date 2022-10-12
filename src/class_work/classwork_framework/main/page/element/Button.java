package page.element;

import example.page.annotation.Element;

@Element(elementName = "Button root element")
public class Button extends BaseElement {
    public Button(String elementSelector) {
        super.elementSelector = elementSelector;
    }
}
