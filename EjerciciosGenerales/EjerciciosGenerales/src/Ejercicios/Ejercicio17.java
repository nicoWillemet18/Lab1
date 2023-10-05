package Ejercicios;
import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        int num,cant_cifras= 0,aux,digito,i;
        Scanner lector= new Scanner(System.in);

        System.out.println("Ingrese un numero");
        num= lector.nextInt();
        aux=num;

        while (aux != 0) {
            aux = aux / 10;
            cant_cifras++;
        }

        for (i = cant_cifras - 1; i >= 0; i--) {
            digito = num / (int) Math.pow(10, i);
            System.out.print(digito + " ");
            num = num % (int) Math.pow(10, i);
        }
    }
}
