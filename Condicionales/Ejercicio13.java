package Condicionales;
    import java.util.Scanner;
    public class Ejercicio13 {

        public static void main(String[] args) {

            int anio;
            System.out.println("Ingrese un año:");
            Scanner lector= new Scanner(System.in);
            anio= lector.nextInt();
            if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
                System.out.println("El año "+anio+" es bisiesto");
            } else {
                System.out.println("El año "+anio+" no es bisiesto");
            }
        }
}
