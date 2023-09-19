package Condicionales;
import java.util.Scanner;
public class Ejercicio16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double num1, num2, major, minor;
        System.out.println("Introduzca primer numero");
        num1 = sc.nextInt();
        System.out.println("Introduzca segundo numero");
        num2 = sc.nextInt();
        if(num1 != num2){
            if(num1>num1){
                major = num1;
                minor = num2;
            }else{
                major = num2;
                minor = num1;

            }
            if (minor == 0){
                System.out.println("No se puede dividir por 0");
            }else{
                System.out.println(major + " / " + minor + " = " + major/minor);
            }
        }else{
            System.out.println("Los numeros ingresados son iguales");
        }
    }
}
