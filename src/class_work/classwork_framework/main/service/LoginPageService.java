package service;


import annatation.Service;
import page.LoginPage;
import service.service_interface.HasLoginPageService;

@Service(serviceName = "Login page service")
public class LoginPageService extends BaseService implements HasLoginPageService {

    private LoginPage loginPage = new LoginPage();

    @Override
    public LoginPage getLoginPageService() {
        return loginPage;
    }
}
