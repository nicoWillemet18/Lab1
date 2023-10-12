import java.util.Scanner;

//Pasar de decimal a binario
public class Funcion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número decimal: ");
        int numeroDecimal = scanner.nextInt();

        String numeroBinario = decimalABinario(numeroDecimal);

        System.out.println("El número en binario es: " + numeroBinario);

    }
    public static String decimalABinario(int decimal) {
        if (decimal == 0) {
            return "0"; // Caso especial: el número 0
        }

        StringBuilder binario = new StringBuilder();
        while (decimal > 0) {
            int residuo = decimal % 2; // Obtener el residuo de la división por 2
            binario.insert(0, residuo); // Insertar el residuo al principio de la cadena
            decimal /= 2; // Dividir el número decimal entre 2
        }

        return binario.toString();
    }
}