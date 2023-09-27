package Ejercicios;
import java.util.Scanner;
public class Ejercicio14{
    public static void main(String[] args) {
        int cant_alumnos;
        double nota,suma=0,menor,mayor;
        Scanner lector= new Scanner(System.in);
        do {
            System.out.println("Ingrese la cantidad de alumnos: ");
            cant_alumnos = lector.nextInt();
        }while(cant_alumnos <= 0);

        System.out.println("Ingrese la nota del primer alumno:");
        nota= lector.nextInt();
        suma = suma+nota;
        mayor=nota;
        menor=nota;
        for (int i = 2; i <= cant_alumnos;i++){
            System.out.println("Ingrese la nota del "+i+" alumno");
            nota= lector.nextDouble();
            suma=suma+nota;
            if (nota > mayor){
                mayor=nota;
            } else if (nota< menor){
                menor=nota;
            }

        }
        System.out.println("La mayor nota es: "+mayor);
        System.out.println("La menor nota es: "+menor);
        System.out.println("La nota media es:" +suma/cant_alumnos);
    }
}

