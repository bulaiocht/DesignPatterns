package tutorial.strategy.entities;

import java.util.Arrays;

/**
 * Concrete strategy. Insertion sorting algorithm.
 * Created by Kocherha Vitalii on 31.05.2016.
 */
public class InsertingSort implements Sorting {

    @Override
    public void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int curElement = arr[i];
            int prevKey = i - 1;
            while (prevKey >= 0 && arr[prevKey] > curElement) {
                arr[prevKey + 1] = arr[prevKey];
                prevKey--;
            }
            arr[prevKey + 1] = curElement;
        }
    }
}
