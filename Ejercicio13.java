package resolRossiniE;

public class Ejercicio13 {
public static void ejecutar(){
public static void main(String[] args) {
        // 1. Arreglo unidimensional para nombres de 3 estudiantes
        String[] nombres = {"Juan", "Maria", "Pedro"};

        // 2. Arreglo bidimensional para notas (3 estudiantes x 3 materias)
        // Filas = Estudiantes, Columnas = Materias
        double[][] notas = {
            {8.5, 9.0, 7.5}, // Notas de Juan
            {10.0, 9.5, 9.0},// Notas de Maria
            {6.0, 7.0, 5.5}  // Notas de Pedro
        };

        System.out.println("--- Promedio de Notas ---");

        // 3. Mostrar el promedio de notas de cada estudiante
        for (int i = 0; i < nombres.length; i++) {
            double suma = 0;
            
            // Sumar las notas de la fila i (materias)
            for (int j = 0; j < notas[i].length; j++) {
                suma += notas[i][j];
            }
            
            // Calcular promedio
            double promedio = suma / notas[i].length;
            
            // Mostrar nombre y promedio
            System.out.printf("Estudiante: %s - Promedio: %.2f%n", nombres[i], promedio);
        }

}
}
}
