package Condicionales;

import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {

        System.out.println("Hello world!");
        int mes;
        Scanner lector= new Scanner(System.in);
        System.out.println("ingrese un mes 1-12");
        mes=lector.nextInt();
        if (mes >= 1 && mes <= 12) {
            String nombreMes = "";
            int dias = 0;

            switch (mes) {
                case 1:
                    nombreMes = "Enero";
                    dias = 31;
                    break;
                case 2:
                    nombreMes = "Febrero";
                    dias = 28;
                    break;
                case 3:
                    nombreMes = "Marzo";
                    dias = 31;
                    break;
                case 4:
                    nombreMes = "Abril";
                    dias = 30;
                    break;
                case 5:
                    nombreMes = "Mayo";
                    dias = 31;
                    break;
                case 6:
                    nombreMes = "Junio";
                    dias = 30;
                    break;
                case 7:
                    nombreMes = "Julio";
                    dias = 31;
                    break;
                case 8:
                    nombreMes = "Agosto";
                    dias = 31;
                    break;
                case 9:
                    nombreMes = "Septiembre";
                    dias = 30;
                    break;
                case 10:
                    nombreMes = "Octubre";
                    dias = 31;
                    break;
                case 11:
                    nombreMes = "Noviembre";
                    dias = 30;
                    break;
                case 12:
                    nombreMes = "Diciembre";
                    dias = 31;
                    break;
            }

            System.out.println("El mes " + nombreMes + " tiene " + dias + " días.");
        } else {
            System.out.println("Número de mes fuera de rango.");
        }

    }
}
