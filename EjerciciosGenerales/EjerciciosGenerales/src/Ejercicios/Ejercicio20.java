package Ejercicios;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {

        int num, posicionMayor, cifra, mayor, posicion;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Introduce numero entero >0: ");
            num = sc.nextInt();
        } while (num <= 0);

        mayor = 0;

        posicionMayor = 0;
        posicion = 0;

        while (num != 0) {
            posicion++;
            cifra = num % 10;
            if (cifra >= mayor) {
                mayor = cifra;
                posicionMayor = posicion;
            }
            num = num / 10;
        }

        System.out.print("Cifra mayor: " + mayor);

        System.out.println(" Posición: " + posicionMayor);
    }
}
