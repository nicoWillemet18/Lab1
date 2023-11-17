import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear arrays para almacenar nombres y sueldos
        String[] nombres = new String[20];
        double[] sueldos = new double[20];

        // Variables para almacenar el empleado con el mayor sueldo
        String empleadoMayorSueldo = "";
        double mayorSueldo = Double.MIN_VALUE; // Inicializar con el valor mínimo posible de un double

        // Solicitar al usuario el nombre y sueldo de cada empleado
        for (int i = 0; i < 20; i++) {
            System.out.print("Ingrese el nombre del empleado " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();

            System.out.print("Ingrese el sueldo de " + nombres[i] + ": ");
            sueldos[i] = scanner.nextDouble();
            scanner.nextLine(); // Consumir la nueva línea después de leer el sueldo

            // Comprobar si el sueldo actual es mayor que el mayor sueldo registrado
            if (sueldos[i] > mayorSueldo) {
                mayorSueldo = sueldos[i];
                empleadoMayorSueldo = nombres[i];
            }
        }

        // Mostrar el nombre y sueldo del empleado con el mayor sueldo
        System.out.println("Empleado con el mayor sueldo:");
        System.out.println("Nombre: " + empleadoMayorSueldo);
        System.out.println("Sueldo: " + mayorSueldo);
    }
}
