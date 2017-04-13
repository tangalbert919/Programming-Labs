package main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Lab 16C: Get the largest number!
 * 
 * @author Albert Tang
 */
public class Lab16C {
	
	public static void main(String args[]) throws IOException {
		/*
		 * If you already looked at Lab 16 and Labs 16A and 16B, you should already know what this is.
		 */
		Scanner input = new Scanner(new File("Numbers.txt"));
		BufferedWriter output = new BufferedWriter(new FileWriter("Output.txt"));
		
		int lines = input.nextInt();
		input.nextLine(); // Proceed to the next line.
		for (int i = 0; i < lines; i++) {
			String line = input.nextLine();
			LargestNum test = new LargestNum(line);
			System.out.println(line + " largest is: " + test.getLargest());
			output.write(line + " largest is: " + test.getLargest());
			output.newLine();
		}
		input.close();
		output.close();
	}
}

class LargestNum {
	private static String line;
	public LargestNum() { // Default Constructor
		line = "";
	}
	public LargestNum(String string) { // Parameter Constructor
		line = string;
	}
	public int getLargest() {
		// Assign int largest with a REALLY low number (which is a negative number).
		int largest = Integer.MIN_VALUE;
		Scanner chop = new Scanner(line);
		while (chop.hasNext()) {
			int num = chop.nextInt();
			if (num > largest)
				largest = num;
		}
		chop.close();
		return largest;
	}
}