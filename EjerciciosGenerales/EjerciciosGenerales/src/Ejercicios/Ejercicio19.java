package Ejercicios;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int mayor = Integer.MIN_VALUE;

        System.out.println("Introduzca números enteros (finalice con 0):");

        do {
            System.out.print("Ingrese un número: ");
            numero = scanner.nextInt();

            if (numero != 0) {
                if (numero > mayor) {
                    mayor = numero;
                }
            }
        } while (numero != 0);

        if (mayor != Integer.MIN_VALUE) {
            System.out.println("El número mayor es: " + mayor);
        } else {
            System.out.println("No se ingresaron números válidos.");
        }
    }
}
