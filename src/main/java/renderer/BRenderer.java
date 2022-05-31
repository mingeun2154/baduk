package renderer;

import content.TurnLabel;
import domain.GameInfo;
import view.CheckerBoardPanel;
import content.LoadGameButton;
import content.NewGameButton;
import controller.CheckerBoardController;
import controller.StartScreenController;
import domain.CheckerBoard;
import service.CheckerBoardService;
import view.MainFrame;
import view.NewGamePanel;
import view.StartPanel;

import java.awt.*;

public class BRenderer {

    // main frame
    private MainFrame mainFrame;
    private Container contentPane;
    // 시작화면
    private StartPanel startPanel;
    private LoadGameButton loadGameButton;
    private NewGameButton newGameButton;
    private StartScreenController startScreenController;
    // 새 게임 화면
    private NewGamePanel newGamePanel;
    private CheckerBoardPanel checkerBoardPanel;
    private CheckerBoard checkerBoard;
    private CheckerBoardController checkerBoardController;
    private CheckerBoardService checkerBoardService;
    private GameInfo gameInfo;
    private TurnLabel turnLabel;

    // constructor
    public BRenderer(){
        initComponents();
        renderStartScreen();
        renderNewGameScreen();
        mainFrame.setVisible(true);
    }

    private void initComponents(){
        // init domain

        // init view
        mainFrame = MainFrame.getInstance();
        contentPane = mainFrame.getContentPane();
        startPanel = new StartPanel();
        newGamePanel = new NewGamePanel();
        // init content
        loadGameButton = new LoadGameButton();
        newGameButton =new NewGameButton();
        turnLabel=new TurnLabel(gameInfo);
        checkerBoardPanel = new CheckerBoardPanel(checkerBoard);
        // init controller
        startScreenController = new StartScreenController(startPanel, newGamePanel);
        checkerBoardController = new CheckerBoardController(checkerBoardPanel, turnLabel, checkerBoardService);

    }

    private void renderStartScreen(){
        loadGameButton.addActionListener(startScreenController);
        newGameButton.addActionListener(startScreenController);
        startPanel.add(newGameButton);
        startPanel.add(loadGameButton);
        contentPane.add(startPanel);
    }

    private void renderNewGameScreen(){
        newGamePanel.add(checkerBoardPanel);
        checkerBoardPanel.addMouseListener(checkerBoardController);
    }

}
