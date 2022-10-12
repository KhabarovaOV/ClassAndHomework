package page.block.login;

import annatation.Block;
import page.block.BaseBlock;
import page.block_interface.login.language_element.HasLanguageElement;
import page.block_interface.login.language_element.HasTitleLanguageElement;
import page.element.login.language_element.LanguageElement;
import page.element.login.language_element.TitleLanguageElement;

@Block(blockName = "Language login block")
public class LanguageBlock  extends BaseBlock implements HasLanguageElement, HasTitleLanguageElement{

private LanguageElement languageElement= new LanguageElement("selector for language");
private TitleLanguageElement titleLanguageElement = new TitleLanguageElement("selector for title language");

    @Override
    public TitleLanguageElement getTitleLanguageElement() {
        return titleLanguageElement;
    }

    @Override
    public LanguageElement getLanguageElement() {
        return languageElement;
    }
}
