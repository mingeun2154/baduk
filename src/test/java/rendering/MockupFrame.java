package rendering;

import content.PopupWindow;

import javax.swing.*;

public class MockupFrame extends JFrame {

    public MockupFrame(JPanel testPanel){
        // frame 초기화
        initWindow();
        // frame에 panel 추가
        this.add(testPanel);

        this.setVisible(true);
    }

    private void initWindow(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(PopupWindow.getWidth(), PopupWindow.getHeight());
        this.setTitle("test");
        this.setLocationRelativeTo(PopupWindow.getLocation());
    }
}
