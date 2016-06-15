package tutorial.strategy;

import tutorial.strategy.entities.*;

/**
 *
 * Created by Kocherha Vitalii on 31.05.2016.
 */
public class StrategyMain {
    public static void main(String[] args) {

        int[] array1 = {1, 7, 54, 6, 98, 21, 567, 58, 42, 31, 1, 22, 54, 3, 55, 18, 4999};
        int[] array2 = {1, 7, 54, 6, 98, 21, 567, 58, 42, 31, 1, 22, 54, 3, 55, 18, 4999};
        int[] array3 = {1, 7, 54, 6, 98, 21, 567, 58, 42, 31, 1, 22, 54, 3, 55, 18, 4999};
        SortingClient sorter = new SortingClient();
        sorter.setSorting(new BubbleSort());
        sorter.performStrategy(array1);
        sorter.setSorting(new SelectionSorting());
        sorter.performStrategy(array2);
        sorter.setSorting(new InsertingSort());
        sorter.performStrategy(array3);

    }
}
