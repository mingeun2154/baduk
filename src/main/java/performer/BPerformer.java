package performer;

import controller.StartScreenController;
import domain.PopupWindow;
import renderer.BRenderer;

// Spring Container같은 객체이다.
public class Bperformer {
    private BRenderer bRenderer;
    private StartScreenController startScreenController;

    //constructor
    // MVC 객체들을 Bean으로 등록한다.
    public Bperformer(){
        bRenderer=BRenderer.getInstance();
        startScreenController = new StartScreenController();
    }
    // 시작화면
    void init_program(){
        bRenderer.setVisible(PopupWindow.IsVisible());
    }
}
