package service;

import domain.CheckerBoard;

public class CheckerBoardService {

    CheckerBoard checkerBoard;

    public CheckerBoardService(CheckerBoard checkerBoard){
        // DI:checkerboard (domain)
        this.checkerBoard=checkerBoard;
    }

    public void setStone(int row, int column){
        if(checkerBoard.IsAvailable(row, column))
            checkerBoard.fill(row, column);
    }

    public void showPossibility(int row, int column){
        if(checkerBoard.IsAvailable(row, column)){
            checkerBoard.highlight(row, column);
        }
    }

    public void eraseHighlight(int row, int column){
        checkerBoard.eraseHighlight(row, column);
    }
}
