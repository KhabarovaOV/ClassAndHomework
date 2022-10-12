package page;

import annatation.Page;
import page.block.TopMenuBlock;
import page.block.left_menu.FooterLeftMenuBlock;
import page.block.left_menu.HeaderLeftMenuBlock;
import page.block.left_menu.NavigationLeftMenuBlock;
import page.block.present.HeaderBlock;
import page.block.present.MaterialInformationBlock;
import page.block.present.NavigationBlock;
import page.block.present.StudentTableBlock;
import page.page_interface.HasTopMenuBlock;
import page.page_interface.left_menu.HasFooterLeftMenuBlock;
import page.page_interface.left_menu.HasHeaderLeftMenuBlock;
import page.page_interface.left_menu.HasNavigationLeftMenuBlock;
import page.page_interface.present.HasHeaderBlock;
import page.page_interface.present.HasMaterialInformationBlock;
import page.page_interface.present.HasNavigationBlock;
import page.page_interface.present.HasStudentTableBlock;

@Page(pageName = "Present page")

public class PresentPage extends BasePage implements HasTopMenuBlock, HasFooterLeftMenuBlock, HasHeaderLeftMenuBlock, HasNavigationLeftMenuBlock,
        HasHeaderBlock, HasMaterialInformationBlock, HasNavigationBlock, HasStudentTableBlock {

    private TopMenuBlock topMenuBlock = new TopMenuBlock();
    private FooterLeftMenuBlock footerLeftMenuBlock = new FooterLeftMenuBlock();
    private HeaderLeftMenuBlock headerLeftMenuBlock = new HeaderLeftMenuBlock();
    private NavigationLeftMenuBlock navigationLeftMenuBlock = new NavigationLeftMenuBlock();
    private HeaderBlock headerBlock = new HeaderBlock();
    private MaterialInformationBlock materialInformationBlock = new MaterialInformationBlock();
    private NavigationBlock navigationBlock = new NavigationBlock();
    private StudentTableBlock studentTableBlock = new StudentTableBlock();

    @Override
    public StudentTableBlock getStudentTableBlock() {
        return studentTableBlock;
    }

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

    @Override
    public HeaderBlock getHeaderBlock() {
        return headerBlock;
    }

    @Override
    public MaterialInformationBlock getMaterialInformationBlock() {
        return materialInformationBlock;
    }

    @Override
    public NavigationBlock getNavigationBlock() {
        return navigationBlock;
    }
}
