package example.page.block.login;

import example.page.annotation.Block;
import example.page.block.BaseBlock;
import example.page.element.login.LoginButtonElement;
import example.page.element.login.LoginFieldElement;
import example.page.element.login.PasswortFieldElement;
import example.page.element.login.RecoverPasswordElement;
@Block(blockName = "LoginForm block")
public class LoginFormBlock extends BaseBlock {

    private LoginButtonElement loginButtonElement = new LoginButtonElement("selector for Login Button");
    private LoginFieldElement loginFieldElement = new LoginFieldElement("selector for Login input");
    private PasswortFieldElement passwortFieldElement = new PasswortFieldElement("selector for Password input");
    private RecoverPasswordElement recoverPasswordElement = new RecoverPasswordElement("selector for recover link");
}
