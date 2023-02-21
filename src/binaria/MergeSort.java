package binaria;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int []vetor = {4, 6, 7, 3, 5, 1, 2, 8};
        int[] auxiliar = new int[vetor.length];

        mergeSort(vetor, auxiliar, 0, vetor.length-1);
        System.out.println(Arrays.toString(vetor));
    }

    private static void mergeSort(int[] vetor, int[] auxiliar, int inicio, int fim) {
        if(inicio < fim ) {
            int meio = (int) (inicio + fim) / 2;
            mergeSort(vetor, auxiliar, inicio, meio);
            mergeSort(vetor, auxiliar, meio+1, fim);
            intercala(vetor, auxiliar, inicio, meio, fim);
        }
    }

    private static void intercala(int[] vetor, int[] auxiliar, int inicio, int meio, int fim) {
        for(int i = 0; i <= fim; i++) {
            auxiliar[i] = vetor[i];
        }

        int esq = inicio;
        int dir = meio+1;

        for(int i = inicio; i <= fim; i++) {
            if(esq > meio) {
                vetor[i] = auxiliar[dir++];
            } else if (dir > fim) {
                vetor[i] = auxiliar[esq++];
            } else if(auxiliar[esq] > auxiliar[meio]) {
                vetor[i] = auxiliar[esq++];
            } else {
                vetor[i] = auxiliar[dir++];
            }
        }
    }
}

