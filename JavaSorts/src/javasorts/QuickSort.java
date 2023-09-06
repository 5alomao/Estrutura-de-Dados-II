package javasorts;

public class QuickSort {
    
    public static long compara = 0, trocas = 0;
    
    
    public static void qSort(int[] array, int inicio, int fim) {
        if (inicio < fim) {
            int p = particao(array, inicio, fim);
            qSort(array, inicio, p);
            qSort(array, p+1, fim);
        }
    }
    
    public static int particao(int[] array, int inicio, int fim) {
        int meio = (int) (inicio + fim) / 2;
        int pivot = array[meio];
        int i = inicio - 1;
        int j = fim + 1;
        while (true) {
            do {
                i++;
            } while (array[i] < pivot);
            do {
                j--;
            } while (array[j] > pivot);
            //compara++;
            if (i >= j) {
                return j; // posicao da troca
            }
            //trocas++;
            int aux = array[i];
            array[i] = array[j];
            array[j] = aux;
        }
    }
    
}
