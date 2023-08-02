import javax.swing.*;

public class Ejercicio25 {
    public static void main(String[] args) {

        String oracion;

        oracion = JOptionPane.showInputDialog(null, "Escriba una oracion");
        mostrarPalabras(oracion);
    }
    public static void mostrarPalabras(String oracion){
        if(oracion == null || oracion.isEmpty()){
            JOptionPane.showMessageDialog(null, "La frase esta vacia");
        }
        String[] palabras = oracion.trim().split("\\s+");
        for (String eleme: palabras) {
            JOptionPane.showMessageDialog(null, eleme);
        }

    }
}
