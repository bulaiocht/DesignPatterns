package tutorial.strategy.entities;

/**
 * Context
 * Created by Kocherha Vitalii on 31.05.2016.
 */
public class SortingClient {

    private Sorting sorting;

    public void setSorting(Sorting sorting) {
        this.sorting = sorting;
    }

    public void performStrategy(int[] arr) {
        this.sorting.sort(arr);
    }

}
