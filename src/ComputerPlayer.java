import java.util.ArrayList;
import java.util.Random;

public class ComputerPlayer extends Player {

    Random random = new Random();

    @Override
    int makeGuess() {
        return random.nextInt(100)+1;
    }
    @Override
    public ArrayList<Integer> getGuesses(int number) {
        guesses.add(number);
        return guesses;
    }
}


