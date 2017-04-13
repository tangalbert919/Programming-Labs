package main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Lab16Out {

	public static void main(String[] args) throws IOException {
		BufferedWriter file = new BufferedWriter(new FileWriter("lab16out.txt"));
		
		System.out.println();
		
		file.write("The quick brown fox jumps over the lazy dog.");
		
		file.close();
		
		System.out.println("lab16out.txt created.");

	}

}
