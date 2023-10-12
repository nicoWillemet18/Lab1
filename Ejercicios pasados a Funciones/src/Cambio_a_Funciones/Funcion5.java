import java.util.Scanner;

// Comprobar si un número es primo.
public class Funcion5 {
    public static void main(String[] args) {
        int num;
        Scanner lector= new Scanner(System.in);

        System.out.println("Ingrese un numero");
        num= lector.nextInt();

        if (EsPrimo(num)) {
            System.out.println("Es un número primo");
        } else {
            System.out.println("No es un número primo");
        }
    }

    public static boolean EsPrimo(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }
}