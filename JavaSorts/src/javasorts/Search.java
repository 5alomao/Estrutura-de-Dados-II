package javasorts;

public class Search {

    public static boolean linearSearch(int array[], int x) {
        for (int i = 0; i < array.length; i++) {
            if (x == array[i]) {
                return true;
            }
        }
        return false;
    }

    public static boolean binarySearch(int array[], int x) {
        int ini, fim, meio;
        ini = 0;
        fim = array.length - 1;
        while (ini <= fim) {
            meio = (ini + fim) / 2;
            if (x == array[meio]) {
                return true;
            } else if (x > array[meio]) {
                ini = meio + 1;
            }
            else
                fim = meio - 1;
        }
        return false;
    }
}
