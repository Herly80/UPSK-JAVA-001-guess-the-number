import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {

    private static Random random = new Random();
    static int targetNumber = random.nextInt(100) + 1;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Attempts = 0;
        int guess;

        Scanner addName = new Scanner(System.in);
        System.out.println("¡Bienvenido al divertido juego de adivina tu número!!");
        System.out.println("Ingresa tu nombre: ");
        String namePlayer = addName.nextLine();
        Player humanPlayer = new HumanPlayer(namePlayer);
        System.out.println("Hola " + humanPlayer.getName() + " Introduce un número entre 1 y 100.");

        do {
            System.out.println("Escribe tu numero: ");
            guess = scanner.nextInt();
            Attempts++;

            if (guess > targetNumber) {
                System.out.println(humanPlayer.getName() + " Intenta un numero mas bajo");
            } else if (guess < targetNumber) {
                System.out.println(humanPlayer.getName() + " Intenta un numero mas alto");
            } else {
                System.out.println(humanPlayer.getName() + " Felicitaciones!! Adivinaste!!");
                System.out.println("El número era: " + targetNumber);
                System.out.println("Numeros de intentos: " + Attempts);
            }

        } while (guess != targetNumber);
        scanner.close();


    }
}





   /*try {
           guess = scanner.nextInt();
           } catch (NumberFormatException e) {
           JOptionPane.showMessageDialog(null, "Error:  debes ingresar un número");
           main(args);
           System.exit(0);
           }

    */