package view;

import content.LoadGameButton;
import content.NewGameButton;
import controller.StartScreenController;

import javax.swing.*;

public class StartPanel extends JPanel {

    // controller
    StartScreenController startScreenController;
    // components
    private JButton loadGameButton;
    private JButton newGameButton;

    public StartPanel(){
        // DI
        startScreenController = new StartScreenController();

        this.setLayout(null);
        initComponents();
        addComponents();
    }

    private void initComponents(){
        // loadGameButton
        loadGameButton = new LoadGameButton();
        loadGameButton.addActionListener(startScreenController);
        // newGameButton
        newGameButton = new NewGameButton();
        newGameButton.addActionListener(startScreenController);
    }

    private void addComponents(){
        this.add(loadGameButton);
        this.add(newGameButton);
    }
}
