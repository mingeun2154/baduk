package domain;

public class NewGameButton extends Button {
    public NewGameButton() {
        super(200, 100, "새 게임");
        this.setLocation(300, 100);
        this.setFontSize(30);
        this.setName("NewGameButton");
    }
}