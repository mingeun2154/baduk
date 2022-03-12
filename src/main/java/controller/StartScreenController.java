package controller;

import com.sun.tools.javac.Main;
import view.MainFrame;
import view.NewGamePanel;
import view.StartPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartScreenController implements ActionListener {

    MainFrame mainFrame = MainFrame.getInstance();
    NewGamePanel nextPanel;
    StartPanel currentPanel;

    // constructor
    public StartScreenController(StartPanel startPanel, NewGamePanel newGamePanel){
        // DI : startPanel, newGamePanel (view)
        currentPanel = startPanel;
        nextPanel = newGamePanel;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button=(JButton) e.getSource();
        if(button.getName()=="LoadGameButton"){
            System.out.println("불러오기");
        }else if(button.getName()=="NewGameButton"){
            System.out.println("새 게임");
            currentPanel.setVisible(false);
            mainFrame.getContentPane().add(nextPanel);
        }else{
            System.out.println("nothing");
        }
    }
}
