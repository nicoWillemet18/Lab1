package Ejercicios_Recursividad;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            System.out.print("Introduce un numero entero mayor a 0 ");
            num = sc.nextInt();
        }while(num <= 0);
        System.out.println("Suma desde 1 hasta " + num + " = " + suma1N(num));

    }

    //Recrusividad
    public static double suma1N(int n){
        if(n == 1) { //caso salida
            return 1;
        } else {
            return n + suma1N(n-1);
        }
    }

}
