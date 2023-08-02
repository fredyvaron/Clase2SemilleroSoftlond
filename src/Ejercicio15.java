import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();
        scanner.close();

        if (esCapicua(numero)) {
            System.out.println(numero + " es un número capicúa.");
        } else {
            System.out.println(numero + " NO es un número capicúa.");
        }
    }

    public static boolean esCapicua(int numero) {
        String numeroStr = Integer.toString(numero);
        int longitud = numeroStr.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (numeroStr.charAt(i) != numeroStr.charAt(longitud - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
