# Assignments

#PSA_Assignment3

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


#PSA_Assignment4

Step 1: 
(a) Implement height-weighted Quick Union with Path Compression. For this, you will flesh out the class UF_HWQUPC. All you have to do is to fill in the sections marked with // TO BE IMPLEMENTED ... // ...END IMPLEMENTATION. 

(b) Check that the unit tests for this class all work. You must show "green" test results in your submission (screenshot is OK).  

Step 2: 
Using your implementation of UF_HWQUPC, develop a UF ("union-find") client that takes an integer value n from the command line to determine the number of "sites." Then generates random pairs of integers between 0 and n-1, calling connected() to determine if they are connected and union() if not. Loop until all sites are connected then print the number of connections generated. Package your program as a static method count() that takes n as the argument and returns the number of connections; and a main() that takes n from the command line, calls count() and prints the returned value. If you prefer, you can create a main program that doesn't require any input and runs the experiment for a fixed set of n values. Show evidence of your run(s). 

Step 3: 
Determine the relationship between the number of objects (n) and the number of pairs (m) generated to accomplish this (i.e. to reduce the number of components from n to 1). Justify your conclusion in terms of your observations and what you think might be going on. 


Observation and Evidence:

The observation for this relationship would likely be a correlation between the value of n and the number of pairs m needed to reduce the number of components from n to 1. For each sites count n, the weighted quick-union by height 1000 times is done. 

 

Using the implementation of UF_HWQUPC.java, I created a client class named as UnionFindClient.java accepts an integer N as the number of sites. The client then generates random combinations of integers between 0 and N-1 and checks if they are connected by using the connected() function. If they are not connected, the union() function is called. This process continues until all sites are connected, and the result is the number of connections made. The program has been packaged as a static method called count() and can be invoked in the main() method. 

In the primary function of the program, to ensure efficiency and precision, I established 12 values for the number of sites, “n”, with a range from 100 to 204800. For each n, I computed the results 1000 times and took the average to determine the number of connections required to connect all the sites. The results of my calculations are presented in the images and graph attached in the document.
