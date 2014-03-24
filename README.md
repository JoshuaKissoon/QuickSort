QuickSort
=========

Implementations and Performance evaluations of different QuickSort algorithms using Java Generics.

Versions of QuickSort currently implemented:
1. Basic QuickSort (Tony Hoare version)
2. Dijkstra 3-Qay Quicksort


Using the Algos
---------------

**Create an Instance passing in your data to be sorted**

```Java
QuickSort<Integer> sort1 = new QuickSort<>(items);   // For Basic Quicksort
Dijkstra3WayQuickSort<Integer> sort2 = new Dijkstra3WayQuickSort<>(items);  // For Dijkstra's method
```
Note that your input must be comparable, meaning that it must implement Java's Comparable interface.


**Simply call sort**
```Java
sort1.sort();
sort2.sort();
```


Performance Evaluations
-----------------------
Here is the output of some performance evaluations I have carried out. The timings are measured in nanoseconds.

**Test 1**

https://github.com/JoshuaKissoon/QuickSort/blob/master/src/quicksort/tests/IntegerArrayTest.java

Sorting a randomly popluated integer array of 10 million items. Test ran 10 times. Here we see that for some inputs (the ones with more repeated values), Dijkstra's method is faster than the basic QuickSort.

```Java

Starting Algorithms
QuickSort time taken:                        8246999516
Dijkstra3WayQuickSort time taken:            10243131671


Starting Algorithms
QuickSort time taken:                        7295013321
Dijkstra3WayQuickSort time taken:            9505071677


Starting Algorithms
QuickSort time taken:                        10388584283
Dijkstra3WayQuickSort time taken:            9341181607


Starting Algorithms
QuickSort time taken:                        6295463504
Dijkstra3WayQuickSort time taken:            8296744078


Starting Algorithms
QuickSort time taken:                        6077593418
Dijkstra3WayQuickSort time taken:            8171088339


Starting Algorithms
QuickSort time taken:                        9568605845
Dijkstra3WayQuickSort time taken:            8422058332


Starting Algorithms
QuickSort time taken:                        10922960332
Dijkstra3WayQuickSort time taken:            8258924943


Starting Algorithms
QuickSort time taken:                        6473850877
Dijkstra3WayQuickSort time taken:            8656631854


Starting Algorithms
QuickSort time taken:                        10159281871
Dijkstra3WayQuickSort time taken:            8890047962


Starting Algorithms
QuickSort time taken:                        7246685555
Dijkstra3WayQuickSort time taken:            8624706623

```

