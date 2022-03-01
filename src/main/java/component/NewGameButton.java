package component;

import javax.swing.*;
import java.awt.*;

public class NewGameButton extends JButton {
    private static final int width = 200;
    private static final int height = 100;
    private static final int x = 300;
    private static final int y = 100;
    private static final String name = "NewGameButton";
    private static final String innerText = "새 게임";
    private static final Font font = new Font(Font.SANS_SERIF, 0, 30);

    public NewGameButton(){
        this.setSize(width, height);
        this.setLocation(x,y);
        this.setName(name);
        this.setText(innerText);
        this.setFont(font);
    }
}