package service;

import domain.GameInfo;
import view.GameInfoPanel;

public class GameInfoService {

    private GameInfo gameInfo;

    // constructor
    public GameInfoService(GameInfo gameInfo){
        //DI
        this.gameInfo=gameInfo;
    }

    public void changeTurn(){
        // 흰색 차례 -> 검은색 차례
        if(gameInfo.getTurn()==1)
            gameInfo.setTurn(0);
        // 검은색 차례 -> 흰색 차례
        else
            gameInfo.setTurn(1);
    }
}
