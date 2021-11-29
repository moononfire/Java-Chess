package game.move;

import app.App;
import game.board.Game;
import game.board.figure.Piece;
import game.validator.MoveValidator;

public class Move {

    public static boolean nextMove(Game game) {
        String activePlayer = game.getActivePlayer();
        String move = App.writeThenGetInput("Your move:");
        if (MoveValidator.validateMove(game, activePlayer, move)) {
            Piece piece = game.getBoard().getField(move.substring(0, 2)).getPiece();
            System.out.println(move.substring(2, 4));
            game.getBoard().getField(move.substring(2, 4)).setPiece(piece);
            return true;
        } else {
            App.write("Incorrect move!");
            return false;
        }
    }
}
