package Ejercicios;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        int num, i;
        Scanner lector= new Scanner(System.in);

        System.out.println("Ingrese un numero");
        num= lector.nextInt();

        if (num == 1){
            System.out.println("No es un numero primo");
        } else {
            i=2;
            while (num % i != 0) {
                i++;
            }
            if (i == num){
                System.out.println("Es un numero primo");
            }else{
                System.out.println("No es un numero primo");
            }
        }

    }
}
