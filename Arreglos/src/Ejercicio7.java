import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la cantidad de personas (N)
        System.out.print("Ingrese la cantidad de personas (N): ");
        int n = scanner.nextInt();

        // Validar que N sea un entero positivo
        while (n <= 0) {
            System.out.println("Ingrese un valor de N válido (entero positivo).");
            System.out.print("Ingrese la cantidad de personas (N): ");
            n = scanner.nextInt();
        }

        // Crear un array para almacenar las alturas
        double[] alturas = new double[n];

        // Solicitar al usuario que ingrese las alturas
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la altura de la persona " + (i + 1) + " (en metros): ");
            alturas[i] = scanner.nextDouble();
        }

        // Calcular la altura media
        double alturaMedia = calcularAlturaMedia(alturas);

        // Contar personas con altura superior e inferior a la media
        int personasSuperiorMedia = 0;
        int personasInferiorMedia = 0;

        for (double altura : alturas) {
            if (altura > alturaMedia) {
                personasSuperiorMedia++;
            } else if (altura < alturaMedia) {
                personasInferiorMedia++;
            }
        }

        // Mostrar resultados
        System.out.println("Altura media: " + alturaMedia);
        System.out.println("Personas con altura superior a la media: " + personasSuperiorMedia);
        System.out.println("Personas con altura inferior a la media: " + personasInferiorMedia);
    }

    static double calcularAlturaMedia(double[] alturas) {
        double sumaAlturas = 0;

        for (double altura : alturas) {
            sumaAlturas += altura;
        }

        return alturas.length > 0 ? sumaAlturas / alturas.length : 0;
    }
}
