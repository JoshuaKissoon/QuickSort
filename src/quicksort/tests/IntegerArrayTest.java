package quicksort.tests;

import java.util.Random;
import quicksort.Dijkstra3WayQuickSort;
import quicksort.QuickSort;

/**
 * Testing QuickSort on a string array
 *
 * @author Joshua Kissoon
 * @since 20140305
 */
public class IntegerArrayTest
{

    private final int N = 10_000_000;    // Sorting 10 million items
    private final Integer[] items;

    public IntegerArrayTest()
    {
        items = new Integer[N];
        Random rand = new Random();

        for (int i = 0; i < N; i++)
        {
            items[i] = rand.nextInt(N);
        }

        System.out.println("Starting Algorithms");

        /* Variables for timing algorithm execution time */
        long startTime, endTime, duration;

        startTime = System.nanoTime();

        QuickSort<Integer> sort = new QuickSort<>(items);
        sort.sort();

        endTime = System.nanoTime();
        duration = endTime - startTime;

        System.out.println("QuickSort time taken:                        " + duration);
        //sort.printItems();

        startTime = System.nanoTime();
        Dijkstra3WayQuickSort<Integer> sort2 = new Dijkstra3WayQuickSort<>(items);
        sort2.sort();

        endTime = System.nanoTime();
        duration = endTime - startTime;

        System.out.println("Dijkstra3WayQuickSort time taken:            " + duration);
    }

    public static void main(String[] args)
    {
        /* Lets run the tests a few times */
        for (int i = 0; i < 10; i++)
        {
            new IntegerArrayTest();
            System.out.println();
        }
    }
}
