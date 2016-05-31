package tutorial.strategy;

import tutorial.strategy.entities.BubbleSort;
import tutorial.strategy.entities.Sorting;
import tutorial.strategy.entities.SortingClient;

/**
 * Created by Kocherha Vitalii on 31.05.2016.
 */
public class StrategyMain {
    public static void main(String[] args) {
        SortingClient sorter = new SortingClient();
        sorter.setSorting(new BubbleSort());
        //sorter.performStrategy();
    }
}
