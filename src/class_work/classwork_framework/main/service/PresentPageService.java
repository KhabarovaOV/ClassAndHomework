package service;


import annatation.Service;
import page.PresentPage;
import service.service_interface.HasPresentPageService;

@Service(serviceName = "Present page service")
public class PresentPageService extends BaseService implements HasPresentPageService {
    private PresentPage presentPage = new PresentPage();

    @Override
  public PresentPage getPresentPageService() {
        return presentPage;
    }
}
