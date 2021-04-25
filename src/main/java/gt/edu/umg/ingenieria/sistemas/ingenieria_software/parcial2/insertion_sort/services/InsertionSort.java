package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.insertion_sort.services;

import java.util.Arrays;

public class InsertionSort implements IInsertionSort {
    @Override
    public void insertionSort(String[] args) {
        for (int j = 1; j < args.length; j++) {
            int i;
            String key = args[j];
            i = j - 1;
            while (i >= 0) {
                if (key.compareTo(args[i]) > 0) {
                    break;
                }
                args[i + 1] = args[i];
                i--;
            }
            args[i + 1] = key;
        }
    }
}
