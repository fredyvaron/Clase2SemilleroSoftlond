import javax.swing.*;

public class Ejercicio19 {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre");
        JOptionPane.showMessageDialog(null, "Nombre en Minusculas: "+nombre.toLowerCase());
        JOptionPane.showMessageDialog(null, "Nombre en Mayusculas: "+nombre.toUpperCase());
    }
}
