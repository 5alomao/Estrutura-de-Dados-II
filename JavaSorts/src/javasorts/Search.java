package javasorts;

import java.util.Scanner;

public class Search {

    public static int compLinear, compBinary;

    public static boolean linearSearch(int array[], int x) {
        compLinear = 0;
        for (int i = 0; i < array.length; i++) {
            compLinear++;
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
        compBinary = 0;
        while (ini <= fim) {
            meio = (ini + fim) / 2;
            compBinary++;
            if (x == array[meio]) {
                return true;
            } else if (x > array[meio]) {
                ini = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return false;
    }

    public static boolean binarySearchComentado(int array[], int x) {
        Scanner sc = new Scanner(System.in);
        int ini, fim, meio;
        ini = 0;
        fim = array.length - 1;
        compBinary = 0;
        while (ini <= fim) {
            meio = (ini + fim) / 2;
            System.out.println("Ini: "+ini+" Fim: "+fim+" Meio: "+meio);
            JavaSorts.printIntervalo(array, ini, fim);
            compBinary++;
            System.out.println("Comparando com: "+array[meio]);
            sc.nextLine();
            if (x == array[meio]) {
                return true;
            } else if (x > array[meio]) {
                ini = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return false;
    }

  

}
