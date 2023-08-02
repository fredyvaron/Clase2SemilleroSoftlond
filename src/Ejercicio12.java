import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese un numero entero positivo:");
        int numero = s.nextInt();
        s.close();
        if(esPrimo(numero)){
            System.out.println(numero + " Es un numero primo.");
        }else{
            System.out.println(numero + " No es un numero primo");
        }
    }
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        // Verificar si el número es divisible por algún número entre 2 y la raíz cuadrada del número.
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
