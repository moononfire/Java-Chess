package game.board;

import game.board.spot.Spot;
import game.piece.Piece;

public class Board {

    Spot[][] spots;

    public Board() {
        spots = new Spot[8][8];
        for (int i = 0; i < 8; ++i) {
            for (int j = 0; j < 8; ++j) {
                spots[i][j] = new Spot();
            }
        }
    }

    public Spot spotAt(String XY) {
        char column = XY.charAt(0);
        char row = XY.charAt(1);

        return spots[row - 49][column - 65];
    }

    public Piece pieceAt(String XY) {
        Spot spot = spotAt(XY);
        return spot.getPiece();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 7; i >= 0; --i) {;
            for (int j = 0; j < 8; ++j) {
                Piece piece = spots[i][j].getPiece();
                if (piece == null) {
                    sb.append(" ");
                } else {
                    sb.append(piece);
                }
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}
