
import java.util.Scanner;
//Comprobar si un número es perfecto.
public class Funcion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número para verificar si es perfecto: ");
        int numero = scanner.nextInt();

        if (numero_perfecto(numero)) {
            System.out.println("Es un número perfecto");
        } else {
            System.out.println("No es un número perfecto");
        }
    }


    public static boolean numero_perfecto(int numero) {
        int sumaDivisores = 0;

        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }
        return sumaDivisores == numero;
    }
}