package matchinggame;


import java.util.Scanner;

public class MatchingGame {

    public static Letter[][] cards = new Letter[4][4];
    public static Letter[][] board = new Letter[0][0];
    public static ShuffleCards shuffle = new ShuffleCards();
    public static deckForNewGame deck = new deckForNewGame();
    public static GameOver over = new GameOver();
    public static PrintBoard pb = new PrintBoard();
    public static CheckInput ci = new CheckInput();

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("Press n for new game, q to quit");
            String nq = scanner.nextLine();
            if (nq.equals("q")) {
                System.out.println("Exitting...");
                break;
            } else if (nq.equals("n")) {

                shuffle.shuffleCards(cards);

                deck.deckForNewGame1(board);

                over.gameOver(board);

                pb.printBoard(board);

                ci.checkInput(cards, pb, board, over);
                break;
            } else {
                System.out.println("Invalid Character");
                continue;
            }
        }
    }
}
