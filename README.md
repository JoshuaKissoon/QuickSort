QuickSort
=========

Implementations and Performance evaluations of different QuickSort algorithms using Java Generics.

Versions of QuickSort currently implemented:
1. Basic QuickSort (Tony Hoare version)
2. Dijkstra 3-Qay Quicksort


Using the Algos
---------------

**Create an Instance passing in your data to be sorted**

Initialize the Algorithms passing in the type of object you need to sort

```Java
QuickSort<Type> sort1 = new QuickSort<>(items);   // For Basic Quicksort
Dijkstra3WayQuickSort<Type> sort2 = new Dijkstra3WayQuickSort<>(items);  // For Dijkstra's method

/* eg: For Integer sorting */
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

Sorting a randomly popluated Integer array of 10 million items. Test ran 10 times. Here we see that for some inputs (the ones with more repeated values), Dijkstra's method is faster than the basic QuickSort.

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

**Test 2**

https://github.com/JoshuaKissoon/QuickSort/blob/master/src/quicksort/tests/StringArrayTest.java

Sorting a randomly popluated String array of 10 million items. Test ran 10 times. Again, we see that for some inputs (the ones with more repeated values), Dijkstra's method is faster than the basic QuickSort.

```Java
Starting Algorithms
QuickSort time taken:                        8669208531
Dijkstra3WayQuickSort time taken:            10049634932

Starting Algorithms
QuickSort time taken:                        8007121761
Dijkstra3WayQuickSort time taken:            9657429122

Starting Algorithms
QuickSort time taken:                        10561245230
Dijkstra3WayQuickSort time taken:            8822092667

Starting Algorithms
QuickSort time taken:                        6451383695
Dijkstra3WayQuickSort time taken:            8562254761

Starting Algorithms
QuickSort time taken:                        6277885361
Dijkstra3WayQuickSort time taken:            8457511788

Starting Algorithms
QuickSort time taken:                        9882437764
Dijkstra3WayQuickSort time taken:            9118351107

Starting Algorithms
QuickSort time taken:                        11114758037
Dijkstra3WayQuickSort time taken:            9826407896

Starting Algorithms
QuickSort time taken:                        6699015335
Dijkstra3WayQuickSort time taken:            9500540920

Starting Algorithms
QuickSort time taken:                        10513810366
Dijkstra3WayQuickSort time taken:            9052427002

Starting Algorithms
QuickSort time taken:                        6979959609
Dijkstra3WayQuickSort time taken:            9151569507
```
