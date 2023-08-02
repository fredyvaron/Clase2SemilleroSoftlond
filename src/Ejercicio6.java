import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un numero para verificar si es positivo o negativo");
        int num = s.nextInt();
        String resultado = (num<0) ? "Es negativo": "Es positivo";
        System.out.println(resultado);
    }
}
