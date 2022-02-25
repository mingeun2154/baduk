package domain;

public class Stone {

    // 0:검정색, 1:흰색
    private int color;
    private int radius=10;

    public Stone(int color){
        this.color=color;
    }

    public int getColor() {
        return color;
    }
}
