package Ejercicios;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número a analizar: ");
        int numero = sc.nextInt();

        if (capicua(numero)){
            System.out.println(numero + " Es capicúa.");
        } else {
            System.out.println(numero + " No es capicúa.");
        }
    }

    public static boolean capicua (int numero) {
        String numeroStr = Integer.toString(numero);
        String numeroInvertido = new StringBuilder(numeroStr).reverse().toString();
        return numeroStr.equals(numeroInvertido);
    }
}