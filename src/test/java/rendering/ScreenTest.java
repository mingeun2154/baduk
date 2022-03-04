package rendering;

import content.CheckerBoardPanel;
import view.NewGamePanel;

public class ScreenTest {

    public static void 새_게임_화면_출력(){
        CheckerBoardPanel checkerBoardPanel = new CheckerBoardPanel();
        NewGamePanel newGamePanel = new NewGamePanel();
        newGamePanel.add(checkerBoardPanel);
        new MockupFrame(newGamePanel);
    }
}
