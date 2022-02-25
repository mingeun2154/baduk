package renderer;

import domain.CheckerBoard;
import domain.PopupWindow;

import javax.swing.*;
import java.awt.*;

// Renderer는 View 객체를 반환한다.
public class BRenderer extends JFrame{

    // 실제 ui를 출력하는 객체
    private Graphics g;

    public BRenderer(){
        // 가장 바깥 window 초기화
        this.setTitle(PopupWindow.getTitle());
        this.setSize(PopupWindow.getWidth()
                    ,PopupWindow.getHeight());
        this.setVisible(PopupWindow.IsVisible());
        this.setLocationRelativeTo((Component) PopupWindow.getLocation());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
         // g 초기화
    }

    public void draw_checkerboard(CheckerBoard model){
        this.g.drawRect(model.getX(), model.getY(),
                        model.getWidth(), model.getHeight());
    }

}
