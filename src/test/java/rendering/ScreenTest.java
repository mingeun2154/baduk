package rendering;

import content.TurnLabel;
import domain.GameInfo;
import view.CheckerBoardPanel;
import controller.CheckerBoardController;
import domain.CheckerBoard;
import service.CheckerBoardService;
import view.GameInfoPanel;
import view.NewGamePanel;

import java.util.TimerTask;

public class ScreenTest {

    public static void 새_게임_화면_출력(){
        // init domain
        CheckerBoard checkerBoard = new CheckerBoard();
        GameInfo gameInfo = new GameInfo();
        // init view
        NewGamePanel newGamePanel = new NewGamePanel();
        GameInfoPanel gameInfoPanel = new GameInfoPanel();
        // init content
        CheckerBoardPanel checkerBoardPanel = new CheckerBoardPanel(checkerBoard);
        TurnLabel turnLabel = new TurnLabel(gameInfo);
        //init service
        CheckerBoardService checkerBoardService = new CheckerBoardService(checkerBoard, gameInfo);
        // init contorller
        CheckerBoardController checkerBoardController = new CheckerBoardController(checkerBoardPanel, turnLabel, checkerBoardService);

        checkerBoardPanel.addMouseListener(checkerBoardController);
        gameInfoPanel.add(turnLabel);

        newGamePanel.add(checkerBoardPanel);
        newGamePanel.add(gameInfoPanel);
        new MockupFrame(newGamePanel);
    }

    /*
    public static void 착수(){
        // init domain
        CheckerBoard checkerBoard = new CheckerBoard();
        // init view
        NewGamePanel newGamePanel = new NewGamePanel();
        // init content
        CheckerBoardPanel checkerBoardPanel = new CheckerBoardPanel(checkerBoard);
        //init service
        CheckerBoardService checkerBoardService = new CheckerBoardService(checkerBoard);
        // init contorller
        CheckerBoardController checkerBoardController = new CheckerBoardController(checkerBoardPanel, checkerBoardService);

        // when
    }
    */
}
