package domain;

import javax.swing.JColorChooser;
import java.awt.*;

public class CheckerBoard {

    private int x=20;
    private int y=20;
    private int width=400;
    private int height=400;
    private Color backgroundColor=Color.ORANGE;

    // constructors
    public CheckerBoard() {}
    public CheckerBoard(CheckerBoard model) {}

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    // 실제 선은 19개이다. index와 선을 일치시키기 위해 20X20 배열 선언.
    private Stone [][] pointsOfBoard = new Stone[20][20];

}
