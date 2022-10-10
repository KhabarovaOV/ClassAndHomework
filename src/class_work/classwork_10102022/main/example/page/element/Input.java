package example.page.element;

import example.page.annotation.Element;

@Element(elementName = "Input element")
public class Input extends BaseElement {
    public Input(String elementSelector) {
        super.elementSelector = elementSelector;
    }
}
