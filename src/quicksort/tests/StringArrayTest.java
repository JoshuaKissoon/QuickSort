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

    public static void main(String[] args)
    {
        int N = 1000000;    // Sorting 1 million items
        String[] items = new String[N];
        Random rand = new Random();

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (int i = 0; i < N; i++)
        {
            items[i] = "" + alphabet.charAt(rand.nextInt(alphabet.length())) + alphabet.charAt(rand.nextInt(alphabet.length())) + alphabet.charAt(rand.nextInt(alphabet.length()));
            //items[i] = "" + alphabet.charAt(rand.nextInt(alphabet.length()));
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
        //sort.printItems();

        startTime = System.nanoTime();
        Dijkstra3WayQuickSort<String> sort2 = new Dijkstra3WayQuickSort<>(items);
        sort.sort();

        endTime = System.nanoTime();
        duration = endTime - startTime;

        System.out.println("Dijkstra3WayQuickSort time taken: " + duration);

        //sort2.printItems();
    }
}
