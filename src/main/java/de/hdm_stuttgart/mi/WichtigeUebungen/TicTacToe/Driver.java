package de.hdm_stuttgart.mi.WichtigeUebungen.TicTacToe;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        // See https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html
        try (final Scanner scan = new Scanner(System.in)) {

            final Board board = new Board();

            board.printNumberingHint();

            Board.Player winner;

            do {
                do {
                    System.out.print("\n\n" + board.getCurrentActivePlayer().nickname + ", please enter next field's number:");
                    final short nextField = scan.nextShort();
                    final String errorMessage = board.nextMove(nextField);
                    if (null == errorMessage) {
                        break;  // We made it, quit loop.
                    } else {
                        System.err.println(errorMessage);
                    }
                } while (true);
                board.print();
            } while (null == (winner = board.evaluateWinner()) && !board.allMovesFinished());

            if (null == winner) {
                System.out.println("\n\nGame over: draw");
            } else {
                System.out.println("\n\nCongratulations, " + winner.nickname);
            }
        }
    }

}
