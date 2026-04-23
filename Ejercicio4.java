package resolRossiniE;
import java.util.Scanner;
public class Ejercicio4 {
public static void ejecutar(){
    System.out.println("Ingrese una palabra: ");
        Scanner scanner = new Scanner(System.in);
        String palabra = scanner.nextLine();
        char[] caracteres = palabra.toCharArray();
        int contador = 0;
        for(int i=0; i < caracteres.length; i++){
        if (caracteres[i]=='a'|| caracteres[i]=='e' || caracteres[i]=='i' || caracteres[i]=='o' || caracteres[i]=='u'|| caracteres[i]=='A'|| caracteres[i]=='E' || caracteres[i]=='I' || caracteres[i]=='O' || caracteres[i]=='U')
            {contador++;
        }else {
            continue;
        }
}
 System.out.println("Cantidad de vocales: " + contador);
 scanner.close();
}
}