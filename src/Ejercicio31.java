public class Ejercicio31 {
    public static void main(String[] args) {
        int[] arreglo = {64, 34, 25, 12, 22, 11, 90};
        int n = arreglo.length;

        //recorremos el array
        for (int i =0; i< n-1; i++){
            int indice = i;
            //busca los mas pequeños
            for (int j = i+1; j < n; j++){
                if(arreglo[j] < arreglo[indice]){
                    indice = j;
                }
            }

            //intercambia los elementos
            int temp = arreglo[indice];
            arreglo[indice] = arreglo[i];
            arreglo[i] = temp;
        }
        for (int numero: arreglo) {
            System.out.println(numero);
        }
    }
}
