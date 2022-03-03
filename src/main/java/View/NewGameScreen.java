package View;

import content.CheckerBoard;

import javax.swing.*;

public class NewGameScreen extends JPanel {

    private CheckerBoard checkerBoard;

    public NewGameScreen(){
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
