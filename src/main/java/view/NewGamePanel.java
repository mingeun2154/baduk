package view;

import content.CheckerBoard;

import javax.swing.*;

public class NewGamePanel extends JPanel {

    private CheckerBoard checkerBoard;

    public NewGamePanel(){
        setLayout(null);

        initCheckerBoard();
        addCheckerBoard();
    }

    private void addCheckerBoard() {
        this.add(checkerBoard);
    }

    private void initCheckerBoard() {
        checkerBoard = new CheckerBoard();
    }

}
