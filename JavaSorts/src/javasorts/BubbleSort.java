package javasorts;

import java.util.Scanner;

public class BubbleSort {
    
    public static void bSort(int array[]){
        for(int fase = 1; fase < array.length-1; fase++){
            for(int comp=0; comp < array.length-fase; comp++){
                if(array[comp] > array[comp+1]){
                    int temp = array[comp];
                    array[comp] = array[comp+1];
                    array[comp+1] = temp;
                }
            }
        }
    }
    
    public static void bSortComentado(int array[]){
        Scanner sc = new Scanner(System.in);
        
        for(int fase = 1; fase < array.length-1; fase++){
            System.out.println("Fase ["+fase+"]");
            JavaSorts.printArray(array);
            sc.nextLine();
            for(int comp=0; comp < array.length-fase; comp++){
                System.out.println("Comparado ["+array[comp]+"] com ["+array[comp+1]+"]");
                if(array[comp] > array[comp+1]){
                    System.out.println("Trocou");
                    int temp = array[comp];
                    array[comp] = array[comp+1];
                    array[comp+1] = temp;
                }
            }
        }
    }
}
