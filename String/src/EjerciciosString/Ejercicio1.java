import javax.swing.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        String frase,subcadena,caracter;
        int longitud,posicion;
        frase=JOptionPane.showInputDialog(null,"Ingrese la frase:");
        longitud=frase.length();
        JOptionPane.showMessageDialog(null,"La longitud de la cadena es:" + longitud);
        posicion=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero de posicion dentro de la cadena:" + "(El rango de valores posibles es : 0 a "+(longitud - 1) + ")"));

        JOptionPane.showMessageDialog(null,"el caracter de la posicion "+ posicion + " Es:" + frase.charAt(posicion));
        subcadena=JOptionPane.showInputDialog(null,"introduzca una palabara a buscar:");
        if(frase.contains(subcadena)){
            JOptionPane.showMessageDialog(null,"Se encuentra la palabra: "+ subcadena);
        }else{
            JOptionPane.showMessageDialog(null,"No se encuentra la palabra: "+ subcadena);
        }
        caracter=JOptionPane.showInputDialog(null,"introduzca caracter a buscar:");
        JOptionPane.showMessageDialog(null,"el caracter: "+ caracter + " Esta en la posicion:" + frase.indexOf(caracter));
        JOptionPane.showMessageDialog(null,"la cadena en mayusculas es: "+ frase.toUpperCase() );
    }
}
