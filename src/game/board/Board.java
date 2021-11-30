package game.board;

import game.board.spot.Spot;

public class Board {

    Spot[][] spots;

    public Board() {
        spots = new Spot[8][8];
    }

    public Spot spotAt(String XY) {
        char row = XY.charAt(0);
        char column = XY.charAt(1);

        return spots[row - 65][column - 49];
    }
}
