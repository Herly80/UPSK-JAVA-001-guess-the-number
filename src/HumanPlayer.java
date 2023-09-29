import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class  HumanPlayer extends Player {
    public int makeGuess(){
        Scanner scanner = new Scanner(System.in);
        int guess;
        while(true){
            try{
                System.out.println(name + " Introduce un número entre 1 y 100: ");
                guess = scanner.nextInt();
                break;
            }catch(InputMismatchException e){
                System.out.println("Error:  debes ingresar un número");
                scanner.nextLine();
            }

        }
        return guess;
    }


    @Override
    public String getName() {
        return super.getName();
    }


    @Override
    public ArrayList<Integer> getGuesses(int number) {
        guesses.add(number);
        return guesses;
    }
}
