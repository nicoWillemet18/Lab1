package Ejercicios_Recursividad;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        int numero;
        System.out.println("ingrse un numero");
        Scanner sc = new Scanner(System.in);
        numero=sc.nextInt();
        decimalabinario(numero);

    }
    public static void decimalabinario(int numero) {
        if (numero < 2) {
            System.out.println(numero);

        } else {

            decimalabinario(numero/2);
            System.out.println(numero % 2);

        }

    }

}