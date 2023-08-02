import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int numero1,numero2;
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        numero1 = s.nextInt();
        System.out.println("Ingrese el segundo numero");
        numero2 = s.nextInt();
        int max = 0;
        max = (numero1>numero2)?numero1:numero2;
        System.out.println("El numero mayor es: "+max);
    }
}
