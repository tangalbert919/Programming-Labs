package main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Lab 16B: Input and Output with files
 * 
 * @author Albert Tang
 */
public class Lab16B {
	/*
	 * The "throw" keyword basically means to throw away data. "IOException" are input/output errors, and that's what
	 * we want to throw away during runtime. Otherwise, prepare for lots of errors.
	 */
	public static void main(String args[]) throws IOException {
		/*
		 * We are going to make an input stream, where we obtain and print data from the text file to our console. To do
		 * this, we need to use the Scanner class and define a new object. This object must be able to find the text
		 * file we define.
		 */
		Scanner file = new Scanner(new File("lab16b.txt"));
		
		// In the text file, the first line has a number. That's how many lines we have in the file.
		int size = file.nextInt();
		file.nextLine();  // buffer cleaning code
		
		for (int i = 0; i < size; i++) {
			int num = file.nextInt();
			
			//Instantiate an object
			OddOrEven obj = new OddOrEven(num);
			System.out.println(obj);
			System.out.println();
		}
		// Always close the file when we are done with it. Never leave it open.
		file.close();
		
		/*
		 * For our next file, we are going to create an output stream, where we will write data to a new file. We need to
		 * define a new object file by using the BufferedWriter class. This object needs to use the FileWriter class,
		 * which needs a file to write data to.
		 */
		BufferedWriter file2 = new BufferedWriter(new FileWriter("lab16out.txt"));
		
		System.out.println();
		
		// This is the data that will be written. newLine() tells the program to go to the next line.
		file2.write("The quick brown fox jumps over the lazy dog.");
		file2.newLine();
		file2.write("One does not simply 'teach kids swears'.");
		
		file2.close();
		System.out.println("lab16out.txt file created.");
	}
}
class OddOrEven {
	private int number;
	
	public OddOrEven() {  // Default constructor
		number = 0;
	}
	
	public OddOrEven(int num) {   // Parameter constructor
		number = num;
	}
	
	public void setNum(int num) {
		number = num;
	}
	public boolean isOdd() {
		if (number % 2 == 1) 
			return true;
		else
			return false;
	}
	public String toString() {
		if (isOdd())
			return number + " is odd";
		else
			return number + " is even";
	}
	
}