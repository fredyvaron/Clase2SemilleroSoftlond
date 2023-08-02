import javax.swing.*;

public class Ejercicio32 {
    public static void main(String[] args) {
        int[] arreglo = {64, 34, 25, 12, 22, 11, 90};
        boolean encontrado = false;
        int indicenumero = 0;
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero a buscar"));

        //recorremos el for para buscar el numero
        for (int i=0;i < arreglo.length; i++){
            if(arreglo[i] == numero){
                indicenumero = i;
                encontrado = true;
            }
        }
        if (encontrado){
            JOptionPane.showMessageDialog(null, "El numero: "+ numero+ " fue encontrado en el indice: "+ indicenumero+ " Del arreglo");
        } else {
            JOptionPane.showMessageDialog(null, "El numero no se encontro en el arreglo");
        }
    }
}
