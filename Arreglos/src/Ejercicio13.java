import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Obtener el orden del cuadrado latino (N)
        System.out.print("Ingrese el orden del cuadrado latino (N): ");
        int n = scanner.nextInt();

        // Generar e imprimir el cuadrado latino
        int[][] cuadradoLatino = generarCuadradoLatino(n);
        imprimirCuadradoLatino(cuadradoLatino);
    }

    static int[][] generarCuadradoLatino(int n) {
        int[][] cuadradoLatino = new int[n][n];

        // Inicializar la primera fila con los N primeros números naturales
        for (int i = 0; i < n; i++) {
            cuadradoLatino[0][i] = i + 1;
        }

        // Generar las filas restantes rotando la fila anterior un lugar a la derecha
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cuadradoLatino[i][j] = cuadradoLatino[i - 1][(j - 1 + n) % n];
            }
        }

        return cuadradoLatino;
    }

    static void imprimirCuadradoLatino(int[][] cuadradoLatino) {
        System.out.println("Cuadrado Latino:");
        for (int i = 0; i < cuadradoLatino.length; i++) {
            for (int j = 0; j < cuadradoLatino[i].length; j++) {
                System.out.print(cuadradoLatino[i][j] + "\t");
            }
            System.out.println();
        }
    }
}