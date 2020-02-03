package de.hdm_stuttgart.mi.WichtigeUebungen.TicTacToe;

public class Board {

    public enum Player {

        // Enum
        PLAYER1("Jim", 'O'),
        PLAYER2("Eve", 'X');

        // Instance variables
        public final String nickname;
        public final char representation;

        Player(final String nickname, final char representation) {
            this.nickname = nickname;
            this.representation = representation;
        }

        // Getter
        public Player getOtherPlayer() {
            switch (this) {
                case PLAYER1:
                    return PLAYER2;
                case PLAYER2:
                    return PLAYER1;
                default:
                    return null;
            }
        }

        // ToString
        @Override
        public String toString() {
            return "" + representation;
        }
    }

    public final short width = 3;
    public final short height = 3;                                         // 3 x 3 board

    private short numberOfMoves = 0;                                       // Game will be over after a maximum of 9 moves
    private Player currentActivePlayer = Player.PLAYER1;                   // Player 1 will start with first move
    final Player[][] board = new Player[width][height];                    // Allocating a two dimensional array, yet empty.

    // Constructor
    public Board() {
        for (int x = 0; x < width; x++) {                                   // Initialize board with null values (still empty).
            for (int y = 0; y < height; y++) {
                board[x][y] = null;
            }
        }
    }

    public Player evaluateWinner() {
        for (int i = 0; i < height; i++) {
            if (null != board[0][i]&&
                    board[0][i] == board[1][i] && board[1][i] == board[2][i]) { // check rows
                return board[0][i];
            } else if (null != board[i][0] &&
                    board[i][0] == board[i][1] && board[i][1] == board[i][2]) { // check columns
                return board[i][0];
            }
        }
        if (board[1][1] != null &&
                ((board[0][0] == board[1][1] && board[1][1] == board[2][2])    // check diagonal upper left to lower right
                        || (board[0][2] == board[1][1] && board[1][1] == board[2][0])) // check diagonal lower left to upper right
        ) {
            return board[1][1];
        }
        return null;
    }

    /** Occupy the next field by player {@link #getCurrentActivePlayer()}.
     * Fields are being numbered by:
     *
     *  0|1|2
     *  -+-+-
     *  3|4|5
     *  -+-+-
     *  6|7|8
     *
     * @param field The field in question
     *
     * @return An error message indication either an occupied field or an index violation.
     *          null if everything is o.K.
     */
    public String nextMove(int field) {

        if (field < 0 || width * height <= field) {
            return "Field index out of range (0 ..." +
                    (width * height - 1) + ")";
        } else {

            final int x = field % width, y = field / width;

            final Player current = board[y][x];
            if (current == null) {
                board[y][x] = currentActivePlayer;
                currentActivePlayer = currentActivePlayer.getOtherPlayer();
                numberOfMoves++;
                return null;
            } else {
                return "Field already occupied by " + current.nickname;
            }
        }
    }

    /**
     * Provide numbering hint to user, see {@link #nextMove(int)}
     */
    public void printNumberingHint() {
        System.out.println("Numbering scheme:\n");
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                System.out.print((char)('0' + x + y * width));
                if (x < height - 1) {
                    System.out.print('|');
                }
            }
            if (y < height - 1) {
                System.out.println("\n-+-+-");
            }
        }
    }

    /** Get the player instance which will do the next move. See {@link #nextMove(int)}
     * @return the currently active player.
     */
    public Player getCurrentActivePlayer() {
        return currentActivePlayer;
    }

    /** After nine moves all fields will have been occupied.
     * @return true if all possible moves have been completed, false otherwise.
     */
    public boolean allMovesFinished() {
        return width * height <= numberOfMoves;
    }

    /** Publish the current state to standard output using
     * ASCII graphics.
     */
    public void print() {
        for (int clear = 0; clear < 20; clear++) {
            System.out.println("\n");
        }
        printNumberingHint();

        System.out.println("\n\nPlayer " + Player.PLAYER1.nickname + "("
                + Player.PLAYER1.representation + ")" + " vs. " + Player.PLAYER2.nickname
                + "(" + Player.PLAYER2.representation + ")");
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                System.out.print(null == board[x][y] ? ' ' : board[x][y]);
                if (y < height - 1) {
                    System.out.print('|');
                }
            }
            if (x < height - 1) {
                System.out.println("\n-+-+-");
            }
        }
    }
}