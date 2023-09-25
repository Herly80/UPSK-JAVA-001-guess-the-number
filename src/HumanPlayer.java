import java.util.Scanner;

public class HumanPlayer extends Player {

    private Scanner scanner = new Scanner(System.in);


    public HumanPlayer(String name) {
        super(name);
    }

    @Override
    public int makeGuess() {
        System.out.print(name + ", ingresa tu número: ");
        int guess = scanner.nextInt();
        guesses.add(guess);
        return guess;
    }
}
