package service;

import domain.CheckerBoard;
import domain.GameInfo;

import java.awt.*;

public class CheckerBoardService {

    CheckerBoard checkerBoard;
    GameInfo gameInfo;

    public CheckerBoardService(CheckerBoard checkerBoard, GameInfo gameInfo){
        // DI:checkerboard, gameInfo
        this.checkerBoard=checkerBoard;
        this.gameInfo=gameInfo;
    }

    public void setStone(int row, int column){
        if(checkerBoard.IsAvailable(row, column)){
            // 검은색 차례-검은돌을 놓고 흰색으로 차례가 넘어간다
            if(gameInfo.getTurn()==0){
                checkerBoard.fill(row, column, Color.black);
                gameInfo.setTurn(1);
            }
            // 흰색 차례-흰돌을 놓고 검은색으로 차례가 넘어간다
            else{
                checkerBoard.fill(row, column, Color.white);
                gameInfo.setTurn(0);
            }
        }
    }
}
