package content;

import domain.GameInfo;
import view.GameInfoPanel;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class TurnLabel extends JLabel {

    private GameInfo gameInfo;

    private static final int width=170;
    private static final int height=30;
    private static final int x=15;
    private static final int y=30;
    private static boolean isVisible=true;
    private static final Color borderColor=Color.black;
    private static final int borderwidth=1;

    public TurnLabel(GameInfo gameInfo){
        // DI
        this.gameInfo=gameInfo;

        this.setSize(width, height);
        this.setLocation(x,y);
        this.setVisible(isVisible);
        this.setBorder(new LineBorder(borderColor, borderwidth));
        this.setText("차례");
        this.setHorizontalAlignment(CENTER);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if(gameInfo.getTurn()==0)
            g.setColor(Color.black);
        else
            g.setColor(Color.white);
        g.fillOval(50,7,16,16);
    }
}
