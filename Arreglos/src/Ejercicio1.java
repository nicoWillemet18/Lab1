import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un array para almacenar 10 números enteros
        int[] numeros = new int[10];

        // Solicitar al usuario que ingrese los números
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Calcular y mostrar la media de los valores positivos y negativos
        double mediaPositivos = calcularMediaPositivos(numeros);
        double mediaNegativos = calcularMediaNegativos(numeros);

        System.out.println("Media de los valores positivos: " + mediaPositivos);
        System.out.println("Media de los valores negativos: " + mediaNegativos);
    }

    static double calcularMediaPositivos(int[] array) {
        int sumaPositivos = 0;
        int cantidadPositivos = 0;

        for (int numero : array) {
            if (numero > 0) {
                sumaPositivos += numero;
                cantidadPositivos++;
            }
        }

        return cantidadPositivos > 0 ? (double) sumaPositivos / cantidadPositivos : 0;
    }

    static double calcularMediaNegativos(int[] array) {
        int sumaNegativos = 0;
        int cantidadNegativos = 0;

        for (int numero : array) {
            if (numero < 0) {
                sumaNegativos += numero;
                cantidadNegativos++;
            }
        }

        return cantidadNegativos > 0 ? (double) sumaNegativos / cantidadNegativos : 0;
    }
}