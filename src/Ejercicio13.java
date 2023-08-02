import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        double numero, numeroRedondeado;
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        numero = s.nextDouble();

        numeroRedondeado = Math.round(numero);
        System.out.println("Numero redondeado: "+ numeroRedondeado);


    }
}
