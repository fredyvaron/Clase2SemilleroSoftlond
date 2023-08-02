import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingresa la longitud del lado 1 del triangulo");
        double lado1 = s.nextDouble();

        System.out.println("Ingresa la longitud del lado 2 del triangulo");
        double lado2 = s.nextDouble();

        System.out.println("Ingresa la longitud del lado 3 del triangulo");
        double lado3 = s.nextDouble();
        s.close();

        double  semiperimetro = (lado1+lado2+lado3)/2;
        double area = Math.sqrt(semiperimetro * (semiperimetro - lado1)*(semiperimetro - lado2 ) * (semiperimetro - lado3));

        System.out.println("El area del triangulo es: "+ area);

    }
}
