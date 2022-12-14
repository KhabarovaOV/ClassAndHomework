package page.page_interface.left_menu.with_abstract;

import page.block.left_menu.LeftMenuBlock;

public interface HasLeftMenuBlock {
    LeftMenuBlock getFooterLeftMenuBlock();
    LeftMenuBlock getHeaderLeftMenuBlock();
    LeftMenuBlock getNavigationLeftMenuBlock();
}
