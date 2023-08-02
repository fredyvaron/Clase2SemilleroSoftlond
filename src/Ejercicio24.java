import javax.swing.*;

public class Ejercicio24 {
    public static void main(String[] args) {
        String cadena;
        String letrar;
        String letrar1;
        char letra,  letraRem;
        cadena = JOptionPane.showInputDialog("Escriba una cadena de texto");
        System.out.println("Escriba la letra a buscar");
        letrar = JOptionPane.showInputDialog("Escriba una letra para buscar");
        letra = letrar.toLowerCase().charAt(0);
        letrar1 = JOptionPane.showInputDialog("Escriba una letra para remplazar");
        letraRem = letrar1.toLowerCase().charAt(0);
        String result = "";

        int counter = 0;
        for (int i = 0; i < cadena.length(); i++){
            char currentChar = cadena.charAt(i);
            char lowercaseChar = Character.toLowerCase(currentChar);
            if (lowercaseChar == letra){
               result += letraRem;
            }else {
                result += currentChar;
            }
        }
        JOptionPane.showMessageDialog(null, "Cadena Final: "+ result);

    }
}
