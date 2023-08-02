import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el valor del radio del circulo");
        double radio = s.nextDouble();

        double area = Math.PI * radio * radio;
        double perimetro = 2 * Math.PI * radio;

        System.out.println("El area del circulo es: "+area);
        System.out.println("El perimetro del circulo es: "+perimetro);
    }
}
