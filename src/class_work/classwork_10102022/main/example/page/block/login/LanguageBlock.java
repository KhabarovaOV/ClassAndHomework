package example.page.block.login;

import example.page.annotation.Block;
import example.page.block.BaseBlock;
import example.page.element.login.language_element.LanguageElement;
import example.page.element.login.language_element.TitleLanguageElement;
@Block(blockName = "Language block")
public class LanguageBlock extends BaseBlock {

    private LanguageElement languageElement = new LanguageElement("selector for language");
    private TitleLanguageElement titleLanguageElement = new TitleLanguageElement("selector for title language");
}
