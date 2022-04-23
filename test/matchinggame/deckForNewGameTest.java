package matchinggame;


import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class deckForNewGameTest {
    
    private deckForNewGame instance;
    
    @Before
    public void setUp() {
        
        instance = new deckForNewGame();
        
    }

    // Good case
    @Test
    public void testDeckForNewGameGood() { // testDeckForNewGameGood() is the test method from deckForNewGameTest.java

        Letter[][] board = new Letter[4][4]; // creates a new 2D array of type Letter with 4 rows and 4 columns

        instance.deckForNewGame1(board);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                assertTrue(board[i][j] == Letter.X);
            }
        }
    }

    
    // Bad case
    @Test(expected = Exception.class)
    public void testDeckForNewGameBad() {

        Letter[][] board = new Letter[0][0]; // creates a new 2D array of type Letter with 0 row and 0 column
        instance.deckForNewGame1(board);
        fail("Should have thrown ArrayOutOfBoundsException");
        
    }
    
    
    // Boundary
    @Test
    public void testDeckForNewGameBoundary() {

        Letter[][] board = new Letter[4][4]; // creates a new 2D array of type Letter with 4 rows and 4 columns
        instance.deckForNewGame1(board);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                assertTrue(board[i][j] == Letter.X);
            }
        }
    }
}