package service;


import annatation.Service;
import page.MainPage;
import service.service_interface.HasMainPageService;

@Service(serviceName = "Main page service")
public class MainPageService extends BaseService implements HasMainPageService {

    private MainPage mainPage= new MainPage();

    @Override
    public MainPage getMainPageService() {
        return mainPage;
    }
}
