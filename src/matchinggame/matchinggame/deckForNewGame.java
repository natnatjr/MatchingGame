
package matchinggame;


public class deckForNewGame {
    public void deckForNewGame1(Letter[][] board) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                board[i][j] = Letter.X;
            }
        }
    }
}
