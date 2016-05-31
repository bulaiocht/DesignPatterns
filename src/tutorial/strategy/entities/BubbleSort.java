package tutorial.strategy.entities;

/**
 * Concrete strategy. Bubble sorting algorithm.
 * Created by Kocherha Vitalii on 31.05.2016.
 */
public class BubbleSort implements Sorting {

    @Override
    public void sort(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int bubble = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = bubble;
                }
            }
        }
    }
}
