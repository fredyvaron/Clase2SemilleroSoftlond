import javax.swing.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
        String Resultado = (edad>=18)?"Es mayor de edad": "Es menor de edad";
        JOptionPane.showMessageDialog(null, Resultado);
    }
}
