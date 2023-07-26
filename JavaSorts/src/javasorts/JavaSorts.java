package javasorts;

import java.util.Scanner;
import java.util.Random;

public class JavaSorts {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        int size;
        System.out.println("Tamanho do Vetor:");
        size = sc.nextInt();
        int[] array = new int[size];
        
        System.out.println("Dados Vetor:");
        for(int i=0;i<array.length;i++)
            array[i] = sc.nextInt();
        
        System.out.println("Vetor Original:");
        printArray(array);
        
        BubbleSort.bSort(array);
        System.out.println("Vetor Ordenado:");
        printArray(array);
    }
    
    public static void printArray(int array[]){
        for(int i=0; i<array.length;i++)
            System.out.print(array[i]+"|");
        System.out.println("\n");
    }
}
