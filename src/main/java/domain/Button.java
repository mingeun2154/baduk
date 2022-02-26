package domain;

public class Button {
    // 버튼의 크기, 위치
    private int x;
    private int y;
    private int width;
    private int height;
    // 텍스트
    private String innerText;
    private int fontSize;
    private int isBold;

    private boolean isVisible=true;

    public Button(int width, int height){
        this.width=width;
        this.height=height;
    }
    public Button(int width, int height, String innerText){
        this.width=width;
        this.height=height;
        this.innerText=innerText;
    }
    public void setLocation(int x, int y){
        this.x=x;
        this.y=y;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void setInnerText(String innerText) {
        this.innerText = innerText;
    }
    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }
    public void setVisible(boolean isvisible) {
        this.isVisible = isvisible;
    }
    public void setIsBold(int isBold){
        this.isBold = isBold;
    }

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
    public String getInnerText() {
        return innerText;
    }
    public int getFontSize(){return fontSize;}
    public int IsBold(){return isBold;}
    public boolean IsVisible(){
        return isVisible;
    }
}
