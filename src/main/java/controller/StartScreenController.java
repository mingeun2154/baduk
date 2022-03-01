package controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartScreenController implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button=(JButton) e.getSource();
        if(button.getName()=="LoadGameButton"){
            System.out.println("불러오기");
        }else if(button.getName()=="NewGameButton"){
            System.out.println("새 게임");
        }else{
            System.out.println("nothing");
        }
    }
}
