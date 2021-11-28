import game.board.Game;
import io.Input;

public class App {

    public static void main(String[] args) {
        Game game = new Game();
        game.setPlayerNames(new Input());
        game.start();
        while(game.isRunning()) {
            game.nextMove(new Input());
        }
    }
}
