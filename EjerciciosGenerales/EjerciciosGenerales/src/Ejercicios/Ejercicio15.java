package Ejercicios;
import java.util.Scanner;

public class Ejercicio15 {
        public static void main(String[] args) {
            int num;
            double factorial = 1;
            Scanner lector= new Scanner(System.in);
            System.out.println("Ingrese un numero");
            num= lector.nextInt();
            for (int i = 1; i <= num; i++) {
                factorial = factorial * i;
            }
            System.out.println("El factorial de "+num+" es "+factorial);
        }
}
