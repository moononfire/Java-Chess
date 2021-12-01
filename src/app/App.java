package app;

import game.Game;
import game.board.Board;
import io.Input;
import io.Output;

public class App {

    public static Input input = new Input();
    public static Output output = new Output();

    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }

    public static void write(String message) {
        output.writeToConsole(message);
    }

    public static String getUserInput() {
        return input.getMove();
    }

    public static String writeThenGetInput(String message) {
        write(message);
        return getUserInput();
    }
}
