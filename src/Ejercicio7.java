import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        int numero;
        Scanner s = new Scanner(System.in);
        System.out.println("Ingresa el numero");
        numero = s.nextInt();
        System.out.println();
        System.out.println("La Tabla Del "+ numero);
        for (int i = 1; i <= 10; i++ ){
            System.out.print(numero+" * " + i + " => "+ (numero*i)+ "\n");
        }
    }
}
