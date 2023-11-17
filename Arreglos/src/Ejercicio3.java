import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el número de alumnos
        System.out.print("Ingrese el número de alumnos: ");
        int numAlumnos = scanner.nextInt();

        // Crear un array para almacenar las notas de los alumnos
        double[] notas = new double[numAlumnos];

        // Pedir al usuario las notas de cada alumno
        for (int i = 0; i < numAlumnos; i++) {
            System.out.print("Ingrese la nota del alumno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        // Calcular la media de las notas
        double media = calcularMedia(notas);

        // Mostrar la media
        System.out.println("La nota media del grupo es: " + media);

        // Mostrar los alumnos con notas superiores a la media
        System.out.println("Alumnos con notas superiores a la media:");
        mostrarNotasSuperiores(notas, media);
    }

    static double calcularMedia(double[] notas) {
        double suma = 0;

        for (double nota : notas) {
            suma += nota;
        }

        return notas.length > 0 ? suma / notas.length : 0;
    }

    static void mostrarNotasSuperiores(double[] notas, double media) {
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                System.out.println("Alumno " + (i + 1) + ": " + notas[i]);
            }
        }
    }
}
