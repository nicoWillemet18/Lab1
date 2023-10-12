import java.util.Scanner;

// Calcular el factorial de un número.
public class Funcion4 {
    public static void main(String[] args) {
        int num;

        Scanner lector= new Scanner(System.in);
        System.out.println("Ingrese un numero");
        num= lector.nextInt();

        System.out.println("El factorial de "+num+" es "+factorial(num));
    }
    public static int factorial(int num){
        int factorial=1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;

        }
        return factorial;
    }

}