package resolRossiniE;
import java.util.Scanner;

public class Ejercicio2 {
    public static void ejecutar(){
        System.out.println("Ingrese un número: ");
        Scanner scanner = new Scanner(System.in);
        int nro = scanner.nextInt();
        if (nro%2==0){

        System.out.println("Par");
    }
        else {
            System.out.println("Impar");
        }
        scanner.close();
}
}
