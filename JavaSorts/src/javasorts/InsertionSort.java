package javasorts;

import java.util.Scanner;

public class InsertionSort {
    
    private static void insert(int array[], int i){
        int eleito = array[i];
        int comp = i-1;
        while( eleito < array[comp] && comp >=0){
            array[comp+1] = array[comp];
            comp--;
        }
        array[comp+1] = eleito;
    }
    
    private static void insertComentado(int array[], int i){
        Scanner sc = new Scanner(System.in);
        int eleito = array[i];
        int comp = i-1;
        System.out.println("Eleito: "+eleito);
        sc.nextLine();
        while(comp >=0 && eleito < array[comp]){
            System.out.println("Comparando");
            System.out.println("V["+comp+"] = "+array[comp]);
            array[comp+1] = array[comp];
            
            comp--;
            JavaSorts.printArray(array);
            sc.nextLine();
        }
        System.out.println("Inserindo eleito indice: "+(comp+1));
        array[comp+1] = eleito;
        JavaSorts.printArray(array);
        sc.nextLine();
    }
    
    public static void iSort(int array[]){
        for(int i=1;i < array.length;i++)
            insert(array,i);
        
    }
    
    public static void iSortComentado(int array[]){
        for(int i=1;i < array.length;i++){
            System.out.println("Fase: "+i);
            insertComentado(array,i);
        }
        
    }
}
