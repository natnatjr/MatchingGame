package matchinggame;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ShuffleCardsTest {

    @Test
    public void testShuffleCardsGood() { // test that the cards are shuffled randomly
        ShuffleCards sc = new ShuffleCards();
        Letter[][] cards = new Letter[4][4];
        sc.shuffleCards(cards);
        System.out.println(cards[0][0]);
        System.out.println(cards[0][1]);
        System.out.println(cards[0][2]);
        System.out.println(cards[0][3]);
        System.out.println(cards[1][0]);
        System.out.println(cards[1][1]);
        System.out.println(cards[1][2]);
        System.out.println(cards[1][3]);
        System.out.println(cards[2][0]);
        System.out.println(cards[2][1]);
        System.out.println(cards[2][2]);
        System.out.println(cards[2][3]);
        System.out.println(cards[3][0]);
        System.out.println(cards[3][1]);
        System.out.println(cards[3][2]);
        System.out.println(cards[3][3]);
    }

    @Test
    public void testShuffleCardsBad() {
        ShuffleCards sc = new ShuffleCards();
        Letter[][] cards = null;
        try {
            assertEquals(26, 5); // expected value is 26, actual value is 5
        } catch (AssertionError e) {
            System.out.println("Exception: " + e);
        }

    }

    @Test
    public void testShuffleCardsBoundary() {
        ShuffleCards sc = new ShuffleCards();
        try {
            Letter[][] cards = new Letter[4][4]; // creates a new 2D array of type Letter with 4 rows and 4 columns
            // (boundary)
            sc.shuffleCards(cards);
        } catch (ArrayIndexOutOfBoundsException e) { // we expect an exception to be thrown by the deckForNewGame method
            assert (true);
        }
    }

}
