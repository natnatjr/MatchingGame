package matchinggame;

import static org.junit.Assert.assertEquals;


import org.junit.Before;
import org.junit.Test;


public class CheckInputTest {
    
    private CheckInput instance;
    private int row1, row2, column1, column2;
    private Letter[][] cards, board;
    private PrintBoard pb;
    private GameOver over;
    

    @Before
    public void setUp() {
        
        instance = new CheckInput();
        cards = new Letter[4][4];
        pb = new PrintBoard();
        board = new Letter[4][4];
        over = new GameOver();
        
    }

    // Good cases
    @Test(expected = Exception.class)
    public void testCheckInputRow1Good() {
        
        row1 = 1;
        instance.checkInput(cards, pb, board, over);
        boolean expected = true;
        assertEquals(expected, instance.getRow1());
        
    }
    
    @Test(expected = Exception.class)
    public void testCheckInputRow2Good() {
        
        row2 = 4;
        instance.checkInput(cards, pb, board, over);
        boolean expected = true;
        assertEquals(expected, instance.getRow2());
        
    }
    
    @Test(expected = Exception.class)
    public void testCheckInputColumn1Good() {
        
        column1 = 2;
        instance.checkInput(cards, pb, board, over);
        boolean expected = true;
        assertEquals(expected, instance.getColumn1());
        
    }
    
    @Test(expected = Exception.class)
    public void testCheckInputColumn2Good() {
        
        column2 = 3;
        instance.checkInput(cards, pb, board, over);
        boolean expected = true;
        assertEquals(expected, instance.getColumn2());
        
    }
    
    
    // bad cases
    @Test(expected = Exception.class)
    public void testCheckInputRow1Bad() {
        
        row1 = Integer.parseInt("asdf");
        instance.checkInput(cards, pb, board, over);
        boolean expected = false;
        assertEquals(expected, instance.getRow1());
        
    }
    
    @Test(expected = Exception.class)
    public void testCheckInputRow2Bad() {
        
        row2 = 6;
        instance.checkInput(cards, pb, board, over);
        boolean expected = false;
        assertEquals(expected, instance.getRow2());
        
    }
    
    @Test(expected = Exception.class)
    public void testCheckInputColumn1Bad() {
        
        column1 = Integer.parseInt("@#$%");
        instance.checkInput(cards, pb, board, over);
        boolean expected = false;
        assertEquals(expected, instance.getColumn1());
        
    }
    
    @Test(expected = Exception.class)
    public void testCheckInputColumn2Bad() {
        
        column2 = 0;
        instance.checkInput(cards, pb, board, over);
        boolean expected = false;
        assertEquals(expected, instance.getColumn2());
        
    }

    
    // Boundary
    @Test(expected = Exception.class)
    public void testCheckInputRow1Boundary() {
        
        row1 = 1;
        instance.checkInput(cards, pb, board, over);
        boolean expected = true;
        assertEquals(expected, instance.getRow1());
        
    }
    
    @Test(expected = Exception.class)
    public void testCheckInputRow2Boundary() {
        
        row2 = 1;
        instance.checkInput(cards, pb, board, over);
        boolean expected = true;
        assertEquals(expected, instance.getRow2());
        
    }
    
    @Test(expected = Exception.class)
    public void testCheckInputColumn1Boundary() {
        
        column1 = 4;
        instance.checkInput(cards, pb, board, over);
        boolean expected = true;
        assertEquals(expected, instance.getColumn1());
        
    }
    
    @Test(expected = Exception.class)
    public void testCheckInputColumn2Boundary() {
        
        column2 = 4;
        instance.checkInput(cards, pb, board, over);
        boolean expected = true;
        assertEquals(expected, instance.getColumn2());
        
    }
    

}
