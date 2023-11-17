import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un array para almacenar 10 números enteros
        int[] numeros = new int[10];

        // Solicitar al usuario que ingrese los números
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Calcular y mostrar la media de los números en posiciones pares
        double mediaPosicionesPares = calcularMediaPosicionesPares(numeros);

        System.out.println("Media de los números en posiciones pares: " + mediaPosicionesPares);
    }

    static double calcularMediaPosicionesPares(int[] array) {
        int sumaPosicionesPares = 0;
        int cantidadPosicionesPares = 0;

        for (int i = 0; i < array.length; i += 2) {
            sumaPosicionesPares += array[i];
            cantidadPosicionesPares++;
        }

        return cantidadPosicionesPares > 0 ? (double) sumaPosicionesPares / cantidadPosicionesPares : 0;
    }
}