package ordenacao;

public class InsertionSort {

    public static void ordena(int[] valores) {
        int valorAnalisado;
        for(int i = 1; i < valores.length; i++) {
            valorAnalisado = valores[i];
            int j = i - 1;
            while(j >= 0 && valores[j] > valorAnalisado) {
                valores[j+1] = valores[j];
                j--;
            }
            valores[j+1] = valorAnalisado;
        }

        for(int i = 0; i < valores.length; i++) {
            System.out.print(valores[i]);
        }
    }
}
