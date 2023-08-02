import javax.swing.*;
import java.util.Arrays;

public class Ejercicio27 {
    public static void main(String[] args) {

        String frase = JOptionPane.showInputDialog("Ingrese una frase");

        String[] palabras = frase.split("\\s+");

        Arrays.sort(palabras);
        for (String palabra: palabras ) {
            JOptionPane.showMessageDialog(null, palabra);
        }
    }
}
