package performer;

import controller.StartScreenController;
import domain.LoadGameButton;
import domain.NewGameButton;
import renderer.BRenderer;

import javax.swing.*;

// Spring Container같은 객체이다.
public class BPerformer {
    private BRenderer bRenderer;
    private StartScreenController startScreenController;
    private NewGameButton newGameButton;
    private LoadGameButton loadGameButton;

    //constructor
    // MVC 객체들을 Bean(?)으로 등록한다.
    public BPerformer(){
        bRenderer=BRenderer.getInstance();
        startScreenController = new StartScreenController();
        loadGameButton = new LoadGameButton();
        newGameButton = new NewGameButton();
    }
    // 시작화면
    public void init_program(){
        bRenderer.addButton(newGameButton);
        bRenderer.addButton(loadGameButton);
        bRenderer.setLayout(null);
//        bRenderer.setVisible(PopupWindow.IsVisible());
    }

    public JFrame getJFrame(){
        return bRenderer;
    }
}
