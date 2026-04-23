package resolRossiniE;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Ejercicio14 {
public static void ejecutar(){
   public static void main(String[] args) {
        // Matriz inicial con ceros
        int[][] matriz = {
            {1, 0, 3, 0},
            {0, 0, 0, 0}, // Esta fila será eliminada
            {5, 6, 0, 8},
            {0, 0, 0, 0}, // Esta fila será eliminada
            {9, 0, 11, 12}
        };

        System.out.println("--- Matriz Inicial ---");
        mostrar(matriz);

        int[][] resultado = procesarMatriz(matriz);

        System.out.println("\n--- Matriz Resultante (sin ceros ni filas llenas) ---");
        mostrar(resultado);
    }

    // Método "mostrar" requerido
    public static void mostrar(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }

    public static int[][] procesarMatriz(int[][] matriz) {
        List<int[]> filasValidas = new ArrayList<>();

        for (int[] fila : matriz) {
            boolean todaCero = true;
            // Verificar si la fila no está llena de ceros
            for (int elemento : fila) {
                if (elemento != 0) {
                    todaCero = false;
                    break;
                }
            }

            // Si la fila tiene al menos un número distinto de cero, la agregamos
            if (!todaCero) {
                // Opcional: Si necesitas quitar ceros INDIVIDUALES dentro de la fila, 
                // pero mantener la estructura de la columna, este código solo elimina filas completas.
                // Basado en el requerimiento "eliminar líneas llenas", esto cumple la función.
                filasValidas.add(fila);
            }
        }

        // Convertir la lista nuevamente a una matriz 2D
        return filasValidas.toArray(new int[filasValidas.size()][]);
    }
}
}
