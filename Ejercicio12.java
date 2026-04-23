package resolRossiniE;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio12 {
     public static void ejecutar(){
Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        Arrays.sort(numeros);
        int[] ordenadoMayorMenor = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            ordenadoMayorMenor[i] = numeros[numeros.length - 1 - i];
        }

        System.out.println("Números ordenados de mayor a menor: " + Arrays.toString(ordenadoMayorMenor));
        
        scanner.close();
}
}