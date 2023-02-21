package binaria;

public class BuscaBinaria {

    public static void busca(int[] vetor, int buscado) {
        boolean achou = false;
        int inicio = 0;
        int fim = vetor.length - 1;
        int meio;
        while(inicio <= fim) {
            meio = (int) ((inicio + fim) / 2);
            if(vetor[meio] == buscado) {
                achou = true;
                break;
            } else if(vetor[meio] < buscado) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        if(achou == true) {
            System.out.println("Achou");
        } else {
            System.out.println("Não achou");
        }
    }
}
