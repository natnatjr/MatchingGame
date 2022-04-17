package matchinggame;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class GameOverTest {

    //create a method to test whether the game is over or not


    @Test
    public void testGameOverGood() {
        // create a new 2D array of type Letter with 4 rows and 4 columns (good)
        Letter[][] board = new Letter[4][4];

        // create a new GameOver object
        GameOver instance = new GameOver();

        // call the gameOver method from GameOver.java
        boolean result = instance.gameOver(board);

        // assert that the result is true
        assertEquals(true, result);
    }
}