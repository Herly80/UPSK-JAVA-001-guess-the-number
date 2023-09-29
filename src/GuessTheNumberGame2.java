import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int Attempts = 0;
        int guess;
        System.out.println("Bienvenidos al divertido juego de Adivina el número!!");
        System.out.println("Cuál es tu nombre??");
        String namePlayer = scanner.nextLine();
        System.out.println(namePlayer +  " Adivina un numero entre 1 y 100");


        do {
            System.out.println("Escribe tu numero: ");
            guess = scanner.nextInt();
            Attempts++;

            if (guess > randomNumber) {
                    System.out.println("Intenta un numero mas bajo");
                } else if (guess < randomNumber) {
                    System.out.println("Intenta un numero mas alto");
                } else {
                    System.out.println("Felicitaciones!! Adivinaste!!");
                    System.out.println("Numeros de intentos: " + Attempts);
                }

        } while (guess != randomNumber);
        scanner.close();
    }

}