package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char repetir;

        do {
            System.out.print("Ingrese la temperatura en grados Celsius: ");
            double gradosCelsius = scanner.nextDouble();

            double gradosKelvin = gradosCelsius + 273.15;

            System.out.println("La temperatura en grados Kelvin es: " + gradosKelvin);

            System.out.print("Repetir proceso? (S/N): ");
            repetir = scanner.next().charAt(0);

        } while (repetir == 'S' || repetir == 's');

        System.out.println("¡Hasta luego!");
    }
}
