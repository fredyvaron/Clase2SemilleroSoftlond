import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Escriba un numero");
            numero = s.nextInt();
            if(!(numero >= 0)){
                System.out.println("Debes escribir un numero mayor que 0");
            }
        }while (!(numero >= 0));
        int suma = 0;
        for (int i = 1; i <= numero/2; i++){
            if(numero % i == 0){
                suma += i;
            }
        }
        if(numero == suma){
            System.out.println(numero+" Es un numero perfecto");
        }else {
            System.out.println(numero+" No es un numero perfecto");
        }
    }
}
