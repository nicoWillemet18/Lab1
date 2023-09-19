package Condicionales;
import java.util.Scanner;
public class Ejercicio18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int H,M,S;
        System.out.println("Ingrese la hora: ");
        H=sc.nextInt();
        if(H<=23&& H>=0){
            System.out.println("Ingrese los minutos: ");
            M=sc.nextInt();
            if (M<= 59 && M >= 0){
                System.out.println("Ingrese los segundos: ");
                S = sc.nextInt();
                if (S <= 59 && S >= 0) {
                    System.out.println("Hora: " + H + " Minutos: " + M + " Segundos: " + S);
                }else{
                    System.out.println("Hubo un error en los segundos ");
                }
            } else{
                System.out.println("Hubo un error en los minutos ");

            }
        } else{
            System.out.println("Hubo un error en la hora ");
        }
    }
}
