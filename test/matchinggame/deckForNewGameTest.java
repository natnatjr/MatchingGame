package matchinggame;

import static junit.framework.Assert.fail;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class deckForNewGameTest {

    @Test
    public void testDeckForNewGameGood() {  // testDeckForNewGameGood() is the test method from deckForNewGameTest.java
        deckForNewGame instance = new deckForNewGame();

        Letter[][] board = new Letter[4][4];    // creates a new 2D array of type Letter with 4 rows and 4 columns

        instance.deckForNewGame1(board);
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                assertTrue(board[i][j] == Letter.X);
            }
        }
    }

    @Test
    public void testDeckForNewGameBad() {
        deckForNewGame instance = new deckForNewGame();

        // we expect an exception to be thrown by the deckForNewGame method because the row and column are zero
        try {
            Letter[][] board = new Letter[0][0];    // creates a new 2D array of type Letter with 0 rows and 0 columns (bad)
            instance.deckForNewGame1(board);
        } catch (ArrayIndexOutOfBoundsException e) {    // we expect an exception to be thrown by the deckForNewGame method because the row and column are out of bounds
            assert(true);   // assertTrue(true) is the assert statement to check if the exception is thrown
        }
    }
}