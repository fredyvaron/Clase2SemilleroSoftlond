import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String cadena, cadenaSinEspacios;

        System.out.println("Escriba una cadena de texto");
        cadena = s.nextLine();
        s.close();
        cadenaSinEspacios = cadena.replaceAll("\\s","");
        System.out.println("la cadena tiene: "+ cadenaSinEspacios.length()+ " Caracteres sin los espacios en blanco");
    }
}
