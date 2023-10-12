import java.util.Scanner;
// Sumar las cifras de un número.
public class Funcion6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();

        if (numero <= 0) {
            System.out.println("Por favor, ingrese un número entero positivo.");
            numero = scanner.nextInt();
        }

        System.out.println("La suma de las cifras es: " + sumaCifras(numero));
    }
    public static int sumaCifras( int numero){
        int suma_Cifras = 0;
        while (numero > 0) {
            int cifra = numero % 10;
            suma_Cifras += cifra;
            numero /= 10;
        }
        return suma_Cifras;
    }
}
