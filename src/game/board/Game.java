package game.board;

import io.Input;
import game.player.BlackPlayer;
import game.player.Player;
import game.player.WhitePlayer;
import io.Output;

public class Game {

    private Board board;

    private Player player1;

    private Player player2;

    private Player activePlayer;

    private boolean isRunning;

    public Game() {
        this.board = new Board();
        isRunning = false;
    }

    public void start() {
        Output.write("Chess game starts!");
        Output.write("RULES: " +
                "1. When moving a figure from A2 to B3 you write A2-B3 as your move.");
        isRunning = true;
        activePlayer = player1;
    }

    public void setPlayerNames(Input input) {
        String name1 = input.get("Name of 1st player:");
        player1 = new WhitePlayer(name1);

        String name2 = input.get("Name of 2nd player:");
        player2 = new BlackPlayer(name2);
    }

    public void stop() {
        Output.write("Chess game ends...");
        isRunning = false;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void nextMove(Input input) {
        String name1 = input.get("Your move:");

        if (activePlayer == player1) {
            activePlayer = player2;
        } else {
            activePlayer = player1;
        }
    }
}
