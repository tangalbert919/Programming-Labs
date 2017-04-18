package main;

import java.util.Scanner;

public class Utils {
	static double seed = 12345;					// default starting value of the random seed	
	/**
	 * Pauses the output and waits for the user to press the [enter] key.
	 **/
	public static void pause()
	{
		skip(2);
		System.out.print("Press the <enter> key to continue...");
		String dummy = enterString();
		skip(3);		
	}
	public static void skip(int i) {
		for (int k = 0; k < i; k++)
			System.out.println();
	}
	public static String enterString() {
		Scanner input = new Scanner(System.in);
		String temp = input.nextLine();
		return temp;
	}
	public static int enterInt() {
		Scanner input = new Scanner(System.in);
		int temp = input.nextInt();
		return temp;
	}
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
}
