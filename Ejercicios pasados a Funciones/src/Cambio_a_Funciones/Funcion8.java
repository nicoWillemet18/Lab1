import java.util.Scanner;

// Leer números y contar cuántos acaban en 2.
public class Funcion8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print( "Ingrese la cantidad de números que desea verificar: ");
        int n = scanner.nextInt();

        int cantidadTerminadosEn2 = contarNumerosTerminadosEn2(n);

        System.out.println("La cantidad de números terminados en 2 es: " + cantidadTerminadosEn2);
    }

    public static int contarNumerosTerminadosEn2(int n) {
        int contador = 0;
        for (int i = 0; i < n; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();

            if (numero % 10 == 2) {
                contador++;
            }
        }

        return contador;
    }
}