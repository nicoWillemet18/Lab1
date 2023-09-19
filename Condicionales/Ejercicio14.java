package Condicionales;
import java.util.Scanner;
public class Ejercicio14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;

        System.out.println("Ingrese el numero a validar");
        number = sc.nextInt();
        if (number > 100 && number <= 999) {
            if (number % 10 == number / 100) {
                System.out.println("El numero es capicua");
            } else {
                System.out.println("El numeor no es capicua");
            }
        } else {
            System.out.println("No es un numero de tres cifras");
        }
    }
}
