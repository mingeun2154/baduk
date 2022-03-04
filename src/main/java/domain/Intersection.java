package domain;

import java.awt.*;

public class Intersection {

    Color stoneColor; // 놓인 돌의 색 (없으면 null)
    int type; // 2:귀 3:변 4:점 (최대 활로의 개수)

    // constructor
    public Intersection(){
        stoneColor = null;
        this.type = 0;
    }

    public Color getStoneColor() {
        return stoneColor;
    }

    public void setStoneColor(Color stoneColor) {
        this.stoneColor = stoneColor;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}