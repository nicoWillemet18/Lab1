package Ejercicios_Recursividad;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int exponente;

        System.out.println("Ingrese el exponente: ");
        exponente= sc.nextInt();

        System.out.println("El valor final es: "+potencia(exponente));
    }

    public static int potencia (int exp){
        if (exp==0){
            return 1;

        }else {
            return 2*potencia(exp-1);
        }

    }
}