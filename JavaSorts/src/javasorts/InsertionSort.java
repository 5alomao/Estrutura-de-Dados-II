package javasorts;

import java.util.Scanner;

public class InsertionSort {

    public static long compara = 0, deslocamento = 0;

    private static void insert(int array[], int i) {
        int eleito = array[i];
        int comp = i - 1;

        while (comp >= 0 && eleito < array[comp]) {
            compara++;
            array[comp + 1] = array[comp];
            deslocamento++;
            comp--;
        }
        compara++; //comparação de saída
        array[comp + 1] = eleito;
    }

    private static void insertComentado(int array[], int i) {
        Scanner sc = new Scanner(System.in);
        int eleito = array[i];
        int comp = i - 1;
        System.out.println("Eleito: " + eleito);
        sc.nextLine();
        while (comp >= 0 && eleito < array[comp]) {
            System.out.println("Comparando");
            System.out.println("V[" + comp + "] = " + array[comp]);
            array[comp + 1] = array[comp];
            comp--;
            JavaSorts.printArray(array);
            sc.nextLine();
        }
        System.out.println("Inserindo eleito indice: " + (comp + 1));
        array[comp + 1] = eleito;
        JavaSorts.printArray(array);
        sc.nextLine();
    }

    public static void iSort(int array[]) {
        for (int i = 1; i < array.length; i++) {
            insert(array, i);
        }

    }

    public static void iSortComentado(int array[]) {
        for (int i = 1; i < array.length; i++) {
            System.out.println("Fase: " + i);
            insertComentado(array, i);
        }

    }
}
