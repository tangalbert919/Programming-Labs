package main;

import java.util.Scanner;

/*
 * These methods have been pulled from the Expo class to minimize the size of this lab.
 */
public class Utils {
	
	static double seed;
	/**
     *  Provides the initial value of the "seeded" random integers.
     **/			
	public static void startSeed(double s)	
	{	
		seed = s;
	}
	/**
     *  Returns a "seeded" random integer in the [min..max] range, inclusive.
     *	The seed parameters insures that each new execution of the random set
     *	will generate the same sequence of "random" integers.
     *	Method startSeed must be called first before method seedRandom. 
     **/			
	public static int seedRandom(int min, int max)  
	{	
		double tempDbl = seed + Math.PI;
		tempDbl = tempDbl * tempDbl;
		long tempInt = (long ) Math.floor(tempDbl);
		seed = tempDbl - tempInt;
		long range = max - min + 1;
		int number = (int) (range * seed + min);
		return number;
	}
	public static int enterInt() {
		Scanner input = new Scanner(System.in);
		int temp = input.nextInt();
		return temp;
	}
}
