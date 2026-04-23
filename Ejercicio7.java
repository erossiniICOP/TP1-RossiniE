package resolRossiniE;

import java.util.Scanner;
public class Ejercicio7 {
public static void ejecutar(){
Scanner scanner = new Scanner(System.in);
        int opcion;
        double num1, num2, resultado;
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- MENÚ DE OPCIONES ---");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Introduce segundo número: ");
                    num2 = scanner.nextDouble();
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 2:
                    System.out.print("Introduce primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Introduce segundo número: ");
                    num2 = scanner.nextDouble();
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 3:
                    System.out.print("Introduce primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Introduce segundo número: ");
                    num2 = scanner.nextDouble();
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 4:
                    System.out.print("Introduce primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Introduce segundo número: ");
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado: " + resultado);
                    } else {
                        System.out.println("Error: División por cero no permitida.");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida, intenta de nuevo.");
            }
        }
        scanner.close();
    }
}
