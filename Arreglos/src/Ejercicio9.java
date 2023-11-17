import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Ejercicio9 {

    public static void main(String[] args) {
        // Ejemplo de uso del método
        int desde = 1;
        int hasta = 100;
        int tamanoArray = 10;

        int[] arrayAleatorio = llenarArrayAleatorio(desde, hasta, tamanoArray);

        // Mostrar el contenido del array
        for (int numero : arrayAleatorio) {
            System.out.print(numero + " ");
        }
    }

    static int[] llenarArrayAleatorio(int desde, int hasta, int tamanoArray) {
        if (tamanoArray <= 0 || hasta < desde) {
            throw new IllegalArgumentException("Parámetros no válidos");
        }

        List<Integer> numerosAleatorios = new ArrayList<>();

        // Llenar ArrayList con números desde hasta
        for (int i = desde; i <= hasta; i++) {
            numerosAleatorios.add(i);
        }

        // Desordenar la lista de números aleatorios
        Collections.shuffle(numerosAleatorios);

        // Crear el array y llenarlo con los primeros tamanoArray elementos
        int[] arrayAleatorio = new int[tamanoArray];
        for (int i = 0; i < tamanoArray; i++) {
            arrayAleatorio[i] = numerosAleatorios.get(i);
        }

        return arrayAleatorio;
    }
}