package service;


import annatation.Service;
import page.SchedulePage;
import service.service_interface.HasSchedulePageService;

@Service(serviceName = "Schedule page service")
public class SchedulePageService extends BaseService implements HasSchedulePageService {
    private SchedulePage schedulePage = new SchedulePage();

    @Override
    public SchedulePage getSchedulePageService() {
        return schedulePage;
    }
}
