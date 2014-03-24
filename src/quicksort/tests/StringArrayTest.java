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
public class StringArrayTest
{

    private final int N = 1_000_000;    // Sorting 1 million items

    public StringArrayTest()
    {
        String[] items = new String[N];
        Random rand = new Random();

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (int i = 0; i < N; i++)
        {
            items[i] = "" + alphabet.charAt(rand.nextInt(alphabet.length())) + alphabet.charAt(rand.nextInt(alphabet.length())) + alphabet.charAt(rand.nextInt(alphabet.length()));
        }

        System.out.println("Starting Algorithms");
        
        /* Variables for timing algorithm execution time */
        long startTime, endTime, duration;

        startTime = System.nanoTime();
        QuickSort<String> sort = new QuickSort<>(items);
        sort.sort();
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("QuickSort time taken:             " + duration);

        startTime = System.nanoTime();
        Dijkstra3WayQuickSort<String> sort2 = new Dijkstra3WayQuickSort<>(items);
        sort.sort();
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Dijkstra3WayQuickSort time taken: " + duration);

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
