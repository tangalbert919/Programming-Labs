package main;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Lab 16A: Encryption
 * 
 * @author Albert Tang
 */
public class Lab16A {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("dvorak.txt"));
		
		/*
		 * This is a very simple form of encryption. We have a normal QWERTY keyboard, and then we have a Dvorak
		 * keyboard. All of the characters are in these strings (from left to right, then next row).
		 */
		String qwerty = "qwertyuiopasdfghjkl;zxcvbnm,./ ";
		String dvorak = "',.pyfgcrlaoeuidtns-;qkjxbmwvz ";
		
		int times = 0;
		int count = Integer.parseInt(in.nextLine().trim()); // Read in how many lines there are.
		while (times < count) {
			times++;
			String t = in.nextLine().trim(); // Read in a line from the input file.
			for (int i = 0; i < t.length(); i++) {
				/*
				 *  Here, we find the position of the character read in the line in the dvorak String. Then we find a character
				 *  in the same position in the qwerty string, and add that to string index.
				 */
				int index = dvorak.indexOf(t.charAt(i));
				System.out.print(qwerty.charAt(index));
			}
			System.out.println();
		}
		in.close();
	}

}
