import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese un numero entero positivo:");
        int numero = s.nextInt();

        System.out.println("Ingrese un numero entero positivo:");
        int numero1 = s.nextInt();

        s.close();
        System.out.println("Numeros Primos desde "+ numero + " Hasta "+ numero1);
        for (int i = numero; i <= numero1; i++ ){
            if (esPrimo(i)){
                System.out.println(i + " ");
            }
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
