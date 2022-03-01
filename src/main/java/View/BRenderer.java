package View;

import component.PopupWindow;
import controller.StartScreenController;

import javax.swing.*;

public class BRenderer extends JFrame {

    // 시작화면
    private JPanel startScreenPanel;

    public BRenderer(){
        // 프로그램 렌더링
        initWindow();
        startScreenPanel = new StartScreenPanel();
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