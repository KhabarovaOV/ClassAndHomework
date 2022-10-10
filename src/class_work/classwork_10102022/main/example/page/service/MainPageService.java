package example.page.service;

import example.page.MainPage;
import example.page.annotation.Service;
import example.page.service.service_interface.HasMainPage;
@Service(serviceName = "Login page service")

public class MainPageService extends BaseService implements HasMainPage {
    private MainPage mainPage = new MainPage();
    @Override
    public MainPage getMainPage() {
        return mainPage;
    }
}
