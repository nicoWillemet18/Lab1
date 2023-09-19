package Condicionales;

import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nota;
        System.out.println("Ingrese la nota: " );
        nota = sc.nextInt();

        if (nota < 5){
            System.out.println("La calificación es Insuficiente.");
        }
        if (nota >= 5 && nota < 6) {
            System.out.println("La calificación es Suficiente.");
        }
        if (nota >= 6 && nota < 7){
            System.out.println("La calificación es Bien");
        }
        if (nota >= 7 && nota < 9){
            System.out.println("La calificación es Notable");
        }
        if (nota >=9 && nota <= 10){
            System.out.println("La calificación es Sobresaliente");
        }
    }
}