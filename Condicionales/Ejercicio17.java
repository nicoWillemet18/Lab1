package Condicionales;
import java.util.Scanner;
public class Ejercicio17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1,n2,n3, most;
        System.out.println("Ingrese el primer numero: ");
        n1=sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        n2=sc.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        n3=sc.nextInt();

        if(n1>n2 && n1>n3){
            System.out.println("El numero mayor es: " + n1);

        } else {
            if (n2>n1 && n2>n3) {
                System.out.println("El numero mayor es: " + n2);

            } else{
                System.out.println("El numero mayor es: " + n3);
            }
        }
    }
}
