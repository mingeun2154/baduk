package view;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

// 진행시간, 차례, 시간제한, 뒤로, 앞으로, 저장 버튼을 화면에 나타낸다
public class GameInfoPanel extends JPanel {
    private static final int width=200;
    private static final int heigt=380;
    private static final int x=530;
    private static final int y=70;
    private static boolean isVisible=true;
    private static final Color borderColor=Color.BLACK;
    private static final int borderwidth=2;

    public GameInfoPanel(){
        this.setSize(width, heigt);
        this.setLocation(x,y);
        this.setVisible(isVisible);
        this.setBorder(new LineBorder(borderColor, borderwidth));
        this.setLayout(null);
    }
}
