package page.element;

import example.page.annotation.Element;

@Element(elementName = "Link root element")
public class Link extends BaseElement {
    public Link(String elementSelector) {
        super.elementSelector = elementSelector;
    }
}
