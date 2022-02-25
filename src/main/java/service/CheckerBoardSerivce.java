package service;

import domain.CheckerBoard;
import renderer.BRenderer;

public class CheckerBoardSerivce {

    private CheckerBoard checkerBoard;
    private BRenderer bRenderer;

    //consturctor
    public CheckerBoardSerivce(CheckerBoard model){
        // controller에 의해 model을 주입받는다.
        checkerBoard=new CheckerBoard(model);
        BRenderer bRenderer = new BRenderer();
    }

    public void init_game(){
        bRenderer.draw_checkerboard(checkerBoard);
    }
}
