package page.element;


import annatation.Element;

@Element(elementName = "Input root element")
public class Input extends BaseElement {
    public Input(String elementSelector) {
        super.elementSelector = elementSelector;
    }
}
