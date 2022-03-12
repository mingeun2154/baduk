package rendering;

import content.CheckerBoardPanel;
import controller.CheckerBoardController;
import domain.CheckerBoard;
import service.CheckerBoardService;
import view.NewGamePanel;

import javax.xml.validation.SchemaFactoryConfigurationError;

public class ScreenTest {

    public static void 새_게임_화면_출력(){
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

        checkerBoardPanel.addMouseListener(checkerBoardController);
        newGamePanel.add(checkerBoardPanel);
        new MockupFrame(newGamePanel);
    }

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
}
