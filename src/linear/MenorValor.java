package linear;

public class MenorValor {

    public static int buscaMenor(int[] valores) {
        int menorValor = 0;
        for(int atual = 0; atual < valores.length; atual++) {
            if(valores[atual] < valores[menorValor]) {
                menorValor = atual;
            }
        }

        return valores[menorValor];
    }
}
