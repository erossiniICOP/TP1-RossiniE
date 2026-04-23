package resolRossiniE;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Ejercicio9 {
    public static void ejecutar(){
        
        System.out.println("Ingrese un texto: ");
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();
        StringTokenizer st = new StringTokenizer(texto);
        
        int totalPalabras = st.countTokens();
        
        System.out.println("Texto: " + texto);
        System.out.println("Número total de palabras: " + totalPalabras);
    
         scanner.close();
}
}