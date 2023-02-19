import basico.MenorValor;
import ordenacao.BubbleSort;
import ordenacao.InsertionSort;
import ordenacao.SelectionSort;

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
    }
}