package Ejercicios_Recursividad;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.print("Introduzca dividendo: ");
        n1 = sc.nextInt();
        do {
            System.out.print("Introduzca divisor mayor a 0: ");
            n2 = sc.nextInt();
        } while (n1 <= 0);
        System.out.printf("%d%%%d = %d %n", n1, n2, resta(n1, n2));
    }

    //Metodo recursivo de resto
    public static int resta(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return resta(a - b, b);
        }
    }
}
