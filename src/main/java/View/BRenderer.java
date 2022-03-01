package View;

import component.LoadGameButton;
import component.NewGameButton;
import component.PopupWindow;
import controller.StartScreenController;

import javax.swing.*;
import java.awt.event.ActionListener;

public class BRenderer extends JFrame {

    // components를 추가할 패널
    private JRootPane rootPane;

    // components
    JButton loadGameButton;
    JButton newGameButton;

    // controller
    StartScreenController startScreenController;

    public BRenderer(){
        // DI
        startScreenController = new StartScreenController();
        // 프로그램 렌더링
        rootPane = this.getRootPane();
        rootPane.setLayout(null);
        initWindow();
        initComponents();
        addComponents();
        // 화면 출력
        this.setVisible(PopupWindow.IsVisible());
    }

    private void initWindow(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(PopupWindow.getWidth(), PopupWindow.getHeight());
        this.setTitle(PopupWindow.getTitle());
        this.setLocationRelativeTo(PopupWindow.getLocation());
    }

    private void initComponents() {
        // NewGameButton
        newGameButton = new NewGameButton();
        newGameButton.addActionListener(startScreenController);

        // LoadGameButton
        loadGameButton = new LoadGameButton();
        loadGameButton.addActionListener(startScreenController);
    }

    private void addComponents() {
        rootPane.add(loadGameButton);
        rootPane.add(newGameButton);
    }

}