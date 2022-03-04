import content.CheckerBoardPanel;
import view.NewGamePanel;
import rendering.TestFrame;

public class BadukApplicationTest {

        public static void main(String[] args){
            // 새 게임 버튼을 눌렀을 때
            CheckerBoardPanel checkerBoardPanel = new CheckerBoardPanel();
            NewGamePanel newGamePanel = new NewGamePanel();
            newGamePanel.add(checkerBoardPanel);
            new TestFrame(newGamePanel);
        }
}
