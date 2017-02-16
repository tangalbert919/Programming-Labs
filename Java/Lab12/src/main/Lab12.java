package main;

import java.util.Arrays;

/**
 * Lab 12: Mean, Median and Mode
 * 
 * @author Albert Tang
 */
public class Lab12 {
	
	public static void main(String[] args) {
		System.out.print("Enter the quantity of random numbers --->> ");
		
		int listSize = Utils.enterInt();
		
		// If you don't remember, we are declaring a new object.
		Statistics intList = new Statistics(listSize);
		
		intList.randomize();
		intList.computeMean();
		intList.computeMedian();
		intList.computeMode();
		intList.displayStats();
	}

}

class Statistics {
	private int list[];
	private int size;
	private double mean;
	private double median;
	private int mode;
	
	// This is the constructor.
	public Statistics(int s) {
		size = s;
		// We need to build a new array with the size determined. Otherwise, the methods will return errors.
		list = new int[size];
		mean = 0;
		median = 0;
		mode = 0;
	}
	
	public void randomize() { // Generate random numbers for the array.
		Utils.startSeed(12345);
		for (int k = 0; k < size; k++) {
			int rndNumber = Utils.seedRandom(10, 20);
			list[k] = rndNumber;
		}
	}
	public void computeMean() { // Calculate the mean of the array.
		double sum = 0;
		/**
		 * In this loop, we add the numbers from each array index into variable "sum", and is divided by
		 * how long the array is.
		 */
		for (int i = 0; i < list.length; i++)
			sum = sum + list[i];
		mean = sum / list.length;
	}
	public void computeMedian() { // Calculate the median of the array
		/*
		 * Before calculating the median, we absolutely NEED to sort it first.
		 */
		Arrays.sort(list);
		/*
		 * After sorting the array, we can find the median of the array.
		 */
		if (list.length % 2 == 0)
			median = ((list[size / 2] + list[(size / 2) + 1]) / 2);
		else
			median = list[size / 2];
	}
	public void computeMode() { // Calculate the mode of the array
		int maxCount = 0;
		/*
		 * For these loops, we need to count the number of indexes that have the same number as the array
		 * index found in list[i]. If we do, integer "count" is incremented by 1.
		 */
	    for (int i = 0; i < list.length; ++i) {
	        int count = 0;
	        for (int j = 0; j < list.length; ++j) {
	            if (list[j] == list[i]) ++count;
	        }
	        if (count > maxCount) {
	            maxCount = count;
	            mode = list[i];
	        }
	    }
	}
	public void displayStats() { // Display the mean, median and mode.
		System.out.println("The mean of this array is:   " + mean);
		System.out.println("The median of this array is: " + median);
		System.out.println("The mode of this array is:   " + mode);
	}
}