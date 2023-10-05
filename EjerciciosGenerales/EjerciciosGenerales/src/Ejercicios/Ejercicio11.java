package Ejercicios;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Ingrese el número a convertir: ");
        int numeroEnt = sc.nextInt();
        String numeroRomano = enteroARomano(numeroEnt);

        System.out.println(" El número ingresado, convertido a número romano es: " + numeroRomano);
    }

    public static String enteroARomano(int numero) {
        if (numero < 1 || numero> 3999){
            return "Número fuera de rango.";
        }

        String[] simbolos = {
                "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"
        };

        int[] valores = {
                1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000
        };

        StringBuilder resultado = new StringBuilder();

        for (int i = 12; i >= 0; i--) {
            while (numero >= valores[i]) {
                resultado.append(simbolos[i]);
                numero -= valores[i];
            }
        }
        return resultado.toString();
    }
}
