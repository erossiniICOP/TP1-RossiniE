package resolRossiniE;

import java.util.Scanner;

public class Ejercicio3 {
public static void ejecutar(){
        System.out.println("Ingrese un número: ");
        Scanner scanner = new Scanner(System.in);
        int nro = scanner.nextInt();
        System.out.println(nro + " x 1 = " + nro*1);
System.out.println(nro + " x 2 = " + nro*2);
System.out.println(nro + " x 3 = " + nro*3);
System.out.println(nro + " x 4 = " + nro*4);
System.out.println(nro + " x 5 = " + nro*5);
System.out.println(nro + " x 6 = " + nro*6);
System.out.println(nro + " x 7 = " + nro*7);
System.out.println(nro + " x 8 = " + nro*8);
System.out.println(nro + " x 9 = " + nro*9);
System.out.println(nro + " x 10 = " + nro*10);
scanner.close();
}
}