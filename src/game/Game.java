package game;

import app.App;
import game.board.Board;
import game.piece.*;


public class Game {

    private String activePlayer;

    private boolean checkMate;

    private Board board;

    private boolean mate;

    public void start() {
        App.write("Chess game starts!");
        App.write("When moving a piece from A2 to B3 your input should be A2B3.");

        initiateBoard();
        checkMate = false;
        mate = false;
        activePlayer = "white";

        while(!checkMate) {
            App.write(board.toString());

            String move = App.writeThenGetInput("Your move " + activePlayer + ":");
            String startPos = move.substring(0, 2);
            String endPos = move.substring(2, 4);

            if (validateMove(startPos, endPos)) {
                mate = false;
                Piece movedPiece = board.spotAt(startPos).getPiece();
                board.spotAt(endPos).setPiece(movedPiece);
                board.spotAt(startPos).setPiece(null);

                if (activePlayer.equals("white")) {
                    activePlayer = "black";
                } else {
                    activePlayer = "white";
                }
            } else {
                App.write("Incorrect move! Try again...");
            }
        }

        App.getUserInput();
    }

    public boolean validateMove(String startPos, String endPos) {
        if (board.spotAt(startPos).getPiece() == null) {
            App.write("There is no piece at the starting position!");
            return false;
        }

        if (!board.spotAt(startPos).getPiece().getColor().equals(activePlayer)) {
            App.write("You are only allowed to move your pieces!");
            return false;
        }

        if(board.spotAt(endPos).isOccupied() && board.pieceAt(endPos).getColor().equals(activePlayer)) {
            App.write("You cannot move a piece to where your another piece stands!");
            return false;
        }

        if (mate && !board.pieceAt(startPos).getName().equals("King")) {
            App.write("During a mate you must move the King!");
            return false;
        }

        if(!board.spotAt(startPos).getPiece().isMoveValid(startPos, endPos, board)) {
            App.write("This piece cannot move in this way!");
            return false;
        }

        if (checkForMate(startPos, endPos)) {
            App.write("Mate!");
            mate = true;
        }

        if (checkForCheckmate(startPos, endPos)) {
            App.write("Checkmate!");
            App.write(activePlayer + " wins!");
        }

        return true;
    }

    //check if any of the opposite standing pieces can hurt the King
    public boolean checkForMate(String startPos, String endPos) {
        if (false) {
            return true;
        }

        return false;
    }

    public void setMateTrue() {
        mate = true;
    }

    //check if any of the opposite standing pieces can hurt the King AND if the King can move
    public boolean checkForCheckmate(String startPos, String endPos) {
        if (false) {
            if (false) {
                checkMate = true;
                return true;
            }
        }

        return false;
    }

    public void setCheckmateTrue() {
        checkMate = true;
    }

    private void initiateBoard() {
        board = new Board();

        board.spotAt("A1").setPiece(new Rook("white"));
        board.spotAt("B1").setPiece(new Bishop("white"));
        board.spotAt("C1").setPiece(new Knight("white"));
        board.spotAt("D1").setPiece(new Queen("white"));
        board.spotAt("E1").setPiece(new King("white"));
        board.spotAt("F1").setPiece(new Knight("white"));
        board.spotAt("G1").setPiece(new Bishop("white"));
        board.spotAt("H1").setPiece(new Rook("white"));

        board.spotAt("A2").setPiece(new Pawn("white"));
        board.spotAt("B2").setPiece(new Pawn("white"));
        board.spotAt("C2").setPiece(new Pawn("white"));
        board.spotAt("D2").setPiece(new Pawn("white"));
        board.spotAt("E2").setPiece(new Pawn("white"));
        board.spotAt("F2").setPiece(new Pawn("white"));
        board.spotAt("G2").setPiece(new Pawn("white"));
        board.spotAt("H2").setPiece(new Pawn("white"));

        board.spotAt("A8").setPiece(new Rook("black"));
        board.spotAt("B8").setPiece(new Bishop("black"));
        board.spotAt("C8").setPiece(new Knight("black"));
        board.spotAt("D8").setPiece(new Queen("black"));
        board.spotAt("E8").setPiece(new King("black"));
        board.spotAt("F8").setPiece(new Knight("black"));
        board.spotAt("G8").setPiece(new Bishop("black"));
        board.spotAt("H8").setPiece(new Rook("black"));

        board.spotAt("A7").setPiece(new Pawn("black"));
        board.spotAt("B7").setPiece(new Pawn("black"));
        board.spotAt("C7").setPiece(new Pawn("black"));
        board.spotAt("D7").setPiece(new Pawn("black"));
        board.spotAt("E7").setPiece(new Pawn("black"));
        board.spotAt("F7").setPiece(new Pawn("black"));
        board.spotAt("G7").setPiece(new Pawn("black"));
        board.spotAt("H7").setPiece(new Pawn("black"));
    }

}
