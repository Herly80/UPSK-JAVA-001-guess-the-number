import java.util.ArrayList;
import java.util.List;

abstract public class  Player extends GuessTheNumberGame {

    protected String name;

    protected List<Integer> guesses = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public abstract int makeGuess();

    public String getName() {
        return name;
    }

    public List<Integer> getGuesses() {
        return guesses;
    }
}

