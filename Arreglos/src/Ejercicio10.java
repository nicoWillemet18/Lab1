import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Obtener dimensiones de las matrices
        System.out.print("Ingrese el número de filas de las matrices: ");
        int filas = scanner.nextInt();

        System.out.print("Ingrese el número de columnas de las matrices: ");
        int columnas = scanner.nextInt();

        // Crear matrices A y B
        int[][] matrizA = leerMatriz("A", filas, columnas);
        int[][] matrizB = leerMatriz("B", filas, columnas);

        // Sumar las matrices A y B
        int[][] matrizC = sumarMatrices(matrizA, matrizB);

        // Mostrar la matriz suma (matrizC)
        System.out.println("Matriz suma (A + B):");
        mostrarMatriz(matrizC);
    }

    static int[][] leerMatriz(String nombre, int filas, int columnas) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los elementos de la matriz " + nombre + ":");

        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese el elemento en la posición [" + (i) + "][" + (j) + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        return matriz;
    }

    static int[][] sumarMatrices(int[][] matrizA, int[][] matrizB) {
        int filas = matrizA.length;
        int columnas = matrizA[0].length;
        int[][] matrizC = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        return matrizC;
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