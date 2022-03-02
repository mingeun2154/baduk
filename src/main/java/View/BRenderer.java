package View;

import component.PopupWindow;
import controller.StartScreenController;

import javax.swing.*;

public class BRenderer extends JFrame {

    private JPanel startScreenPanel;
    private JPanel newGamePanel;

    public BRenderer(){
        // panel 초기화
        startScreenPanel = new StartScreenPanel();
        // frame 초기화
        initWindow();
        this.add(startScreenPanel);
        // 화면 출력
        this.setVisible(PopupWindow.IsVisible());
    }

    private void initWindow(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(PopupWindow.getWidth(), PopupWindow.getHeight());
        this.setTitle(PopupWindow.getTitle());
        this.setLocationRelativeTo(PopupWindow.getLocation());
    }

}