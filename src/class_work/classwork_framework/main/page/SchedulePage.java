package page;

import example.page.annotation.Page;
import page.block.TopMenuBlock;
import page.block.left_menu.FooterLeftMenuBlock;
import page.block.left_menu.HeaderLeftMenuBlock;
import page.block.left_menu.NavigationLeftMenuBlock;
import page.page_interface.HasTopMenuBlock;
import page.page_interface.left_menu.HasFooterLeftMenuBlock;
import page.page_interface.left_menu.HasHeaderLeftMenuBlock;
import page.page_interface.left_menu.HasNavigationLeftMenuBlock;

@Page(pageName = "Schedule page")

public class SchedulePage extends BasePage implements HasTopMenuBlock, HasFooterLeftMenuBlock, HasHeaderLeftMenuBlock, HasNavigationLeftMenuBlock {

    private TopMenuBlock topMenuBlock = new TopMenuBlock();
    private FooterLeftMenuBlock footerLeftMenuBlock = new FooterLeftMenuBlock();
    private HeaderLeftMenuBlock headerLeftMenuBlock = new HeaderLeftMenuBlock();
    private NavigationLeftMenuBlock navigationLeftMenuBlock = new NavigationLeftMenuBlock();

    @Override
    public TopMenuBlock getTopMenuBlock() {
        return topMenuBlock;
    }

    @Override
    public FooterLeftMenuBlock getFooterLeftMenuBlock() {
        return footerLeftMenuBlock;
    }

    @Override
    public HeaderLeftMenuBlock getHeaderLeftMenuBlock() {
        return headerLeftMenuBlock;
    }

    @Override
    public NavigationLeftMenuBlock getNavigationLeftMenuBlock() {
        return navigationLeftMenuBlock;
    }
}
