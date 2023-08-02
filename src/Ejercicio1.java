import javax.swing.*;

public class Ejercicio1 {
    public static void main(String[] args) {

        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));

        int suma = numero1+numero2;
        int multiplicacion = numero1*numero2;
        int resta = numero1-numero2;
        int division = numero1/numero2;

        System.out.println("Suma de los 2 numeros: "+suma);
        System.out.println("Multiplicacion de los 2 numeros: "+ multiplicacion);
        System.out.println("Resta de los 2 numeros: "+resta);
        System.out.println("Division de los 2 numeros: "+division);
    }
}
