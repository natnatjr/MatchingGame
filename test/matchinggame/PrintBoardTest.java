package matchinggame;

import static junit.framework.Assert.fail;
import org.junit.Test;

public class PrintBoardTest {

    @Test
    public void testPrintBoardGood() {
        System.out.println("printBoard");
        Letter[][] board = null;
        PrintBoard instance = new PrintBoard();
        instance.printBoard(board);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


}
