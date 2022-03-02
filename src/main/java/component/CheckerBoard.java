package component;

import javax.swing.*;
import java.awt.*;

public class CheckerBoard extends JPanel{

    // 보드
    private static final int x = 70;
    private static final int y = 70;
    private static final int width = 380;
    private static final int heigth = width;
    private static final Color backgroundColor= new Color(214, 181, 105);
    // 선
    private static final int startX = 10;
    private static final int startY = 10;
    private static final int interval = 20;
    private static final int endX = startX+18*interval;
    private static final int endY = startY+18*interval;

    public CheckerBoard(){
        setLayout(null);
        setBounds(x,y,width,heigth);
        setBackground(backgroundColor);
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
    }

}
