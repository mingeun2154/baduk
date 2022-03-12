package controller;

import content.CheckerBoardPanel;
import domain.CheckerBoard;
import service.CheckerBoardService;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CheckerBoardController extends MouseAdapter {

    CheckerBoardPanel checkerBoardPanel;
    CheckerBoardService checkerBoardService;

    // constructor
    public CheckerBoardController(CheckerBoardPanel checkerBoardPanel, CheckerBoardService checkerBoardService){
        // DI : checkerBoard (domain), checkerBoardPanel
        this.checkerBoardPanel = checkerBoardPanel;
        this.checkerBoardService = checkerBoardService;
    }

    @Override
    public void mouseClicked(MouseEvent click){
        super.mouseClicked(click);
        int x=click.getX();
        int y=click.getY();
        // 특정 점으로부터 크기가 20인 정사각형 안에 들어오면 그 점을 클릭한것으로 해석한다
        int row = x/CheckerBoard.interval+1;
        int column = y/CheckerBoard.interval+1;
        checkerBoardService.setStone(row, column);
        checkerBoardPanel.repaint();
    }

//    @Override
//    public void mouseEntered(MouseEvent e){
//        super.mouseEntered(e);
//        int x=e.getX();
//        int y=e.getY();
//        // 특정 점으로부터 크기가 20인 정사각형 안에 들어오면 그 점 위에 마우스가 있는 것으로 해석한다
//        int row = x/CheckerBoard.interval+1;
//        int column = y/CheckerBoard.interval+1;
//        checkerBoardService.showPossibility(row, column);
//        checkerBoardPanel.revalidate();
//    }
//
//    @Override
//    public void mouseExited(MouseEvent e){
//        super.mouseExited(e);
//        int x=e.getX();
//        int y=e.getY();
//        // 특정 점으로부터 크기가 20인 정사각형 안에 들어오면 그 점 위에 마우스가 있는 것으로 해석한다
//        int row = x/CheckerBoard.interval+1;
//        int column = y/CheckerBoard.interval+1;
//        checkerBoardService.eraseHighlight(row, column);
//        checkerBoardPanel.revalidate();
//    }

}
