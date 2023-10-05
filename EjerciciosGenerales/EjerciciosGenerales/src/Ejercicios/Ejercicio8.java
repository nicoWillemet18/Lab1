package Ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de términos de la serie de Fibonacci a mostrar: ");
        int n = scanner.nextInt();

        System.out.println("Los primeros " + n + " términos de la serie de Fibonacci son:");
        for (int i = 0; i < n; i++) {
            int fibonacciTerm = fibonacci(i);
            System.out.print(fibonacciTerm + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
