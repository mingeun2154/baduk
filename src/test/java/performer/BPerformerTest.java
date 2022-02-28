package performer;

import javax.swing.*;
import java.awt.*;

public class BPerformerTest {
    public void 시작화면_출력(){
        // given
        BPerformer bPerformer = new BPerformer();
        JFrame jFrame =bPerformer.getJFrame();

        // when
        bPerformer.init_program();

        // then
        JFrame mainFrame = bPerformer.getJFrame();
        Component rootPane = mainFrame.getRootPane();
        Component newGameButton = rootPane.getComponentAt(301,101);
        System.out.println(newGameButton.getBounds());
    }
}