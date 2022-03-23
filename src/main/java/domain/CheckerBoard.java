package domain;

import java.awt.*;

public class CheckerBoard {

    // ui를 그리기 위해 필요한 필드
    // 보드
    public static final int x = 70;
    public static final int y = 70;
    public static final int width = 380;
    public static final int height = width;
    public static final Color backgroundColor= new Color(214, 181, 105);
    // 선
    public static final int startX = 10;
    public static final int startY = 10;
    public static final int interval = 20;
    public static final int endX = startX+18*interval;
    public static final int endY = startY+18*interval;
    // 바둑돌, 강조표시
    public static final int bold = 5;
    public static final int stone = 20;

    // data를 담는 필드
    // 바둑판의 모든 점
    private Intersection[][] grid ;

    // constructor
    public CheckerBoard(){
        /* grid
        index와 실제 선의 번호를 맞추기 위해 20X20 배열 선언
        index=0인 행과 열은 사용하지 않는다.
         */
        grid = new Intersection[20][20];

        // 각 점들의 type 설정
        for(int i=1;i<20;i++){
            for(int j=1;j<20;j++){
                if (i==1 || i==19 || j==1 || j==19){
                    if (i+j==2 || i+j==20)
                        grid[i][j]=new Intersection(2); // 귀
                    else
                        grid[i][j]=new Intersection(3); // 변
                }
                else
                    grid[i][j]=new Intersection(4); // 점
            }
        }

    }

    // 인수로 받은 점에 착수 불가능하다면 false 반환, 착수가능하다면 true 반환
    public boolean IsAvailable(int row, int column){
        if (grid[row][column].getStoneColor()==null)
            return true;
        else
            return false;
    }

    // 인수로 받은 점에 놓일 돌의 색을 결정
    public void fill(int row, int column, Color stoneColor){
        grid[row][column].setStoneColor(stoneColor);
        // LOG
        System.out.println(row+", "+column);
    }

    // 인수로 받은 점에 놓인 돌의 색을 확인한다
    public Color checkStoneColor(int row, int column){
        return grid[row][column].getStoneColor();
    }

}
