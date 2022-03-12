package content;

import domain.CheckerBoard;

import javax.swing.*;
import java.awt.*;

import static domain.CheckerBoard.*;

// 바둑판과 그 위에 착수된 돌들을 그린다
public class CheckerBoardPanel extends JPanel{

    // Model
    CheckerBoard checkerBoard;

    public CheckerBoardPanel(CheckerBoard checkerBoard){
        // DI
        this.checkerBoard = checkerBoard;
        setLayout(null);
        setBounds(CheckerBoard.x,CheckerBoard.y,CheckerBoard.width,CheckerBoard.heigth);
        setBackground(CheckerBoard.backgroundColor);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        // 세로줄
        for (int i=0;i<20;i++){
            g.drawLine(startX+i*interval, startY,
                        startX+i*interval, endY);
        }
        // 가로줄
        for (int i=0;i<20;i++){
            g.drawLine(startX, startY+i*interval,
                        endX, startY+i*interval);
        }

        // 바둑돌
        for (int i=1;i<20;i++){
            for (int j=1;j<20;j++){
                // ?
//                if (checkerBoard.IsHighlight(i, j)){
//                    g.fillOval(startX+(i-1)*interval-interval/2, startY+(j-1)*interval-interval/2,
//                                bold, bold);
//                }
                if (!checkerBoard.IsAvailable(i,j)){
                    g.fillOval(startX+(i-1)*interval-interval/2, startY+(j-1)*interval-interval/2,
                            stone, stone);
                }
            }
        }
    }

}
