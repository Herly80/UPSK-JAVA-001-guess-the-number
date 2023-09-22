import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int intentos = 0;
        int guess;
        System.out.println("Bienvenido a Guess The Number!!");
        System.out.println("Adivina un numero entre 1 y 100");

        do {
            System.out.println("Escribe tu numero: ");
            guess = scanner.nextInt();
            intentos++;

            if (guess > randomNumber) {
                System.out.println("Intenta un numero mas bajo");
            } else if (guess < randomNumber) {
                System.out.println("Intenta un numero mas alto");
            } else {
                System.out.println("Felicitaciones!! Adivinaste!!");
                System.out.println("Numeros de intentos: " + intentos);
            }
        } while (guess != randomNumber);
        scanner.close();
    }

}