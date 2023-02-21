package binaria;

import model.Nota;

public class Pivota {

    public static int particiona(Nota[] notas, int inicial, int termino) {
        int menoresEncontrados = 0;

        Nota pivo = notas[termino - 1];
        for(int analisando = 0; analisando < termino - 1; analisando++) {
            Nota atual = notas[analisando];
            if(atual.getValor() <= pivo.getValor()) {
                troca(notas, analisando, menoresEncontrados);
                menoresEncontrados++;
            }
        }
        troca(notas, termino -1, menoresEncontrados);
        return menoresEncontrados;

    }

    private static void troca(Nota[] notas, int de, int para) {
        Nota nota1 = notas[de];
        Nota nota2 = notas[para];
        notas[para] = nota1;
        notas[de] = nota2;
    }


}
