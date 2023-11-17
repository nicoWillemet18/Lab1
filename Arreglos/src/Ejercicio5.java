import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un array para almacenar 10 números enteros
        int[] numeros = new int[10];

        // Solicitar al usuario que ingrese los números
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Contar positivos, negativos y ceros
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        for (int numero : numeros) {
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        // Mostrar los resultados
        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);
        System.out.println("Cantidad de ceros: " + ceros);
    }
}