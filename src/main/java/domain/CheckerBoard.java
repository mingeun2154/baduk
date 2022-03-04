package domain;

public class CheckerBoard {

    Intersection[][] grid;

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
                        grid[i][j].setType(2); // 귀
                    else
                        grid[i][j].setType(3); // 변
                }
                else
                    grid[i][j].setType(4); // 점
            }
        }

    }
}
