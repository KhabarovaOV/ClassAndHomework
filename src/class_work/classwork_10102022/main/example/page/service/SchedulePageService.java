package example.page.service;

import example.page.SchedulePage;
import example.page.annotation.Service;
import example.page.service.service_interface.HasSchedulePage;
@Service(serviceName = "Login page service")

public class SchedulePageService extends BaseService implements HasSchedulePage {
    private SchedulePage schedulePage = new SchedulePage();

    @Override
    public SchedulePage getSchedulePage() {
        return schedulePage;
    }
}
