package resolRossiniE;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio6 {
public static void ejecutar(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100);
        int intento = 0;
        int numeroUsuario = 0;
        boolean adivinado = false;

        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("He seleccionado un número entre 1 y 100.");
        System.out.println("¡Intenta adivinarlo!");

        while (!adivinado) {
            System.out.print("Introduce tu número: ");
            if (scanner.hasNextInt()) {
                numeroUsuario = scanner.nextInt();
                intento++;

                if (numeroUsuario == numeroSecreto) {
                    adivinado = true;
                    System.out.println("¡Felicidades! Adivinaste el número en " + intento + " intentos.");
                } else if (numeroUsuario < numeroSecreto) {
                    System.out.println("Más alto... (Intenta con un número mayor)");
                } else {
                    System.out.println("Más bajo... (Intenta con un número menor)");
                }
            } else {
                System.out.println("Por favor, introduce un número válido.");
                scanner.next();
            }
        }
        scanner.close();
    }
}