package class_work.classwork_06102022;

import class_work.classwork_06102022.block.LoginBlock;
import class_work.classwork_06102022.block.RegBlock;

public class Main {
    public static void main(String[] args) {
        PlayPage playPage = new PlayPage();
        playPage.verifyCloseButton();
        playPage.verifyStartButton();
        HomePage homePage = new HomePage();
        homePage.verifyRebootButton();
        WorkPage workPage = new WorkPage();
        workPage.verifyNameButton();
        workPage.verifyStartButton();
        workPage.verifySearchButton();
    }
}
