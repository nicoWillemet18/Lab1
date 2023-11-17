import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Obtener el orden del cuadrado mágico (N)
        System.out.print("Ingrese el orden del cuadrado mágico (N, debe ser un número impar): ");
        int n = scanner.nextInt();

        // Validar que N sea un número impar
        if (n % 2 == 0) {
            System.out.println("El orden debe ser un número impar.");
            return;
        }

        // Generar e imprimir el cuadrado mágico
        int[][] cuadradoMagico = generarCuadradoMagico(n);
        imprimirCuadradoMagico(cuadradoMagico);
    }

    static int[][] generarCuadradoMagico(int n) {
        int[][] cuadradoMagico = new int[n][n];

        // Inicializar posición inicial en la fila media y columna final
        int fila = 0;
        int columna = n / 2;

        for (int i = 1; i <= n * n; i++) {
            cuadradoMagico[fila][columna] = i;

            // Calcular la siguiente posición
            int nuevaFila = (fila - 1 + n) % n;
            int nuevaColumna = (columna + 1) % n;

            // Si la posición ya está ocupada, colocar en la fila siguiente
            if (cuadradoMagico[nuevaFila][nuevaColumna] != 0) {
                fila = (fila + 1) % n;
            } else {
                fila = nuevaFila;
                columna = nuevaColumna;
            }
        }

        return cuadradoMagico;
    }

    static void imprimirCuadradoMagico(int[][] cuadradoMagico) {
        System.out.println("Cuadrado Mágico:");
        for (int i = 0; i < cuadradoMagico.length; i++) {
            for (int j = 0; j < cuadradoMagico[i].length; j++) {
                System.out.print(cuadradoMagico[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
