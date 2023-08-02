import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Escriba la cadena de texto");
        String cadena = s.next();

        String invertida  = "";

        /* Con for */
        //for (int i = cadena.length()-1; i >= 0; i--){
           // invertida += cadena.charAt(i);
       // }

        /* Con StringBuilder */
        StringBuilder stringbuilder = new StringBuilder(cadena);
        invertida = stringbuilder.reverse().toString();

        System.out.println("Cadena Invertida: "+ invertida);
    }
}
