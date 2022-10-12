package page;

import annatation.Page;
import page.block.login.LanguageBlock;
import page.block.login.LoginFormBlock;
import page.page_interface.login.HasLanguageBlock;
import page.page_interface.login.HasLoginFormBlock;

@Page(pageName = "Login page")

public class LoginPage extends BasePage implements HasLanguageBlock, HasLoginFormBlock{

    private LanguageBlock languageBlock = new LanguageBlock();
    private LoginFormBlock loginFormBlock = new LoginFormBlock();

    @Override
    public LanguageBlock getLanguageBlock() {
        return languageBlock;
    }

    @Override
    public LoginFormBlock getLoginFormBlock() {
        return loginFormBlock;
    }
}
