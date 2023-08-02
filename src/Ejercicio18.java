import java.util.Random;

public class Ejercicio18 {
    public static void main(String[] args) {
        String password = "";
        Random random = new Random();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        for (int i = 0; i < 8; i++){
            password += caracteres.charAt(random.nextInt(caracteres.length()));
        }
        System.out.println(password);
    }
}
