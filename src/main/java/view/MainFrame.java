package view;

import content.PopupWindow;

import javax.swing.*;

// singleton pattern 적용
public class MainFrame extends JFrame {

    private static MainFrame singleton = new MainFrame();

    public static MainFrame getInstance(){
        return singleton;
    }
    private MainFrame(){
        // frame 초기화
        initWindow();
    }

    private void initWindow(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(PopupWindow.getWidth(), PopupWindow.getHeight());
        this.setTitle(PopupWindow.getTitle());
        this.setLocationRelativeTo(PopupWindow.getLocation());
    }



}