package Cambio_a_Funciones;

import java.util.Scanner;
//Intercambiar el contenido de dos variables
public class Funcion9 {
    public static void main(String[] args) {
        int a,b;
        Scanner lector= new Scanner(System.in);
        System.out.print("Introduzca valor de A: ");
        a= lector.nextInt();
        System.out.print("Introduzca Valor de B: ");
        b = lector.nextInt();

        System.out.println("Antes del intercambio:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        intercambiar(a, b);
    }

    public static void intercambiar(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Después del intercambio:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}