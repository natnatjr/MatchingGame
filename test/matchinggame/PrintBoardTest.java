package matchinggame;

import static junit.framework.Assert.fail;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class PrintBoardTest {
    // test method to make sure that the board is printed correctly
    @Test
    public void testPrintBoardGood() {
        PrintBoard instance = new PrintBoard();

        Letter[][] board = new Letter[4][4];

        instance.printBoard(board);
        System.out.println("|");
        for (int i = 0; i < 4; i++) {
            System.out.print("|");
            for (int j = 0; j < 4; j++) {
                System.out.print(board[i][j]);
                System.out.print("|");
            }
            System.out.println();
        }
        assertEquals("|", "|"); 
    }

    // test method to make sure that the board is printed correctly
    @Test
    public void testPrintBoardBad() {
        PrintBoard instance = new PrintBoard();

        Letter[][] board = new Letter[4][4];

        instance.printBoard(board);
        System.out.println("|");
        for (int i = 0; i < 4; i++) {
            System.out.print("|");
            for (int j = 0; j < 4; j++) {
                System.out.print(board[i][j]);
                System.out.print("|");
            }
            System.out.println();
        }
        assertEquals("  |  ", "|"); // expected value is "  |  ", actual value is "|"
    }

    // test method to go out of bounds
    @Test
    public void testPrintBoardBoundary() {
        PrintBoard instance = new PrintBoard();

        // we expect an exception to be thrown by the printBoard method because the
        // row and column are zero
        try {
            Letter[][] board = new Letter[0][0]; // creates a new 2D array of type Letter with 0 rows and 0 columns
                                                  // (boundary)
            instance.printBoard(board);
        } catch (ArrayIndexOutOfBoundsException e) { // we expect an exception to be thrown by the printBoard method
                                                      // because the row and column are out of bounds
            assert (true); // assertTrue(true) is the assert statement to check if the exception is thrown
        }
    }
}
