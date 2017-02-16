package main;
/**
 * Lab 14: Palindromes and string manipulation
 * 
 * @author Albert Tang
 */
public class Lab14 {

	public static void main(String[] args) {
		boolean finished = false;
		/*
		 * In this loop, we will keep going until the user decides not to repeat the program.
		 */
		do {
			System.out.print("Enter a string ===> ");
			Palindrome p = new Palindrome(Utils.enterString());
			p.displayData();
			System.out.print("Do you wish to repeat the program [Y/N]? ===>> ");
			char repeat = Utils.enterChar();
			finished = (repeat != 'Y' && repeat != 'y');
			System.out.println();
		}
		// Once "finished" is true, the program is terminated.
		while (!finished);
	}

}

class Palindrome {
	
	private String str;
	
	public Palindrome(String s) { // The constructor.
		str = s;
	}
	public boolean isPal() { // Method to see if string is a palindrome
		// First, we need to start with an empty string.
		String temp = "";
		// Next, we will add characters from string str into String temp, starting from the end of str.
		for (int i = str.length() - 1; i >= 0; i--) 
			temp += str.charAt(i);
		/*
		 * We can't simply compare strings using the "==" condition. That causes this method to return false.
		 * Instead, we need to use the equals() method to compare the strings. Only then will the last part
		 * of the program work, and return true. It will only return false if the string is not a palindrome.
		 */
		if (temp.equals(str))
			return true;
		else
			return false;	
	}
	public boolean almostPal() { // Method to see if string is almost a palindrome
		// If the isPal() method returns true, this is not "almost" a palindrome.
		if (isPal() == true)
			return false;
		// If isPal() returns false, we need to run a few more methods.
		else {
			// We need to call the purge() method to eliminate spaces.
			purge();
			// If the isPal() method returns true, the string is "almost" a palindrome.
			if (isPal() == true)
				return true;
			// If the isPal() method returns false, then the string is not a palindrome.
			else
				return false;
		}
		
	}
	public String purge() { // Method to elimiate spaces from the string.
		// First, convert all letters to uppercase.
		str = str.toUpperCase();
		// We still need an empty string.
		String temp = "";
		// Now, we need to add each character to String temp from str.
		for (int i = 0; i < str.length(); i++) {
			/*
			 * The whitespaces will be removed because they don't mee the requirements. Also, && means "and" and
			 * || means "or". For this statement, if the characters are from A to Z, or 0 to 9, add it to String
			 * temp.
			 */
			if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >= '0' && str.charAt(i) <= '9'))
				temp += str.charAt(i);
		}
		// Once the "for" loop is done, String str is assigned with what was in String "temp".
		str = temp;
		// String "str" is returned so the isPal() method can use it.
		return str;
	}
	public void displayData() { // Display the data.
		System.out.println();
		System.out.println("String:            " + str);
		System.out.println("Palindrome:        " + isPal());
		System.out.println("Almost Palindrome: " + almostPal());
		System.out.println();
	}
	
}