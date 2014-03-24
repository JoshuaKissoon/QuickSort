package quicksort;

import java.util.Random;

/**
 * An Implementation of QuickSort
 *
 * @author Joshua Kissoon
 * @param <T> The type of item to be sorted
 */
public class Dijkstra3WayQuickSort<T extends Comparable<T>>
{

    private final T[] items;
    /**
     * @param items The set of items to be sorted
     */
    public Dijkstra3WayQuickSort(T[] items)
    {
        this.items = items;

        /* Shuffle the array */
        this.shuffleArray(items);
    }

    public void sort()
    {
        this.sort(0, this.items.length - 1);
    }

    private void sort(int lo, int hi)
    {
        if (hi <= lo)
        {
            return;
        }

        int j = this.partition(lo, hi);
        this.sort(lo, j - 1);
        this.sort(j + 1, hi);
    }

    /**
     * Partition the array
     *
     * @param lo The index of the low value to partition from
     * @param hi The index of the high value to partition from
     */
    private int partition(int lo, int hi)
    {
        int i = lo + 1, lt = lo;
        int gt = hi;

        while (i <= gt)
        {
            int cmp = this.items[i].compareTo(this.items[lo]);
            
            if (cmp < 0)
            {
                /* if items[i] < items[lt], swap them */
                this.swap(i++, lt++);
            }
            else if (cmp > 0)
            {
                /* if  items[i] > items[lt], swap items[i] and items[gt] */
                this.swap(i, gt--);
            }
            else
            {
                /* if items[i] == items[lt], increment i */
                i++;
            }
        }
        /* Return the index of the partitioning element */
        return gt;
    }

    /**
     * Swap values in our items array at the given indicies
     *
     * @param i Index of first item
     * @param j Index of second item
     */
    private void swap(int i, int j)
    {
        T temp = this.items[i];
        this.items[i] = this.items[j];
        this.items[j] = temp;
    }

    private void shuffleArray(T[] a)
    {
        int N = a.length;
        for (int i = 0; i < N; i++)
        {
            int r = i + new Random().nextInt(N - i);     // between i and N-1
            T temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }

    public void printItems()
    {
        StringBuilder sb = new StringBuilder("\nItems after Dijkstra's 3-way Quicksort: \n");

        T lastItem = null;
        for (T item : this.items)
        {
            if (!item.equals(lastItem))
            {
                sb.append("\n");
            }
            sb.append(item);
            sb.append(" ");
            lastItem = item;
        }
        sb.append("\n\n");
        System.out.println(sb);
    }

}
