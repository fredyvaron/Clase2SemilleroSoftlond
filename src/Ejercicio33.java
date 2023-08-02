public class Ejercicio33 {
    public static void main(String[] args) {
        int[] arreglo = {5, 2, 5, 4, 5, 2, 7, 6, 5, 4};

        //elementos unicos
        int[] elementosUnicos = new int[arreglo.length];
        //frecuencias
        int[] frecuencias = new int[arreglo.length];
        int totalElementosUnicos = 0;
        //recorremos el for
        for (int i = 0; i < arreglo.length; i++){
            boolean encontrado = false;
            for (int j = 0; j < totalElementosUnicos; j++){
                if(arreglo[i] == elementosUnicos[j]){
                    frecuencias[j]++;
                    encontrado = true;
                    break;
                }
            }
            if(!encontrado){
                elementosUnicos[totalElementosUnicos] = arreglo[i];
                frecuencias[totalElementosUnicos] = 1;
                totalElementosUnicos++;
            }
        }

        for (int i = 0; i < totalElementosUnicos; i++){
            System.out.println("El elemento: "+ elementosUnicos[i]+ " se repite "+ frecuencias[i] + " Veces.");
        }
    }
}
