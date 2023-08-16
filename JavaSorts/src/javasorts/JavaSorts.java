package javasorts;

import java.util.Scanner;
import java.util.Random;

public class JavaSorts {
    
    static int menuEntrada(){
        Scanner sc =new Scanner(System.in);
        System.out.println("1- Gerar Dados");
        System.out.println("2- Entrar com Dados");
        int op = sc.nextInt();
        return op;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        int size, op;
        System.out.println("Tamanho do Vetor:");
        size = sc.nextInt();
        int[] array = new int[size];
        op = menuEntrada();
        
        switch(op){
            case 1:
                for(int i=0;i<array.length;i++)
                    array[i] = rand.nextInt(100);
                break;
            case 2:
                System.out.println("Insira os Dados do Vetor:");
                for(int i=0;i<array.length;i++)
                    array[i] = sc.nextInt();
                break;
                
        }
        System.out.println("Vetor Original:");
        printArray(array);
        
//      BubbleSort.bSort(array);
//      SelectionSort.sSort(array);
//      SelectionSort.sSortComentado(array);
//      InsertionSort.iSort(array);
        InsertionSort.iSortComentado(array);
        System.out.println("Vetor Ordenado:");
        printArray(array);
        
    }
    
    public static void printArray(int array[]){
        for(int i=0; i<array.length;i++)
            System.out.print(array[i]+"|");
        System.out.println("\n");
    }
}

