package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorNumerosTerminadosEnDos = 0;

        System.out.println("Ingrese una serie de números (ingrese un número negativo para salir):");

        while (true) {
            int numero = scanner.nextInt();

            if (numero < 0) {
                break;
            }

            if (numero % 10 == 2) {
                contadorNumerosTerminadosEnDos++;
            }
        }

        System.out.println("Se leyeron " + contadorNumerosTerminadosEnDos + " números terminados en 2.");
    }
}
