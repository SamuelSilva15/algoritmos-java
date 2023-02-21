import linear.MenorValor;
import model.Nota;
import ordenacao.BubbleSort;
import ordenacao.InsertionSort;
import ordenacao.SelectionSort;

import static binaria.BuscaBinaria.busca;
import static binaria.EncontraMenores.encontraMenores;
import static binaria.OrdenacaoAoIntercalar.ordena;
import static binaria.Pivota.particiona;

public class Main {

    public static void main(String[] args) {
        int[] valores = new int[10];
        valores[0] = 4;
        valores[1] = 3;
        valores[2] = 9;
        valores[3] = 8;
        valores[4] = 14;
        valores[5] = 47;
        valores[6] = 13;
        valores[7] = 5;
        valores[8] = 6;
        valores[9] = 7;

        System.out.println("O menor valor é: " + MenorValor.buscaMenor(valores));
        System.out.println("A lista ordenana com Selection Sort: ");
        SelectionSort.ordena(valores) ;
        System.out.println("\n A lista ordenada com Insertion Sort: ");
        InsertionSort.ordena(valores);
        System.out.println("\n A lista ordenada com Bubble Sort: ");
        BubbleSort.ordena(valores);
        System.out.println("O menor com busca binária: ");
        busca(valores, 4);


        Nota guilherme = new Nota("guilherme", 7);
        Nota[] notas = {
                new Nota("andre", 4),
                new Nota("carlos", 8.5),
                new Nota("ana", 10),
                new Nota("jonas", 3),
                new Nota("juliana", 6.7),
                guilherme,
                new Nota("paulo", 9),
                new Nota("mariana", 5),
                new Nota("lucia", 9.3)
        };

        ordena(notas, 0, notas.length);
        System.out.println("Ordena com o merge sort: ");
        for(Nota nota : notas) {
            System.out.println(nota.getAluno() +" "  + nota.getValor());
        }

        System.out.println("Encontrando menores valores para um posição relativa com o merge sort: ");
        encontraMenores(guilherme, notas);

        int novaPosicao = particiona(notas,0, notas.length);

        System.out.println("O pivo foi parar em " + novaPosicao);

        for(int atual = 0; atual < notas.length; atual++) {
            Nota nota = notas[atual];
            System.out.println(nota.getAluno() + " " + nota.getValor());
        }
    }
}