package Ejercicios;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();

        if (numero <= 0) {
            System.out.println("Por favor, ingrese un número entero positivo.");
            scanner.close();
            return;
        }

        int sumaCifras = 0;
        while (numero > 0) {
            int cifra = numero % 10;
            sumaCifras += cifra;
            numero /= 10;
        }

        System.out.println("La suma de las cifras es: " + sumaCifras);
    }
}
