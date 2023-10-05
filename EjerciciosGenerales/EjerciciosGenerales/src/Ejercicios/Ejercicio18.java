package Ejercicios;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número decimal: ");
        int numeroDecimal = scanner.nextInt();

        String numeroBinario = decimalABinario(numeroDecimal);

        System.out.println("El número en binario es: " + numeroBinario);

    }

    public static String decimalABinario(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        StringBuilder binario = new StringBuilder();
        while (decimal > 0) {
            int residuo = decimal % 2;
            binario.insert(0, residuo);
            decimal /= 2;
        }

        return binario.toString();
    }
}
