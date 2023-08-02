import java.util.Random;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random random = new Random();

        int numeroAdivinar = random.nextInt(100)+1;
        int intentos = 0;
        int numeroIngresado;

        System.out.println("Bienvenido al juego de adivinar el numero, ingrese un numero de entre 1 - 100");
        do {
            System.out.println("Ingresa un numero");
            numeroIngresado = s.nextInt();
            intentos++;
            if(numeroIngresado == numeroAdivinar){
                System.out.println("¡Felicitaciones! Adivinastes el numero en "+ intentos + " intentos.");
            } else if (numeroIngresado < numeroAdivinar) {
                System.out.println("El numero ingresado es menor que el numero a adivinar. Intenta de nuevo.");
            }else{
                System.out.println("El numero ingresado es mayor que el numero a adivinar. Intenta de nuevo.");
            }
        }while (numeroIngresado != numeroAdivinar);
        s.close();
    }
}
