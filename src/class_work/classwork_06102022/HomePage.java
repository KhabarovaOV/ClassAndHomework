package class_work.classwork_06102022;

import class_work.classwork_06102022.block.RegBlock;
import class_work.classwork_06102022.elements.*;

public class HomePage extends BasePage implements HasRebootButton {

    @Override
    public RebootButton getRebootButton() {
        return new RegBlock().rebootButton;
    }
}
