import javax.swing.*;
import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {

        String oracion;

        oracion = JOptionPane.showInputDialog(null, "Escriba una oracion");
        int cantidadpalabras = contarPalabras(oracion);
        JOptionPane.showMessageDialog(null, "La oracion contiene "+ cantidadpalabras + " palabras");
    }
    public static int contarPalabras(String oracion){
        if(oracion == null || oracion.isEmpty()){
            return  0;
        }
        String[] palabras = oracion.trim().split("\\s+");
        return  palabras.length;
    }
}
