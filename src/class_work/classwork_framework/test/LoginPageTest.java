import service.LoginPageService;

public class LoginPageTest {
    private LoginPageService loginPageService = new LoginPageService();

    public static void main(String[] args) {
        LoginPageTest test = new LoginPageTest();
        test.checkLoginButton();
        test.checkLoginField();
        test.checkLanguageElement();
        test.checkPasswordField();
        test.checkRecoverPassword();
        test.checkTitleLanguageElement();
    }
    public void checkPasswordField(){
        loginPageService.getLoginPageService().getLoginFormBlock().showLoginFieldElementSelector();
    }

    public void checkLoginField(){
        loginPageService.getLoginPageService().getLoginFormBlock().showLoginFieldElementSelector();
    }

    public void checkLoginButton(){
        loginPageService.getLoginPageService().getLoginFormBlock().showLoginButtonElementSelector();
    }

    public void checkRecoverPassword(){
        loginPageService.getLoginPageService().getLoginFormBlock().showRecoverPasswordElementSelector();
    }

    public void checkLanguageElement(){
        loginPageService.getLoginPageService().getLanguageBlock().showLanguageElementSelector();
    }
     public void checkTitleLanguageElement(){
        loginPageService.getLoginPageService().getLanguageBlock().showTitleLanguageElementSelector();
     }
}
