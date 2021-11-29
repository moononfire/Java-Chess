package game.board;

import app.App;
import game.board.figure.*;
import game.move.Move;

public class Game {

    private Board board;

    private String activePlayer;

    private boolean isRunning;

    public Game() {
        this.board = new Board();
        isRunning = false;
    }

    public void start() {
        App.write("Chess game starts!");
        App.write("When moving a piece from A2 to B3 your input should be A2B3.");

        initiateBoard();
        isRunning = true;
        activePlayer = "white";

        while(isRunning) {
            nextMove();
        }
    }

    public void endGame(String result, String winner) {
        App.write("Chess game ends... with the result: " + result + "!");
        App.write(winner + " wins!");

        this.stop();
    }

    private void stop() {
        isRunning = false;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public Board getBoard() {
        return board;
    }

    public void nextMove() {
        while(!Move.nextMove(this));
    }

    public String getActivePlayer() {
        return this.activePlayer;
    }

    private void initiateBoard() {
        board.getField("A1").setPiece(new Rook("white"));
        board.getField("B1").setPiece(new Knight("white"));
        board.getField("C1").setPiece(new Bishop("white"));
        board.getField("D1").setPiece(new King("white"));
        board.getField("E1").setPiece(new Queen("white"));
        board.getField("F1").setPiece(new Bishop("white"));
        board.getField("G1").setPiece(new Knight("white"));
        board.getField("H1").setPiece(new Rook("white"));

        board.getField("A2").setPiece(new Pawn("white"));
        board.getField("B2").setPiece(new Pawn("white"));
        board.getField("C2").setPiece(new Pawn("white"));
        board.getField("D2").setPiece(new Pawn("white"));
        board.getField("E2").setPiece(new Pawn("white"));
        board.getField("F2").setPiece(new Pawn("white"));
        board.getField("G2").setPiece(new Pawn("white"));
        board.getField("H2").setPiece(new Pawn("white"));

        board.getField("H8").setPiece(new Rook("black"));
        board.getField("G8").setPiece(new Knight("black"));
        board.getField("F8").setPiece(new Bishop("black"));
        board.getField("E8").setPiece(new King("black"));
        board.getField("D8").setPiece(new Queen("black"));
        board.getField("C8").setPiece(new Bishop("black"));
        board.getField("B8").setPiece(new Knight("black"));
        board.getField("A8").setPiece(new Rook("black"));

        board.getField("H7").setPiece(new Pawn("black"));
        board.getField("G7").setPiece(new Pawn("black"));
        board.getField("F7").setPiece(new Pawn("black"));
        board.getField("E7").setPiece(new Pawn("black"));
        board.getField("D7").setPiece(new Pawn("black"));
        board.getField("C7").setPiece(new Pawn("black"));
        board.getField("B7").setPiece(new Pawn("black"));
        board.getField("A8").setPiece(new Pawn("black"));
    }

}
