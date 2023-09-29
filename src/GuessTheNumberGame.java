import java.util.ArrayList;
import java.util.Random;
public class GuessTheNumberGame {
    public static int randomNumber() {
        Random random = new Random();
        return random.nextInt(100) +1;
    }

    public static void main(String[] args) {
        System.out.println("¡¡Bienvenido al divertido juego de adivina tu número!!");
        int targetNumber = randomNumber();
        System.out.println(targetNumber);
        checkGuess(targetNumber);
    }
    public static void checkGuess(int args){
        int guess = 0;
        HumanPlayer humanPlayer = new HumanPlayer();
        ComputerPlayer computerPlayer = new ComputerPlayer();


        String humanName = humanPlayer.getName();
        int humanNumber = humanPlayer.makeGuess();



        int computerNumber = computerPlayer.makeGuess();
        ArrayList<Integer> attemptsHuman;
        ArrayList<Integer> attemptsComputer = new ArrayList<>();


        while(guess >= 0){
            if(guess % 2 ==0){

                if(args > humanNumber){
                    System.out.println(humanName + " " +  humanNumber + " Introduce un número más alto . ");
                    guess ++;
                    computerNumber = computerPlayer.makeGuess();


                }else if(args < humanNumber){
                    System.out.println(humanName + " " + humanNumber + " Introduce un número más bajo. ");
                    humanPlayer.getGuesses(humanNumber);
                    guess++;
                    computerNumber = computerPlayer.makeGuess();

                }else{
                    attemptsHuman = humanPlayer.getGuesses(humanNumber);
                    System.out.println("¡¡Felicitaciones!! " + humanName +" Acertaste ");
                    System.out.println("Tus números fueron: " + attemptsHuman);
                    break;
                }
            }else{
                if(args > computerNumber){
                    System.out.println("Computadora: " + computerNumber + " Introduce un número más alto  " );
                    System.out.println(" Es tu turno: "+ humanName);
                    attemptsComputer = computerPlayer.getGuesses(computerNumber);
                    guess ++;
                    humanNumber = humanPlayer.makeGuess();

                }else if(args < computerNumber) {
                    System.out.println("Computadora: " + computerNumber + " Introduce un número más bajo");
                    System.out.println(" Es tu turno: " + humanName);
                    attemptsComputer = computerPlayer.getGuesses(computerNumber);
                    guess++;
                    humanNumber = humanPlayer.makeGuess();

                }else{
                    System.out.println("La computadora ganó!!");
                    System.out.println("Sus números fueron: " + attemptsComputer);
                    break;
                }

            }

        }


    }
}





