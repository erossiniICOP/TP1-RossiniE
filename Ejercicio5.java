package resolRossiniE;
import java.util.Scanner;
public class Ejercicio5 {
public static void ejecutar(){
    System.out.println("Ingrese una palabra: ");
    Scanner scanner = new Scanner(System.in);
        String cadena = scanner.nextLine();
        String invertida = "";
        int strLength = cadena.length();
        for (int i = (strLength - 1); i >=0; --i) {
        invertida = invertida + cadena.charAt(i);
    }
        if (cadena.toLowerCase().equals(invertida.toLowerCase())){
             System.out.println("Esta palabra es un palíndromo");
        }
        else{
            System.out.println("Esta palabra no es un palíndromo");
        }
        scanner.close();
     }

    }