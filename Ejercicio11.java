package resolRossiniE;
import java.util.Scanner;

public class Ejercicio11 {

public static void ejecutar() {

    public static int calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
    }

   
       { Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de términos (n): ");
        int n = scanner.nextInt();
        
        System.out.println("Serie de Fibonacci hasta el término " + n + ":");
        
        for (int i = 0; i < n; i++) {
            System.out.print(calcularFibonacci(i) + " ");
        }
        
        scanner.close();
    }
    }
 
    

