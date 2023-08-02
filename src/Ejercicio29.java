import javax.swing.*;

public class Ejercicio29 {
    public static void main(String[] args) {
        int max;
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tamaño del arreglo"));
        int[] arreglo = new int[n];
        for (int i = 0; i< arreglo.length; i++) {
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba el numero para la posicion: "+ i));
        }
        if(arreglo == null || arreglo.length == 0){
            JOptionPane.showMessageDialog(null, "Error el arreglo esta vacio");
            System.exit(0);
        }
        max = arreglo[0];
        for (int i = 0; i < arreglo.length; i++){
            if(arreglo[i] > max){
                max = arreglo[i];
            }
        }
        System.out.println("El mayor numero del arreglo es: "+ max);


    }
}
