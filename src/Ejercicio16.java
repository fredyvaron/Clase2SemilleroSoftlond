import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numero = s.nextInt();
        System.out.println("Los numeros de la seria Fibonacci son: ");
        printFibonacci(numero);
    }
    public static  void printFibonacci(int n){
        int primerNumero = 0;
        int segundoNumero = 1;
        int nextNum;
        for (int i = 0; i<n;i++){
            if(i<=1){
                nextNum = i;
            }else{
                nextNum = primerNumero + segundoNumero;
                primerNumero = segundoNumero;
                segundoNumero = nextNum;
            }
            System.out.println(nextNum + " ");
        }

    }
}
