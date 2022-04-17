package matchinggame;

import org.junit.Test;

import junit.framework.TestCase;

public class CheckInputTest extends TestCase {

    @Test
    public void testCheckInputGood() {
        CheckInput instance = new CheckInput();

        int row = 1;
        int column = 1;
        instance.checkInput(row, column);   // checkInput(int row, int column) is the overloaded method from CheckInput.java

    }

    @Test
    public void testCheckInputBad() {
        CheckInput instance = new CheckInput();

        // we expect an exception to be thrown by the checkInput method because the row and column are negative
        try {
            int row = -1;
            int column = -1;
            instance.checkInput(row, column);
            fail("Should have thrown an exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            assertTrue(true);
        }
    }

    @Test
    public void testCheckInputBoundary() {
        CheckInput instance = new CheckInput();

        int row = 6;
        int column = 6;

        // we expect an exception to be thrown by the checkInput method as the row and column are out of bounds
        try {
            instance.checkInput(row, column);
        } catch (ArrayIndexOutOfBoundsException e) {
            assertTrue(true);
            fail("Should have thrown an exception");

        }
    }
}
