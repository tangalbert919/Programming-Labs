package main;

import java.util.Scanner;

public class Utils {
	
	public static String enterString() {
		Scanner input = new Scanner(System.in);
		String temp = input.nextLine();
		return temp;
	}
	public static char enterChar() {
		Scanner input = new Scanner(System.in);
		String temp = input.nextLine();
		char temp2 = temp.charAt(0);
		return temp2;
	}
}
