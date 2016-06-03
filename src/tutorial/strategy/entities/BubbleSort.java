package tutorial.strategy.entities;

import java.util.Arrays;

/**
 * Concrete strategy. Bubble sorting algorithm.
 * Created by Kocherha Vitalii on 31.05.2016.
 */
public class BubbleSort implements Sorting {
    int cicles = 0;
    @Override
    public void sort(int[] arr) {
        System.out.println("Bubble sorting");
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int bubble = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = bubble;
                }
                cicles++;
            }
            cicles++;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("number of cicles: " + cicles);
    }

}
