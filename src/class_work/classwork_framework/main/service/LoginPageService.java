package service;

import example.page.LoginPage;
import example.page.annotation.Service;
import example.page.service.service_interface.HasLoginPage;

@Service(serviceName = "Login page service")
public class LoginPageService extends BaseService implements HasLoginPage {

    private LoginPage loginPage = new LoginPage();

    @Override
    public LoginPage getLoginPage() {
        return loginPage;
    }
}
