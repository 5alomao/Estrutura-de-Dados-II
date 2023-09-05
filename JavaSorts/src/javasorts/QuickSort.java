package javasorts;

public class QuickSort {
    
    public static long compara = 0, trocas = 0;
    
    
    public static void qSort(int[] array, int esquerda, int direita) {
        if (esquerda < direita) {
            int p = particao(array, esquerda, direita);
            qSort(array, esquerda, p);
            qSort(array, p+1, direita);
        }
    }
    
    public static int particao(int[] array, int esquerda, int direita) {
        int meio = (int) (esquerda + direita) / 2;
        int pivot = array[meio];
        int i = esquerda - 1;
        int j = direita + 1;
        while (true) {
            do {
                i++;
            } while (array[i] < pivot);
            do {
                j--;
            } while (array[j] > pivot);
            compara++;
            if (i >= j) {
                return j; // posicao da troca
            }
            trocas++;
            int aux = array[i];
            array[i] = array[j];
            array[j] = aux;
        }
    }
    
}
