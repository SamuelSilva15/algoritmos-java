package ordenacao;

public class SelectionSort {

    private static int buscaMenor(int[] valores) {
        int menorValor = 0;
        for(int atual = 0; atual < valores.length; atual++) {
            if(valores[atual] < valores[menorValor]) {
                menorValor = atual;
            }
        }

        return valores[menorValor];
    }

    public static int[] ordena(int[] valores) {
        for(int atual = 0; atual < valores.length; atual++) {
            int menorValor = buscaMenor(valores);
            int valorAtual = valores[atual];
            int menor = valores[menorValor];

            valores[atual] = menor;
            valores[menorValor] = valorAtual;
        }

        for(int i = 0; i < valores.length; i++) {
            System.out.print(valores[i]);
        }

        return valores;
    }
}
