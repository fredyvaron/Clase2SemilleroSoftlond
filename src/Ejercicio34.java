import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Escriba el tamaño del arreglo");
        int size = s.nextInt();
        int[] arreglo = new int[size];

        for (int i = 0; i < arreglo.length; i++){
            System.out.print("Escriba el valor para el indice: "+ i +" => ") ;
            arreglo[i] = s.nextInt();
            System.out.println();
        }

        //rotar numero de posiciones
        System.out.println("Escriba el numero de posiciones que quiere mover");
        int numero = s.nextInt();

        for (int i = 0; i < numero; i++){
            int temp = arreglo[0];
            for (int j = 0; j < arreglo.length -1 ; j++){
                arreglo[j] = arreglo[j+1];
            }
            arreglo[arreglo.length -1] = temp;

        }

        for (int i = 0; i < size; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }
}
