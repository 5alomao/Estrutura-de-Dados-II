package carsort;

import java.util.ArrayList;

public class Search {

    public static int linearSearchModel(ArrayList<Data> dataList, String search) {
        int comp = 0;

        for (Data d : dataList) {
            comp++;
            if (d.getName().equals(search)) {
                return comp;
            }
        }

        return -1;
    }

    public static int linearSearchOrigin(ArrayList<Data> dataList, String search) {
        int comp = 0;

        for (Data d : dataList) {
            comp++;
            if (d.getOrigin().equals(search)) {
                return comp;
            }
        }

        return -1;
    }

    public static int binarySearchModel(ArrayList<Data> dataList, String search) {
        int inicio = 0;
        int comp = 0;
        int meio;
        int fim = dataList.size() - 1;

        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            comp++;
            if (dataList.get(meio).getName().equals(search)) {
                return comp;
            } else if (dataList.get(meio).getName().compareTo(search) < 0) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }
    
    public static int binarySearchOrigin(ArrayList<Data> dataList, String search) {
        int inicio = 0;
        int comp = 0;
        int meio;
        int fim = dataList.size() - 1;

        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            comp++;
            if (dataList.get(meio).getOrigin().equals(search)) {
                return comp;
            } else if (dataList.get(meio).getOrigin().compareTo(search) < 0) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }
}
