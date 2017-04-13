package main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Lab 16D: How many bags of dog food does a dog need?
 * 
 * @author Albert Tang
 */
public class Lab16D {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(new File("data.txt"));
		BufferedWriter output = new BufferedWriter(new FileWriter("output.txt"));
		
		int lines = input.nextInt(); // How many lines there are in the text file?
		input.nextLine(); // Buffer cleaning code
		
		
		for (int i = 0; i < lines; i++) {
			String line = input.nextLine();
			DogFood test = new DogFood(line);
			System.out.println(line);
			int j = test.calculateCups();
			System.out.println("Bags needed: " + j + " 10-pound bags.");
			output.write("Bags needed: " + j + " 10-pound bags.");
			output.newLine();
		}
		System.out.println("You need " + DogFood.total + " 10-pound bags total.");
		output.write("You need " + DogFood.total + " 10-pound bags total.");
		input.close();
		output.close();
		System.out.println("output.txt file created.");
	}

}

class DogFood {
	private static String line;
	private double cups;
	public static int total;
	public DogFood() {
		line = "";
	}
	
	public DogFood(String string) {
		line = string;
	}
	
	public int calculateCups() {
		cups = 0;
		int bags = 0;
		Scanner input = new Scanner(line);
		while (input.hasNext()) {
			int pound = input.nextInt();
			if (pound <= 4)
				cups = cups + 3.5;
			else if (pound <= 7)
				cups = cups + 7;
			else if (pound <= 9)
				cups = cups + 10.5;
			else if (pound <= 19)
				cups = cups + 14;
			else if (pound <= 39)
				cups = cups + 24.5;
			else if (pound <= 59)
				cups = cups + 31.5;
			else if (pound <= 79)
				cups = cups + 42;
			else if (pound >= 80)
				cups = cups + 52.5;
		}
		input.close();
		bags = (int) Math.ceil(cups/60);
		total = total + bags;
		return bags;
	}
	
}