package example.page.service;

import example.page.PresentsPage;
import example.page.annotation.Service;
import example.page.service.service_interface.HasPresentPage;
@Service(serviceName = "Login page service")

public class PresentPageService extends BaseService implements HasPresentPage {
    private PresentsPage presentsPage = new PresentsPage();

    @Override
    public PresentsPage getPresentPage() {
        return presentsPage;
    }
}
