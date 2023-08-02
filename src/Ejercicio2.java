import javax.swing.*;

public class Ejercicio2 {
    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero"));
        boolean resultado = (numero % 2 == 0)? true : false;
        if(resultado){
            JOptionPane.showMessageDialog(null, "El numero es par");
        }else{
            JOptionPane.showMessageDialog(null, "El numero no es par");
        }
    }
}
