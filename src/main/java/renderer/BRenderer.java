package renderer;

import domain.Button;
import domain.PopupWindow;

import javax.swing.*;
import java.awt.*;

// 싱글톤 패턴 적용
public class BRenderer extends JFrame{
    private static BRenderer singleton = new BRenderer();

    private BRenderer(){}

    public static BRenderer getInstance() {
        singleton.setDefaultCloseOperation(EXIT_ON_CLOSE);
        singleton.setTitle(PopupWindow.getTitle());
        singleton.setSize(PopupWindow.getWidth(), PopupWindow.getHeight());
        singleton.setLocationRelativeTo((Component) PopupWindow.getLocation());
        return singleton;
    }

    // BRenderer에 버튼을 추가한다.
    public static void addButton(Button button){
        JButton jButton=new JButton();
//        jButton.setSize(button.getWidth(), button.getHeight());
        jButton.setBounds(button.getX(), button.getY(), button.getWidth(), button.getHeight());
        jButton.setText(button.getInnerText());
        jButton.setFont(new Font("", button.IsBold(), button.getFontSize()));
        jButton.setVisible(button.IsVisible());
        singleton.add(jButton);
    }

}
