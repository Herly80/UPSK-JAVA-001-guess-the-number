import java.util.ArrayList;


abstract class Player {
    String name;

    ArrayList<Integer> guesses = new ArrayList<>();

    abstract int makeGuess();

    public ArrayList<Integer> getGuesses(int humanNumber){
        return guesses;
    }

    public String getName() {
        return name;
    }

}


