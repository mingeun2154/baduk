package domain;

import java.util.Timer;
import java.util.TimerTask;

public class GameInfo {

    private int turn; // Black=0, White=1
    private int elapsedTime; // 게임이 진행된 시간
    private int timelimitBlack; // 흑의 남은시간
    private int timelimitWhite; // 백의 남은시간

    // constructor
    public GameInfo(){
        turn=0;
        elapsedTime=0;
        timelimitWhite=0;
        timelimitBlack=0;
    }

    public int getTurn() {return turn;}
    public void setTurn(int turn) {this.turn = turn;}

    /*
    public void startBlackTimer{

    }

    public void stopBlackTimer{

    }

    public void startWhiteTimer{

    }

    public void stopWhiteTimer{

    }
    */
}
