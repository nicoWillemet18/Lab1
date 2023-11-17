import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Obtener dimensiones de la matriz
        System.out.print("Ingrese el número de filas de la matriz: ");
        int filas = scanner.nextInt();

        System.out.print("Ingrese el número de columnas de la matriz: ");
        int columnas = scanner.nextInt();

        // Crear y leer la matriz
        int[][] matriz = leerMatriz(filas, columnas);

        // Calcular la matriz transpuesta
        int[][] matrizTranspuesta = obtenerMatrizTranspuesta(matriz);

        // Mostrar la matriz transpuesta
        System.out.println("Matriz Transpuesta:");
        mostrarMatriz(matrizTranspuesta);
    }

    static int[][] leerMatriz(int filas, int columnas) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los elementos de la matriz:");

        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese el elemento en la posición [" + (i) + "][" + (j) + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        return matriz;
    }

    static int[][] obtenerMatrizTranspuesta(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        int[][] matrizTranspuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizTranspuesta[j][i] = matriz[i][j];
            }
        }

        return matrizTranspuesta;
    }

    static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
