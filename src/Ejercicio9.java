import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num;
        double factorial;
        System.out.println("Introduzca un numero");
        num = s.nextInt();
        factorial = 1;
        for (int i = num; i > 0; i--){
            factorial = factorial*i;
        }
        System.out.println("El factorial de "+ num + " es: "+ factorial);
    }
}
