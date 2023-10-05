package Ejercicios;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();

        if (numero <= 0) {
            System.out.println("Por favor, ingrese un número entero positivo.");
            scanner.close();
            return;
        }

        int numeroOriginal = numero;
        int numeroCifras = 0;
        while (numero > 0) {
            numero /= 10;
            numeroCifras++;
        }

        numero = numeroOriginal;
        int sumaCifras = 0;
        while (numero > 0) {
            int cifra = numero % 10;
            sumaCifras += Math.pow(cifra, numeroCifras);
            numero /= 10;
        }

        if (sumaCifras == numeroOriginal) {
            System.out.println(numeroOriginal + " es un número narcisista.");
        } else {
            System.out.println(numeroOriginal + " no es un número narcisista.");
        }

    }
}
