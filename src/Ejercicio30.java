import javax.swing.*;
import java.util.Arrays;

public class Ejercicio30 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tamaño del arreglo"));
        int[] arreglo = new int[n];
        int[] nuevoarreglo = new int[arreglo.length];
        //llenamos el arreglo
        for (int i = 0; i< arreglo.length; i++) {
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba el numero para la posicion: "+ i));
        }
        //
        Arrays.sort(arreglo);
        int previo = arreglo[0];
        int indice = 1;
        nuevoarreglo[0] = previo;
        for (int i = 1; i < arreglo.length; i++ ){
            int actual = arreglo[i];
            if(actual != previo){
                nuevoarreglo[indice] = actual;
                previo = actual;
                indice++;
            }
        }
        nuevoarreglo = Arrays.copyOf(nuevoarreglo, indice);
        for (int element: nuevoarreglo) {
            System.out.println(element);
        }
    }
}
