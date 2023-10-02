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
                guesses.add(guess);
                break;
            }catch(InputMismatchException e){
                System.out.println("Error:  debes ingresar un número");
                scanner.nextLine();
            }

        }
        return guess;
    }

    @Override
    public String getName(){
        System.out.println("Por favor introduce tu nombre: ");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        return name;
    }





}
