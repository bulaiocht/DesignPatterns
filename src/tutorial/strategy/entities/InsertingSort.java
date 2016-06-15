package tutorial.strategy.entities;

import java.util.Arrays;

/**
 * Concrete strategy. Insertion sorting algorithm.
 * Created by Kocherha Vitalii on 31.05.2016.
 */
public class InsertingSort implements Sorting {
    int cicles = 0;

    @Override
    public void sort(int[] arr) {
        System.out.println("Insertion sorting");
        for (int i = 1; i < arr.length; i++) {
            int curElement = arr[i];
            int prevKey = i - 1;
            while (prevKey >= 0 && arr[prevKey] > curElement) {
                arr[prevKey + 1] = arr[prevKey];
                prevKey--;
                cicles++;
            }
            arr[prevKey + 1] = curElement;
            cicles++;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("number of cicles: " + cicles);
    }

}
