import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String texto = scanner.next();
        scanner.close();
        if (palindromo(texto)) {
            System.out.println(texto + " es Palindromo.");
        } else {
            System.out.println(texto + " NO es un Palindromo.");
        }
    }

    public static boolean palindromo(String numero) {
        String numeroStr = numero;
        int longitud = numeroStr.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (numeroStr.charAt(i) != numeroStr.charAt(longitud - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
