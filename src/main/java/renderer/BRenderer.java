package renderer;

import content.CheckerBoardPanel;
import content.LoadGameButton;
import content.NewGameButton;
import controller.StartScreenController;
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
        checkerBoardPanel = new CheckerBoardPanel();
        newGamePanel = new NewGamePanel();
        // init content
        loadGameButton = new LoadGameButton();
        newGameButton =new NewGameButton();
        // init controller
        startScreenController = new StartScreenController(startPanel, newGamePanel);
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

    }

}
