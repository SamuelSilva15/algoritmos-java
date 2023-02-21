package binaria;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] vetor = {4, 6, 7, 3, 5, 1, 2, 8};
        int[] auxiliar = new int[vetor.length - 1];

        System.out.println("Desordenado");
        System.out.println(Arrays.toString(vetor) + " ");
        quicksort(vetor, 0, vetor.length - 1);
        System.out.println(Arrays.toString(vetor));
    }

    private static void quicksort(int[] vetor, int esquerda, int direita) {
        if (esquerda < direita) {
            int p = particao(vetor, esquerda, direita);
            quicksort(vetor, esquerda, p);
            quicksort(vetor, p + 1, direita);
        }
    }

    private static int particao(int[] vetor, int esquerda, int direita) {
        int meio = (int) (esquerda + direita) / 2;
        int pivot = vetor[meio];
        int esq = esquerda - 1;
        int dir = direita + 1;
        while(true) {
            do {
                esq++;
            } while (vetor[esq] < pivot);
            do {
                dir--;
            } while (vetor[dir]> pivot);
            if(esq >= dir) {
                return dir;
            }
            int aux = vetor[esq];
            vetor[esq] = vetor[dir];
            vetor[dir] = aux;
        }
    }
}
