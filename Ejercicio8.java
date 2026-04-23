package resolRossiniE;
import java.util.Scanner;

public class Ejercicio8{
    public static void ejecutar(){
Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Fahrenheit a Celsius");
        System.out.print("Seleccione opcion: ");
        opcion = sc.nextInt();

        if (opcion == 1) {
            System.out.print("Ingrese grados Celsius: ");
            double celsius = sc.nextDouble();
            double fahrenheit = (celsius * 1.8) + 32;
            System.out.println(celsius + " C es: " + fahrenheit + " F");
        } else if (opcion == 2) {
            System.out.print("Ingrese grados Fahrenheit: ");
            double fahrenheit = sc.nextDouble();
            double celsius = (fahrenheit - 32) / 1.8;
            System.out.println(fahrenheit + " F es: " + celsius + " C");
        } else {
            System.out.println("Opcion no valida");
        }
        sc.close();
    }
}
