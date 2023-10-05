package Ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero positivo: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero positivo: ");
        int numero2 = scanner.nextInt();

        if (sonAmigos(numero1, numero2)) {
            System.out.println(numero1 + " y " + numero2 + " son números amigos.");
        } else {
            System.out.println(numero1 + " y " + numero2 + " no son números amigos.");
        }
    }

    public static boolean sonAmigos(int num1, int num2) {
        return (sumaDivisoresPropios(num1) == num2 && sumaDivisoresPropios(num2) == num1);
    }

    public static int sumaDivisoresPropios(int numero) {
        int suma = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }
        return suma;
    }
}
