import java.io.IOException;
import java.util.Scanner;

//Calcular el número de cifras de un número entero

public class Funcion1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n, cifras;
        cifras= 0;
        char car;
        do{
            System.out.print("Introduce un número entero: ");
            n = sc.nextInt();
            System.out.println("El número tiene " + cant_cifras(n,cifras) + " cifras");
            System.out.print("Continuar? ");
            car=(char)System.in.read();
        }while(car!='n' && car != 'N');

    }
    public static int cant_cifras(int n, int cifras ){
        while(n!=0){
            n = n/10;
            cifras++;

        }
        return cifras;
    }
}