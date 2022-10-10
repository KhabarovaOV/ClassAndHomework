package example.page.element;

import example.page.annotation.Element;

@Element(elementName = "link element")
public class Link extends BaseElement {
    public Link(String elementSelector) {
        super.elementSelector = elementSelector;
    }
}
