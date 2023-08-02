import javax.swing.*;

public class Ejercicio28 {
    public static void main(String[] args) {
        int[] arreglo = new int[5];
        int suma = 0;
        //Lleno el arreglo
        for (int i = 0; i < arreglo.length; i++){
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba el numero para la posicion: "+ i));
        }
        //recorro el array y sumo los numeros
        for (int numero: arreglo ){
            suma += numero;
        }
        System.out.println("La suma de los elementos del arreglo es de: "+ suma);
    }
}
