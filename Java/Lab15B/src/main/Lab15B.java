package main;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Lab 15B: The number array, and MORE sorting.
 * 
 * @author Albert Tang
 */
public class Lab15B {
	/*
	 * We will continue to learn more about algorithms, but this time, we are learning about searches.
	 */
	public static void main(String args[]) {
		System.out.print("\nEnter list size  --->> ");
		int listSize = Utils.enterInt();
		System.out.print("Enter minimum value --->> ");
		int listMin = Utils.enterInt();
		System.out.print("Enter maximum value --->> ");
		int listMax = Utils.enterInt();
		List4 array = new List4(listSize, listMin, listMax);
		array.display();     // We need to display the array on the screen.
		Utils.pause();       // Press enter to continue.
		System.out.print("Enter the number you want to find  --->> ");
		int search = Utils.enterInt();
		
		// We conduct a linear search to find the desired number.
		if (array.linearSearch(search))
			System.out.println(search + " is on the list at index " + List4.index);
		else
			System.out.println(search + " is not on the list");
		Utils.pause();
		
		System.out.print("Enter another number you want to find --->> ");
		int search2 = Utils.enterInt();
		
		// We need to display the sorted array.
		array.displaySortedArray();
		// We conduct a binary search to find the desired number.
		if (array.binarySearch(search2))
			System.out.println(search2 + " is on the list at index " + List4.index);
		else 
			System.out.println(search2 + " is not on the list.");
			
		Utils.pause();
		System.out.println();
	}
}

class List4 {
	private int intArray[];        // Stores array elements
	private int size;              // Number of elements in the array
	private int minInt;            // Smallest random integer
	private int maxInt;            // Largest random integer
	public static int index;       // The index the number was found in
	
	public List4(int s, int min, int max) {
		size = s;
		System.out.println("\nCONSTRUCTING LIST WITH VALUES IN [" + min + " " + max + "] range");
		// We need to construct the intArray[] array with a determined size.
		intArray = new int[size];
		Utils.startSeed(12345);
		// Start generating random numbers for each array index.
		for (int k = 0; k < size; k++)
			intArray[k] = Utils.seedRandom(min,max);
	}
	public void display() {
		System.out.println("\nDISPLAYING ARRAY ELEMENTS");
		for (int k = 0; k < size; k++)
			System.out.print(intArray[k] + " ");
		System.out.println();
	}
	/*
	 * A linear search is the simplest form of search out there: It searches until it finds what you're looking for. This is the
	 * efficient version, as it stops once the number you're looking for is found.
	 */
	public boolean linearSearch(int sn) {
		boolean found = false;
	    int k = 0;
	    while (k < size && !found) {
	    	if (intArray[k] == sn) {
	    		found = true;
	    		index = k;
	    	} else
	    		k++;
	    }
	    return found;
	}
	/*
	 * A binary search is a more complex search, but is much faster. In a binary search, we constantly split the size of the search
	 * area until we successfully find what we are looking for. That means we are searching through less indexes.
	 */
	public boolean binarySearch(int sn) {
		boolean found = false;
		Arrays.sort(intArray);             // We need to sort the array BEFORE we start searching.
		int small = 0;                     // Integer small must start at the beginning of the array.
		int large = size - 1;              // Integer large must start at the end. We subtract 1 to avoid "out of range" errors.
		int mid = (small + large) / 2;     // Integer mid must start at the middle of the array, which is determined here.
		while (!found) {
			/*
			 * If the number we find is the one we are searching for, boolean "found" becomes true, and integer "index" is assigned
			 * what was stored in integer "mid".
			 */
			if (intArray[mid] == sn) {
				found = true;
				index = mid;
			}
			/*
			 * If the number we are searching for is greater than what's in the middle array, we set integer small to
			 * a number greater than integer mid. Then integer mid is recalculated.
			 */
			if (intArray[mid] < sn) {
				small = mid + 1;
				mid = (small + large) / 2;
			}
			/*
			 * If the number we are searching for is less than what's in the middle array, we set integer large to a
			 * number less than integer mid. Then integer mid is recalculated.
			 */
			if (intArray[mid] > sn) {
				large = mid - 1;
				mid = (small + large) / 2;
			}
		}
		return found;
	}
	/*
	 * This is a second binary search that does not use a boolean. This is the same structure as the other binary
	 * search method.
	 */
	public int binarySearch2(int sn) {
		int small = 0;
		int large = size - 1;
		int mid = 0;
		Arrays.sort(intArray);
		while (small <= large) {
			mid = (small + large) / 2;
			if (sn == intArray[mid])
				return mid;
			if (sn < intArray[mid]) 
				large = mid - 1;
			if (sn > intArray[mid])
				small = mid + 1;
		}
		return mid;
	}
	public void displaySortedArray() { // We need to display the sorted array.
		Arrays.sort(intArray);
		System.out.println("\nDISPLAYING SORTED ARRAY ELEMENTS");
		for (int i = 0; i < size; i++)
			System.out.print(intArray[i] + " ");
		System.out.println();
	}

}
