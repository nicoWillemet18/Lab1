package Ejercicios;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Ingrese el mensaje a codificar: ");
        String mensaje = sc.nextLine();

        System.out.println(" Ingrese la clave que desea: ");
        int clave = sc.nextInt();

        String mensajeCodificado = cifrarCesar(mensaje, clave);
        System.out.println("Mensaje codificado: " + mensajeCodificado);
    }

    public static String cifrarCesar(String mensaje, int clave) {
        StringBuilder resultado = new StringBuilder();

        for (char caracter : mensaje.toCharArray()) {
            if (Character.isLetter(caracter)) {
                char base = Character.isLowerCase(caracter) ? 'a' : 'A';
                resultado.append((char) (((caracter - base + clave) % 26) + base));
            } else {
                resultado.append(caracter);
            }
        }

        return resultado.toString();
    }
}
