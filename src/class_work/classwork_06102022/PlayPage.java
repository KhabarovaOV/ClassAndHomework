package class_work.classwork_06102022;

import class_work.classwork_06102022.block.LoginBlock;
import class_work.classwork_06102022.elements.CloseButton;
import class_work.classwork_06102022.elements.StartButton;

public class PlayPage extends BasePage implements HasCloseButton, HasStartButton {

    @Override
    public CloseButton getCloseButton() {
        return new LoginBlock().closeButton;
    }

    @Override
    public StartButton getStartButton() {
        return new LoginBlock().startButton ;
    }
}
