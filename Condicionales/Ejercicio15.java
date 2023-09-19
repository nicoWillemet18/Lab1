package Condicionales;
import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {

        float division,n1,n2;
        Scanner lector= new Scanner(System.in);
        System.out.println("Ingrese el primer numero entero: ");
        n1= lector.nextInt();
        System.out.println("Ingrese el segundo numero entero: ");
        n2= lector.nextInt();
        if (n2 == 0) {
            System.out.println("El divisor no puede ser cero");
        } else {
            division=(n1/n2);
            System.out.println("La division es: "+division);
        }
    }
}
