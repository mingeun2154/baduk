import performer.BPerformer;

public class BadukApplication {
    public static void main(String[] args){
        System.out.println("start game");

        BPerformer bPerformer = new BPerformer();
        bPerformer.init_program();
        bPerformer.getJFrame().setVisible(true);
    }
}
