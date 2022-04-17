
package matchinggame;


public class GameOver {
    public boolean gameOver(Letter[][] board){

    	for(int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                if(board[i][j].equals(Letter.X)){
                        return false;
                }
            }
        }
        return true;
    }
}
