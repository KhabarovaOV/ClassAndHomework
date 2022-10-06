package class_work.classwork_06102022;

import class_work.classwork_06102022.block.LoginBlock;
import class_work.classwork_06102022.block.RegBlock;
import class_work.classwork_06102022.elements.NameButton;
import class_work.classwork_06102022.elements.SearchButton;
import class_work.classwork_06102022.elements.StartButton;

public class WorkPage extends BasePage implements HasStartButton, HasNameButton, HasSearchButton{
    @Override
    public NameButton getNameButton() {
        return new LoginBlock().nameButton;
    }

    @Override
    public SearchButton getSearchButton() {
        return new LoginBlock().searchButton;
    }

    @Override
    public StartButton getStartButton() {
        return new RegBlock().startButton;
    }
}
