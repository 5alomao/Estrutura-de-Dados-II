package javasorts;

import java.util.Scanner;
import java.util.Random;

public class JavaSorts {

    static int menuOrdenar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-- ESTRUTURAS --");
        System.out.println("1- Bubble Sort");
        System.out.println("2- Selection Sort");
        System.out.println("3- Insertion Sort");
        int op = sc.nextInt();
        return op;
    }

    static int menuEntrada() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-- GERAR DADOS --");
        System.out.println("1- Random");
        System.out.println("2- Manual");
        int op = sc.nextInt();
        return op;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        long tempoInicial, tempoFinal;
        int size, op, org;

        System.out.println("Tamanho do Vetor:");
        size = sc.nextInt();
        int[] array = new int[size];

        op = menuEntrada();
        switch (op) {
            case 1:
                for (int i = 0; i < array.length; i++) {
                    array[i] = rand.nextInt(100);
                }
                break;
            case 2:
                System.out.println("Insira os Dados do Vetor:");
                for (int i = 0; i < array.length; i++) {
                    array[i] = sc.nextInt();
                }
                break;

        }
        
        org = menuOrdenar();
        switch (org) {
            case 1:
                System.out.println("Array Original");
                JavaSorts.printArray(array);
                tempoInicial = System.currentTimeMillis();
                BubbleSort.bSort(array);
                tempoFinal = System.currentTimeMillis();
                System.out.println("Array Ordenado");
                JavaSorts.printArray(array);
                System.out.println("-- RESULTADOS --");
                System.out.println("Comparacoes: " + BubbleSort.compara);
                System.out.println("Trocas: " + BubbleSort.trocas);
                System.out.println("Tempo Gasto: " + (tempoFinal - tempoInicial) + " ms");
                break;
            case 2:
                tempoInicial = System.currentTimeMillis();
                SelectionSort.sSort(array);
                tempoFinal = System.currentTimeMillis();
                System.out.println("-- RESULTADOS --");
                System.out.println("Comparacoes: " + SelectionSort.compara);
                System.out.println("Trocas: " + SelectionSort.trocas);
                System.out.println("Tempo Gasto: " + (tempoFinal - tempoInicial) + " ms");
                break;
            case 3:
                tempoInicial = System.currentTimeMillis();
                InsertionSort.iSort(array);
                tempoFinal = System.currentTimeMillis();
                System.out.println("-- RESULTADOS --");
                System.out.println("Comparacoes: " + InsertionSort.compara);
                System.out.println("Deslocamento: " + InsertionSort.deslocamento);
                System.out.println("Tempo Gasto: " + (tempoFinal - tempoInicial) + " ms");
                break;
            default:
                System.out.println("Opcao Invalida !");
        }

    }
    
    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "|");
        }
        System.out.println("\n");
    }
    
}
