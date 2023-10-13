package Ejercicios_Recursividad;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        //4. Calcular el número de cifras de un número entero de forma recursiva.
        int numero;
        System.out.println("Ingrese un numero");
        Scanner lector= new Scanner(System.in);
        numero= lector.nextInt();
        System.out.println("Tiene " + cantidad_cifras(numero)+ " cifras");

    }
    public static int cantidad_cifras(int numero){
        if (Math.abs(numero) < 10) {
            return 1;
        } else {

            return 1 + cantidad_cifras(numero / 10);
        }

    }
}
