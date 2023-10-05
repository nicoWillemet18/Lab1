package BuclesAnidados;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un valor entero N: ");
        int N = scanner.nextInt();

        if (N < 2) {
            System.out.println("No hay números primos en el rango proporcionado.");
            scanner.close();
            return;
        }

        System.out.println("Números primos desde 2 hasta " + N + ":");
        for (int numero = 2; numero <= N; numero++) {
            if (esPrimo(numero)) {
                System.out.print(numero + " ");
            }
        }
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        if (numero <= 3) {
            return true;
        }
        if (numero % 2 == 0 || numero % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= numero; i += 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
