import javax.swing.*;
import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        String cadena;
        String letrar;
        char letra;
        cadena = JOptionPane.showInputDialog("Escriba una cadena de texto");
        System.out.println("Escriba la letra a buscar");
        letrar = JOptionPane.showInputDialog("Escriba una letra para buscar");
        letra = letrar.toLowerCase().charAt(0);
        int counter = 0;
        for (int i = 0; i < cadena.length(); i++){
            if (cadena.toLowerCase().charAt(i) == letra){
                counter++;
            }
        }
        JOptionPane.showMessageDialog(null, "La Letra: " + letra + " Aparece "+ counter + " Veces");

    }
}
