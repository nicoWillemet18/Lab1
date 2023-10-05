package Ejercicios;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número binario: ");
        String binarioStr = sc.nextLine();

        int decimal = binarioADecimal(binarioStr);

        System.out.println(" El número ingresado es equivalente a: " + decimal);

    }

    public static int binarioADecimal(String binario) {
        int decimal = 0;
        int longitud = binario.length();

        for (int i = 0; i< longitud; i++){
            char digito = binario.charAt(i);
            int valor = Character.getNumericValue(digito);

            decimal += valor * Math.pow(2, longitud -1 - i);
        }
        return decimal;

    }
}
