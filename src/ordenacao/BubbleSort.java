package ordenacao;

public class BubbleSort {

    public static void ordena(int[] valores) {
        int aux;
        for(int i = 0; i < valores.length; i++) {
            for(int j = i + 1; j < valores.length; j++) {
                if(valores[i] > valores[j]) {
                    aux = valores[j];
                    valores[j] = valores[i];
                    valores[i] = aux;
                }
            }
        }

        for(int i = 0; i < valores.length; i++) {
            System.out.print(valores[i]);
        }
    }
}
