# PSA_Assignment3

 Requirements:
 
 (Part 1) You are to implement three (3) methods (repeat, getClock, and toMillisecs) of a class called Timer. Please see the skeleton class that I created in the repository. Timer is invoked from a class called Benchmark_Timer which implements the Benchmark interface.
The function to be timed, hereinafter the "target" function, is the Consumer function fRun (or just f) passed in to one or other of the constructors. For example, you might create a function which sorts an array with n elements.
The generic type T is that of the input to the target function.
The first parameter to the first run method signature is the parameter that will, in turn, be passed to target function. In the second signature, supplier will be invoked each time to get a t which is passed to the other run method. The second parameter to the run function (m) is the number of times the target function will be called. The return value from run is the average number of milliseconds taken for each run of the target function.

(Part 2) Implement InsertionSort (in the InsertionSort class) by simply looking up the insertion code used by Arrays.sort. If you have the instrument = true setting in test/resources/config.ini, then you will need to use the helper methods for comparing and swapping (so that they properly count the number of swaps/compares). The easiest is to use the helper.swapStableConditional method, continuing if it returns true, otherwise breaking the loop. Alternatively, if you are not using instrumenting, then you can write (or copy) your own compare/swap code. Either way, you must run the unit tests in InsertionSortTest.

(Part 3) Implement a main program (or you could do it via your own unit tests) to actually run the following benchmarks: measure the running times of this sort, using four different initial array ordering situations: random, ordered, partially-ordered and reverse-ordered. I suggest that your arrays to be sorted are of type Integer. Use the doubling method for choosing n and test for at least five values of n. Draw any conclusions from your observations regarding the order of growth.


Observation and Evidence: 

The reverse-sorted array requires the longest amount of time to complete the insertion sort algorithm due to the need for numerous number swaps. This correlation is demonstrated in the benchmarking results shown in the observation table. The table displays that, among the various types of arrays, the reverse-sorted array takes the longest to run the insertion sort, followed by the randomly sorted array, which is faster than the reverse-sorted array. The partially sorted array takes less time than the randomly sorted array, and the sorted array takes the shortest amount of time to run the insertion sort. 

Therefore, Ordered < Partially Ordered < Randomly Ordered < Reverse Ordered.  
