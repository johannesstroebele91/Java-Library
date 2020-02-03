package de.hdm_stuttgart.mi.Enum;
// Enum, not class!

public enum Player {

    // Defining enums
    PLAYER1("Jim", 'O'),
    PLAYER2("Eve", 'X');

    public final String nickname;
    public final char representation;

    // Constructor
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

/* CLASS ALTERNATIVE
public class Player {

  final public static Player
    PLAYER1 = new Player ("Jim", 'O'),
    PLAYER2 = new Player("Eve", 'X');

    public final String nickname;
    public final char representation;

    Player(final String nickname, final char representation) {
      this.nickname = nickname;
      this.representation = representation;
    }

    public Player getOtherPlayer() {

      if (PLAYER1 == this) {
        return PLAYER2;
      } else if (PLAYER2 == this) {
        return PLAYER1;
      } else {
        return null;
      }
    }

    @Override
    public String toString() {
      return "" + representation;
    }
}
*/