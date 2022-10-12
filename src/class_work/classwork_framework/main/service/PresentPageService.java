package service;

import example.page.MainPage;
import example.page.annotation.Service;
import example.page.service.service_interface.HasMainPage;

@Service(serviceName = "Present page service")
public class PresentPageService extends BaseService implements HasMainPage {
    private MainPage mainPage = new MainPage();

    @Override
    public MainPage getMainPage() {
        return mainPage;
    }
}
