package matchinggame;

import java.util.InputMismatchException;

import java.util.Scanner;

public class CheckInput {
    public void checkInput(Letter[][] cards, PrintBoard pb, Letter[][] board, GameOver over)
            throws InputMismatchException, ArrayIndexOutOfBoundsException {

        try (Scanner scanner = new Scanner(System.in)) {
            try {
                do {
                    if (!over.gameOver(board)) {
                        System.out.println("Row: (1-4)");
                        int row1 = scanner.nextInt();
                        System.out.println("Column: (1-4)");
                        int column1 = scanner.nextInt();

                        if (!board[row1 - 1][column1 - 1].equals(Letter.X)) {
                            System.out.println("Already Entered!");
                            System.out.println();

                            pb.printBoard(board);
                            continue;
                        } else {
                            board[row1 - 1][column1 - 1] = cards[row1 - 1][column1 - 1];
                            pb.printBoard(board);
                        }

                        System.out.println("Row: (1-4)");
                        int row2 = scanner.nextInt();
                        System.out.println("Column: (1-4)");
                        int column2 = scanner.nextInt();

                        if ((row2 < 1 || row2 > 4) || (column2 < 1 || column2 > 4)) {
                            throw new ArrayIndexOutOfBoundsException("Only 1 to 4 is allowed");
                        }

                        if (!board[row2 - 1][column2 - 1].equals(Letter.X)) {
                            System.out.println("Already Entered!");
                            board[row1 - 1][column1 - 1] = Letter.X;
                            System.out.println();

                            pb.printBoard(board);
                            continue;
                        } else {
                            board[row2 - 1][column2 - 1] = cards[row2 - 1][column2 - 1];

                            if (board[row1 - 1][column1 - 1].equals(board[row2 - 1][column2 - 1])) {
                                pb.printBoard(board);
                                System.out.println("Correct!");
                            } else {
                                pb.printBoard(board);
                                System.out.println("False!");
                                board[row1 - 1][column1 - 1] = Letter.X;
                                board[row2 - 1][column2 - 1] = Letter.X;
                                pb.printBoard(board);
                            }
                        }
                    } else {
                        System.out.println("Game Over!");
                        break;
                    }
                } while (true);

            } catch (InputMismatchException e) {
                System.out.println("Invalid number of row or column");

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Only 1 to 4 is allowed");
                checkInput(cards, pb, board, over);
            }
        }
    }

    public void checkInput(int row, int column) { // for testing only
        // sorround with try catch block
        if (row < 1 || row > 4 || column < 1 || column > 4) {
            throw new ArrayIndexOutOfBoundsException("Only 1 to 4 is allowed");
        }

    }

    public void checkInput(String row, String column) { // for testing only (InputMismatchException)
        // sorround with try catch block
        if (row.equals("1") || row.equals("2") || row.equals("3") || row.equals("4")
                || column.equals("1") || column.equals("2") || column.equals("3") || column.equals("4")) {
            throw new ArrayIndexOutOfBoundsException("Only 1 to 4 is allowed");
        }

    }
}