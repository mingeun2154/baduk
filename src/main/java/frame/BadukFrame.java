package frame;

import javax.swing.*;

// MainFrame은 싱글톤 객체이다.
public class BadukFrame extends JFrame{

    private static BadukFrame singleton=new BadukFrame();

    // constructor
    private BadukFrame(){
        this.setTitle("바둑");
        this.setSize(500,500);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    // 싱글톤 객체를 반환한다.
    public static BadukFrame getFrame(){
        return singleton;
    }

}
