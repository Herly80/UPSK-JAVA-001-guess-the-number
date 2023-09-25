import java.util.Random;

public class ComputerPlayer extends Player {

    private Random random = new Random();


    public ComputerPlayer(String name, int targetNumber) {
        super(name);
        GuessTheNumberGame.targetNumber = targetNumber;

    }


    public int makeGuess() {
        int guess = random.nextInt(100) + 1;
        guesses.add(guess);
        System.out.println(guess);
        return guess;
    }
}


