package page.block.login;

import annatation.Block;
import page.block.BaseBlock;
import page.block_interface.login.HasLoginButtonElement;
import page.block_interface.login.HasLoginFieldElement;
import page.block_interface.login.HasPasswordFieldElement;
import page.block_interface.login.HasRecoverPasswordElement;
import page.element.login.LoginButtonElement;
import page.element.login.LoginFieldElement;
import page.element.login.PasswordFieldElement;
import page.element.login.RecoverPasswordElement;

@Block(blockName = "Login form block")
public class LoginFormBlock extends BaseBlock implements HasLoginButtonElement, HasLoginFieldElement, HasPasswordFieldElement, HasRecoverPasswordElement {

    private LoginButtonElement loginButtonElement = new LoginButtonElement("selector for Login button");
    private LoginFieldElement loginFieldElement = new LoginFieldElement("selector for Login input");
    private PasswordFieldElement passwordFieldElement = new PasswordFieldElement("selector for Password input");
    private RecoverPasswordElement recoverPasswordElement = new RecoverPasswordElement("selector for recover link");

    @Override
    public LoginButtonElement getLoginButtonElement() {
        return loginButtonElement;
    }

    @Override
    public LoginFieldElement getLoginFieldElement() {
        return loginFieldElement;
    }

    @Override
    public PasswordFieldElement getPasswordFieldElement() {
        return passwordFieldElement;
    }

    @Override
    public RecoverPasswordElement getRecoverPasswordElement() {
        return recoverPasswordElement;
    }
}
