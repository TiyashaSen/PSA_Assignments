package edu.neu.coe.info6205.sort.elementary;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

import com.google.common.base.Supplier;
import com.google.common.collect.Lists;

import edu.neu.coe.info6205.util.Benchmark_Timer;



	public class BenchmarkInsertionSort {
	

		private static final int REPETATION = 100;
		private static final int FROM = -1000;
		private static final int TO = 1000;
		private static final Random RANDOM = new Random();


		public static void main(String[] args) {
		final List<Integer[]> randNumList = Lists.newArrayList(

	
		rndmNmArrGen(400),
		rndmNmArrGen(800),
		rndmNmArrGen(1600),
		rndmNmArrGen(3200),
		rndmNmArrGen(6400),
		rndmNmArrGen(12800),
		rndmNmArrGen(12800)
		
		);

		for(Integer[] randomlyGenNo : randNumList) {
		System.out.println("----------------------------------");
		System.out.println("No of element, N: " + randomlyGenNo.length);
		Arrays.sort(randomlyGenNo, Collections.reverseOrder());
		benchmarkCallTimerFunction("Array In Reverse Order", randomlyGenNo);
		benchmarkCallTimerFunction("Array In Random Order", randomlyGenNo);
		Arrays.sort(randomlyGenNo, 0, (randomlyGenNo.length)/2);
		benchmarkCallTimerFunction("Array In Partial Order", randomlyGenNo);
		Arrays.sort(randomlyGenNo);
		benchmarkCallTimerFunction("Array In Order",randomlyGenNo);
		System.out.println("----------------------------------");
		}
		}

		private static Integer[] rndmNmArrGen(int k) {
		Integer[] randomNumbers = new Integer[k];

		for(int i=0; i<k; i++){
		randomNumbers[i] = RANDOM.nextInt(TO + 1 - FROM) + FROM;
		}
		return randomNumbers;
		}

		public static void benchmarkCallTimerFunction(final String description, final Integer[] inArr){
		final Consumer<Integer[]> sortUsingInsertion = InsertionSort::sort;
		final Supplier<Integer[]> supplier = () -> Arrays.copyOf(inArr, inArr.length);

		final Benchmark_Timer<Integer[]> benchmark_timer = new Benchmark_Timer<>(description,null, sortUsingInsertion,null);
		final double meanOfArraySortingTimeInMilliSeconds = benchmark_timer.runFromSupplier(supplier, REPETATION);

		System.out.println(description + " : mean sort time (in ms): " + meanOfArraySortingTimeInMilliSeconds);
		}
		
		
	}
