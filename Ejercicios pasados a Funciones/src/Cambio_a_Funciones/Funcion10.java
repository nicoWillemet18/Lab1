import java.util.Scanner;

//7. Comprobar si dos números son amigos.
public class Funcion10 {
    public static void main(String[] args) {
        int num1, num2;
        System.out.println("Ingrese el primer numero");
        Scanner lector= new Scanner(System.in);
        num1= lector.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2= lector.nextInt();
        if (sonAmigos(num1, num2)) {
            System.out.println(num1 +" y " + num2 + " son números amigos.");
        } else {
            System.out.println(num1 +" y " + num2 + " no son números amigos.");
        }
    }

    public static boolean sonAmigos(int num1, int num2) {
        return (sumaDivisoresPropios(num1) == num2) && (sumaDivisoresPropios(num2) == num1);
    }

    public static int sumaDivisoresPropios(int num) {
        int suma = 1; // 1 siempre es divisor propio de cualquier número.

        for (int i = 2; i <= num / 2; i++) {

            if (num % i == 0) {
                suma += i;
            }
        }
        return suma;
    }
}