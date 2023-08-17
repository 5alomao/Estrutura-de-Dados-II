package javasorts;

import java.util.Scanner;

public class BubbleSort {

    public static long compara = 0, trocas = 0;

    public static void bSort(int array[]) {
        for (int fase = 1; fase < array.length; fase++) {
            boolean ord = true;
            for (int comp = 0; comp < array.length - fase; comp++) {
                compara++;
                if (array[comp] > array[comp + 1]) {
                    trocas++;
                    int temp = array[comp];
                    array[comp] = array[comp + 1];
                    array[comp + 1] = temp;
                    ord = false;
                }
            }
            if (ord) {
                break;
            }
        }
    }

    public static void bSort2(int array[]) {
        for (int fase = 1; fase < array.length; fase++) {
            boolean ord = true;
            for (int comp = 0; comp < array.length - fase; comp++) {
                if (array[comp] < array[comp + 1]) {
                    int temp = array[comp + 1];
                    array[comp + 1] = array[comp];
                    array[comp] = temp;
                    ord = false;
                }
            }
            if (ord) {
                break;
            }
        }
    }

    public static void bSortComentado(int array[]) {
        Scanner sc = new Scanner(System.in);

        for (int fase = 1; fase < array.length; fase++) {
            System.out.println("Fase [" + fase + "]");
            JavaSorts.printArray(array);
            sc.nextLine();
            for (int comp = 0; comp < array.length - fase; comp++) {
                System.out.println("Comparado [" + array[comp] + "] com [" + array[comp + 1] + "]");
                if (array[comp] > array[comp + 1]) {
                    System.out.println("Trocou");
                    int temp = array[comp];
                    array[comp] = array[comp + 1];
                    array[comp + 1] = temp;
                }
            }
        }
    }
}
