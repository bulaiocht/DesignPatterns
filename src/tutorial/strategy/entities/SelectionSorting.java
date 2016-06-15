package tutorial.strategy.entities;

import java.util.Arrays;

/**
 * Concrete strategy. Selection sorting algorithm.
 * Created by Kocherha Vitalii on 31.05.2016.
 */
public class SelectionSorting implements Sorting {
    int cicles = 0;
    @Override
    public void sort(int[] arr) {
        System.out.println("Selection sorting");
        int minIndex;
        int temp;
        for (int index = 0; index < arr.length - 1; index++) {
            minIndex = index;
            for (int nextIndex = index + 1; nextIndex < arr.length; nextIndex++) {
                if (arr[nextIndex] < arr[minIndex]) {
                    minIndex = nextIndex;
                }
                cicles++;
            }

            temp = arr[minIndex];
            arr[minIndex] = arr[index];
            arr[index] = temp;
            cicles++;

        }
        System.out.println(Arrays.toString(arr));
        System.out.println("number of cicles: " + cicles);
    }
}
