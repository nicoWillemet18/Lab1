public class Ejercicio4 {

    public static void main(String[] args) {
        // Crear un array para almacenar los 20 primeros números pares
        int[] pares = new int[20];

        // Llenar el array con los 20 primeros números pares
        for (int i = 0; i < 20; i++) {
            pares[i] = (i + 1) * 2; // Los números pares son el doble de los números naturales
        }

        // Mostrar el contenido del array
        System.out.println("Contenido del array Pares:");
        mostrarArray(pares);
    }

    static void mostrarArray(int[] array) {
        for (int elemento : array) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
