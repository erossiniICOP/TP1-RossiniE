package resolRossiniE;
import java.util.Scanner;
public class Ejercicio10 {
public static void ejecutar(){
Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una contraseña: ");
        String password = sc.nextLine();

        if (esSegura(password)) {
            System.out.println("La contraseña es segura.");
        } else {
            System.out.println("La contraseña NO es segura. Asegúrese de cumplir los requisitos:");
            System.out.println("- Al menos 8 caracteres.");
            System.out.println("- Al menos 2 letras mayúsculas.");
            System.out.println("- Al menos 3 letras minúsculas.");
            System.out.println("- Al menos 2 dígitos numéricos.");
        }
        sc.close();
    }

    
    public static boolean esSegura(String password) {
        if (password.length() < 8) {
            return false;
        }

        int mayusculas = 0;
        int minusculas = 0;
        int digitos = 0;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                mayusculas++;
            } else if (Character.isLowerCase(c)) {
                minusculas++;
            } else if (Character.isDigit(c)) {
                digitos++;
            }
        }

        return mayusculas >= 2 && minusculas >= 3 && digitos >= 2;
    }

}
