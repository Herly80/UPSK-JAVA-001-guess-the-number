import java.util.ArrayList;
import java.util.Scanner;

abstract class Player {
    String name;

    ArrayList<Integer> guesses = new ArrayList<>();

    abstract int makeGuess();
    public String getName(){
        System.out.println("Por favor introduce tu nombre: ");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        return name;
    }
    public ArrayList<Integer> getGuesses(int number){
        return guesses;
    }

}


