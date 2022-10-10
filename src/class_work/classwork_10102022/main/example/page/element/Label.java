package example.page.element;

import example.page.annotation.Element;

@Element(elementName = "Label element")
public class Label extends BaseElement {
    public Label(String elementSelector) {
        super.elementSelector = elementSelector;
    }
}
