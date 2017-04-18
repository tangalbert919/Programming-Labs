package main;

// THE EXPO CLASS FOR COMPUTER SCIENCE CLASSES

// NOTE: HTML <br> (breaks) are used in the documentation so it will look better in Javadoc.


import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.applet.Applet;

/**
 *
 * EXPO CLASS VERSION 07/16/2008<br>
 * <br>
 * The concept and implementation of the original set of Expo class methods was<br> 
 * created by John L. M. Schram (the Son), who is called John Schram.
 * <br>
 * The Expo class was created to teach programming skills to students in introductory<br>
 * computer science courses.  Use of the Expo class eliminates many program steps that<br>
 * are tedious and frustrating for beginning students.  Program input is simplified and<br>
 * graphics commands are more intuitive.  Many additional graphics commands are added to<br>
 * allow for interesting displays with minimal effort.<br>
 * <br>
 * Since the creation of the initial bulk of the Expo class, John L. A. Schram (the father),<br>
 * who is called Leon Schram, has added some additional methods.<br>
 * Both John Schram and Leon Schram are computer science teachers at John Paul II High School<br>
 * in Plano, Texas.<br>
 * <br>
 * The Expo class is a work in progress and you can expect the Schrams to add additional<br>
 * methods in time to come.  The version date will indicate if you have the latest update.<br>
 * <br><br> 
 * 25 constant colors are built into the Expo class and are listed below.<br>
 * red, green, blue, orange, cyan, magenta, yellow, gray, lightGray, darkGray,<br>
 * pink, black, white, brown, purple, violet, lightRed, darkRed, lightGreen,<br>
 * darkGreen, lightBlue, darkBlue, gold, tan, and turquoise. <br>
 * <br><br>
 * This code is free software; you can redistribute it and/or modify<br>
 * it under the terms of the GNU General Public License as published by<br>
 * the Free Software Foundation.<br>
 * <br>
 * This code is distributed in the hope that it will be useful,<br>
 * but WITHOUT ANY WARRANTY; without even the implied warranty of<br>
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the<br>
 * GNU General Public License for more details.<br><br>
 * 
 * @author John Schram
 * @author Leon Schram
 *
 **/
 
public class Expo 
{
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Color constants
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// built in colors copied to the Expo class
	static final Color red        = Color.red;
	static final Color green      = Color.green;
	static final Color blue       = Color.blue;
	static final Color orange     = Color.orange;
	static final Color cyan       = Color.cyan;
	static final Color magenta    = Color.magenta;
	static final Color yellow     = Color.yellow;
	static final Color gray       = Color.gray;
	static final Color lightGray  =	Color.lightGray;
	static final Color darkGray   = Color.darkGray;
	static final Color pink       = Color.pink;
	static final Color black      = Color.black;
	static final Color white      = Color.white; 
	
	// allows for alternative spelling of "grey"	
	static final Color grey       = Color.gray;		
	static final Color lightGrey  =	Color.lightGray;
	static final Color darkGrey   = Color.darkGray;
		
	// extra colors
	static final Color brown      = new Color(150,100,15);
	static final Color purple     = new Color(128,0,255);
	static final Color violet     = new Color(128,0,128);
	static final Color lightRed   = new Color(255,128,128);
	static final Color darkRed    = new Color(128,0,0);		
	static final Color lightGreen = new Color(128,255,128);
	static final Color darkGreen  = new Color(0,128,0);
	static final Color lightBlue  = new Color(128,128,255);
	static final Color darkBlue   = new Color(0,0,128);	
	static final Color gold       = new Color(255,205,0);
	static final Color tan        = new Color(255,255,128);
	static final Color turquoise  = new Color(0,255,128);
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
			
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Math Constants, Math Functions and Random Number Generating Methods
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	static final double PI = Math.PI;			// technically not necessary, but included for students used to the Expo class
	static final double twoPI  = 2 * Math.PI;
	static final double halfPI = Math.PI / 2;
	static double seed = 12345;					// default starting value of the random seed		
		
		
	/**
     * Returns the "square" number, which is the number multiplied times itself.<br><br>
     * Example:<br>
     * System.out.println(Expo.square(5)); <br>
     * This will display 25.0
     **/
	public static double square(double number)
	{
		return number * number;
	}
	
		
	/**
     * Returns the "cube" of number, which is number raised to the 3rd power.<br><br>
     * Example:<br>
     * System.out.println(Expo.cube(2)); <br>
     * This will display 8.0
     **/		
	public static double cube(double number)
	{
		return number * number * number;
	}
	
				
	/**
     * Returns the cubeRoot (3rd root) of number. <br><br>
     * Example:<br>
     * System.out.println(Expo.cubeRoot(8)); <br>
     * This will display 2.0
     **/			
	public static double cubeRoot(double number)
	{
		return Math.exp(Math.log(number) / 3);
	}
	
		
	/**
     * Returns the xth root of number. <br><br>
     * Example:<br>
     * System.out.println(Expo.root(1000,3)); <br>
     * This will display the 3rd root of 1000, which is 10.0 <br><br>
     * Preconditions: number > 0, root != 0
     **/	
	public static double root(double number, double x)
	{
		return Math.exp(Math.log(number) / x);
	}
	
				
	/**
     *  Returns a "true" random integer in the [min..max] range, inclusive.
     **/			
	public static int random(int min, int max)
	{	
		int range = max - min + 1;
		int number = (int) (range * Math.random() + min);
		return number;
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
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////

	
		
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Coordinate Geometry constants and methods displayed on a Cartesian grid
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		
	static int height, width, midX, midY, spacing;
	
	/**
     * Draws a Cartesian grid with X-axis and Y-axis. <br>
     * The graph will be the size specified by w(width) and h(height). <br> 
     * The final parameter (s) indicates the spacing and effectively scales the graph.
     **/			
	public static void drawGrid(Graphics g, int w, int h, int s)
	{
		width = w;
		height = h;
		midX = width / 2;
		midY = height / 2;
		spacing = s;
		 	
		// draws the actual grid lines
		g.setColor(black);
		for (int y = midY; y >= 0; y -= spacing)       // start at middle and go up
			g.drawLine(0,y,width,y);
		for (int y = midY; y <= height; y += spacing)  // start at middle and go down
			g.drawLine(0,y,width,y);
		for (int x = midX; x >= 0; x -= spacing)       // start at middle and go left
			g.drawLine(x,0,x,height);
		for (int x = midX; x <= width; x += spacing)   // start at middle and go right
			g.drawLine(x,0,x,height);			
				
		
		// draws the x-axis and the y-axis	
		g.setColor(Color.magenta);
		g.fillRect(midX-2,0,5,height);
		g.fillRect(0,midY-2,width,5);
		
		g.setColor(blue);
		// displays the positive numbers on the x-axis
		g.setFont(new Font("Arial",Font.BOLD,spacing + 5));
		
		int step = 5 * spacing;
		int number = 5;
		for (int k = midX+step-spacing/2; k < width; k += step)
		{
			String numberStr = String.valueOf(number);
			g.drawString(numberStr,k,midY-spacing);
			number += 5;
		}
		
		// displays the negative numbers on the y-axis
		number = -5;
		for (int k = midX - step-spacing; k > 0; k -= step)
		{
			String numberStr = String.valueOf(number);
			g.drawString(numberStr,k,midY-spacing);
			number -= 5;
		}
		
		// displays the positive numbers on the y-axis
		number = 5;
		for (int k = midY-step+spacing/2; k > 0; k -= step)
		{
			String numberStr = String.valueOf(number);
			g.drawString(numberStr,midX+2*spacing,k);
			number += 5;
		}
		
		// displays the negative numbers on the y-axis
		number = -5;
		for (int k = midY+step+spacing/2; k < height; k += step)
		{
			String numberStr = String.valueOf(number);
			g.drawString(numberStr,midX+2*spacing,k);
			number -= 5;
		}
	}
	
	
	/**
     * Plots a point on the Cartesian grid. <br>
     * Precondition: The drawGrid method must be called first. 
     **/
	public static void graphPoint(Graphics g, double mathX, double mathY)
	{
		
		int cartesianX,cartesianY;
		g.setColor(darkGreen);
		cartesianX = (int)(midX + (mathX * spacing));
		cartesianY = (int)(midY - (mathY * spacing));	
		fillCircle(g,cartesianX,cartesianY,spacing / 2 + 1);
	}
	
	
	/**
     * Draws a line across the Cartesian grid. <br>
     * The line will go through the 2 points specified in the parameters. <br>
     * Precondition: The drawGrid method must be called first. 
     **/	
	public static void graphLine(Graphics g, double mathX1, double mathY1, double mathX2, double mathY2)
	{
		int cartesianX1,cartesianY1,cartesianX2,cartesianY2;
		double deltaX = mathX2 - mathX1;
		double deltaY = mathY2 - mathY1;
		double tempX = mathX1;
		double tempY = mathY1;
		
		mathX1 = tempX + 100 * deltaX;
		mathX2 = tempX - 100 * deltaX;
		mathY1 = tempY + 100 * deltaY;
		mathY2 = tempY - 100 * deltaY;
		
		g.setColor(red);
		cartesianX1 = (int)(midX + (mathX1 * spacing));
		cartesianY1 = (int)(midY - (mathY1 * spacing));
		cartesianX2 = (int)(midX + (mathX2 * spacing));
		cartesianY2 = (int)(midY - (mathY2 * spacing));	
			
		if (spacing / 3 >= 3)
			drawThickLine(g,cartesianX1,cartesianY1,cartesianX2,cartesianY2,spacing / 3);				
		else
			drawLine(g,cartesianX1,cartesianY1,cartesianX2,cartesianY2);		
	}
	
	
	/**
     * Draws a parabala on the Cartesian grid. <br>
     * The parabola will represent the equation: <br>
     * y = ax^2 + bx + c <br>
     * a, b, & c correspond to the parameters of the same name. <br>
     * Precondition: The drawGrid method must be called first. 
     **/
	public static void graphQuadratic(Graphics g, double a, double b, double c)
	{
		int cartesianX,cartesianY;
		double mathX,mathY;
		g.setColor(red);
		
		for (mathX = -100; mathX <= 100; mathX += 0.001)
		{
			mathY = a * mathX * mathX + b * mathX + c;
		    cartesianX = (int) Math.round(midX + (mathX * spacing));
		    cartesianY = (int) Math.round(midY - (mathY * spacing));	
		    	
		    if (spacing / 3 >= 3)
		    	drawPoint(g,cartesianX,cartesianY);
		    else
		    	drawPixel(g,cartesianX,cartesianY);	
		}    
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	
				
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////		
	// String Utility Methods  
	// These next few methods manages the positioning and display of output text.
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////

	/**
	 * Utility method that will skip a certain number of blank lines on a text output screen. <br>
	 * This is used to space out text output.
	 **/
	public static void skip(int n)
	{
		for (int k = 1; k <= n; k++)
			System.out.println();
	}
	
	
	/**
	 * Displays centered text on an 80 column text screen.
	 **/
	public static void center(String str)
	{
		int len = str.length();
		int tab = (80 - len) / 2;
		for (int k = 1; k <= tab; k++)
		   System.out.print(" ");
		System.out.println(str);		  
	} 


	/**
	 * Displays right-justified text on an 80 column text screen.
	 **/
	public static void rightJustify(String str)
	{
		int len = str.length();
		int tab = 80 - len;
		for (int k = 1; k <= tab; k++)
		   System.out.print(" ");
		System.out.println(str);		  
	} 
	
	
	/**
	 * Returns a certain number of spaces. <br>
	 * Useful when lining up output.
	 **/	
	public static String spaces(int n)
	{
		String temp = "";
		for (int k = 1; k <= n; k++)
		   temp += " ";
		return temp;
	}	
	
	
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
	
		
	/**
	 * Pauses the output for a specified number of milliseconds (1/1000ths of a second). <br><br>
	 * Examples:<br>
	 * Expo.delay(1000); // pause for 1 second <br>
	 * Expo.delay(2000); // pause for 2 seconds <br>
	 * Expo.delay(500);  // pause for 1/2 of a second <br>
	 * Expo.delay(100);  // pause for 1/10 of a second <br>
	 * Expo.delay(10);   // pause for 1/100 of a second <br>
	 * Expo.delay(1);    // pause for 1/1000 of a second <br>
	 **/		
	public static void delay(int n)
	{
		long startDelay = System.currentTimeMillis();
		long endDelay = 0;
		while (endDelay - startDelay < n)
			endDelay = System.currentTimeMillis();	
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
		
		
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Methods for keyboard text input during program execution.
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	/**
     *  Allows input of an int (integer) from the keyboard in a text window.
     **/	
	public static int enterInt()
	{
		Scanner input = new Scanner(System.in);
		int temp = input.nextInt();
		return temp;
	}	
	
	
	/**
     * Allows input of a double (real number) from the keyboard in a text window.
     **/
	public static double enterDouble()
	{
		Scanner input = new Scanner(System.in);
		double temp = input.nextDouble();
		return temp;
	}
	
	
	/**
     * Allows input of a String from the keyboard in a text window.
     **/
	public static String enterString()
	{
		Scanner input = new Scanner(System.in);
		String temp = input.nextLine();
		return temp;
	}	
	
	
	/**
     * Allows input of a char from the keyboard in a text window.
     **/
	public static char enterChar()
	{
		Scanner input = new Scanner(System.in);
		String temp = input.nextLine();
		return temp.charAt(0);
	}
	
		
    /**
     * Allows input of a boolean (true or false) from the keyboard in a text window. <br>
     * The user can enter the word "true" or "false". <br>
     * The method is not case sensitive.  (True, trUE, TruE will all work) <br>
     * The user can also enter T or F. <br>
     * The user can also enter 1 for true and 0 for false. <br>
     * Essentially, anything that does not begin with a 'T', 't' or '1' will be interpreted as "false". <br>
     **/		
	public static boolean enterBoolean()
	{
		Scanner input = new Scanner(System.in);
		String temp = input.nextLine();
		temp = temp.toUpperCase();
		char firstChar = temp.charAt(0);
		String temp2 = String.valueOf(firstChar);
		return( temp2.equals("T") || temp2.equals("1") );
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
					
	
		
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//  Methods for keyboard graphics input during program execution using small graphics windows.
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////

	/**
     * Allows GUI input of an int (integer) from the keyboard. <br><br>
     * Example: <br>
     * int age = Expo.enterIntGUI("How old are you?");
     **/	
    public static int enterIntGUI(String prompt)
	{
		String tempString = JOptionPane.showInputDialog(prompt);
		int temp = Integer.parseInt(tempString);
		return temp;
	}	
	
	
	/**
     * Allows input of a double (real number) from the keyboard using a GUI window. <br>
     * The String parameter "prompt" is a message that tells the user what he/she is suppose to enter. <br><br>
     * Example: <br>
     * double gpa = Expo.enterDoubleGUI("What is your gpa?");
     **/	
    public static double enterDoubleGUI(String prompt)
	{
		String tempString = JOptionPane.showInputDialog(prompt);
		double temp = Double.parseDouble(tempString);
		return temp;
	}
	
	
	/**
     * Allows input of a String from the keyboard using a GUI window. <br>
     * The String parameter "prompt" is a message that tells the user what he/she is suppose to enter. <br><br>
     * Example: <br>
     * String name = Expo.enterStringGUI("What is your name?");
     **/	
    public static String enterStringGUI(String prompt)
	{
		String temp = JOptionPane.showInputDialog(prompt);
		return temp;
	}	
	
	
	/**
     * Allows input of a char from the keyboard using a GUI window. <br>
     * The String parameter "prompt" is a message that tells the user what he/she is suppose to enter. <br><br>
     * Example: <br>
     * char mi = Expo.enterCharGUI("What is youe middle initial?");
     **/
    public static char enterCharGUI(String prompt)
	{
		String temp = JOptionPane.showInputDialog(prompt);
		return temp.charAt(0);
	}


	/**
     * Allows input of a boolean (true or false) from the keyboard using a GUI window. <br>
     * The user can enter the word "true" or "false". <br>
     * The method is not case sensitive.  (True, trUE, TruE will all work) <br>
     * The user can also enter T or F. <br>
     * The user can also enter 1 for true and 0 for false. <br>
     * Essentially, anything that does not begin with a 'T', 't' or '1' will be interpreted as "false". <br>	
     * The String parameter "prompt" is a message that tells the user what he/she is suppose to enter. <br><br>
     * Example: <br>
     * boolean voter = Expo.enterBooleanGUI("You are registered to vote.  (Enter True or False)");
     **/	
    public static boolean enterBooleanGUI(String prompt)
	{
		String temp = JOptionPane.showInputDialog(prompt);
		temp = temp.toUpperCase();
		char firstChar = temp.charAt(0);
		String temp2 = String.valueOf(firstChar);
		return( temp2.equals("T") || temp2.equals("1") );
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
				
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// displayGUI methods
	// The first displayGUI methods will display a String in a GUI window.
	// The other 4 overloaded methods will first convert a specific simple/primative data type to a String,
	// and then display the String in the GUI window.
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	/**
     * Displays a String in a GUI window; <br>  
     * The window will stay on the screen until the user clicks "OK".
     **/
	public static void displayGUI(String text)
	{
		JOptionPane.showMessageDialog(null,text);
	}		
	
		
	/**
     * Displays an int (integer) in a GUI window; <br> 
     * The window will stay on the screen until the user clicks "OK".
     **/
	public static void displayGUI(int temp)
	{
		String text = String.valueOf(temp);
		JOptionPane.showMessageDialog(null,text);
	}	
	
		
	/**
     * Displays a double (real number) in a GUI window; <br> 
     * The window will stay on the screen until the user clicks "OK".
     **/
	public static void displayGUI(double temp)
	{
		String text = String.valueOf(temp);
		JOptionPane.showMessageDialog(null,text);
	}	
	
								
	/**
     * Displays a char in a GUI window; <br>
     * The window will stay on the screen until the user clicks "OK".
     **/
	public static void displayGUI(char temp)
	{
		String text = String.valueOf(temp);
		JOptionPane.showMessageDialog(null,text);
	}				
	
			
	/**
     * Displays a boolean (true or false) value in a GUI window; <br> 
     * The window will stay on the screen until the user clicks "OK".
     **/
	public static void displayGUI(boolean temp)
	{
		String text = String.valueOf(temp);
		JOptionPane.showMessageDialog(null,text);
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////


							
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Graphics methods to manipulate color.
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
    /**
     * Allows the user to change the color, using a Color object.
     **/
	public static void setColor(Graphics g, Color bgColor)
	{	
		g.setColor(bgColor);		
	}	
	
	
	/**
	 * Allows the user to change to one of 15 predefined colors using a single integer. <br>
	 * This is especially useful in programs where you want to change from one color to a contrasting color quickly.<br>
	 *  0 = black <br>
	 *  1 = red <br>
	 *  2 = green <br>
	 *  3 = blue <br>
	 *  4 = orange <br>
	 *  5 = cyan <br>
	 *  6 = magenta <br>
	 *  7 = yellow <br>
	 *  8 = gray <br>
	 *  9 = pink <br>
	 * 10 = purple <br>
	 * 11 = brown <br>
	 * 12 = violet <br>
	 * 13 = gold <br>
	 * 14 = turquoise <br>
	 * Any negative number will give you white.
	 **/
	 
	public static void setColor(Graphics g, int colorNum)
	{	
		colorNum %= 15;
		switch(colorNum)
		{
			case  0 : g.setColor(black); break;
			case  1 : g.setColor(red); break;
			case  2 : g.setColor(green); break;
			case  3 : g.setColor(blue); break;
			case  4 : g.setColor(orange); break;
			case  5 : g.setColor(cyan); break;
			case  6 : g.setColor(magenta); break;
			case  7 : g.setColor(yellow); break;
			case  8 : g.setColor(gray); break;
			case  9 : g.setColor(pink); break;
			case 10 : g.setColor(purple); break;
			case 11 : g.setColor(brown); break;
			case 12 : g.setColor(violet); break;
			case 13 : g.setColor(gold); break;
			case 14 : g.setColor(turquoise); break;			
			default : g.setColor(white); 			
		};		
	}
	
	
	/**
	 * Allows the user to change the color, using 3 int values representing the amount of red, green and blue. <br>
	 * Precondition: All 3 color values need to be between 0 and 255 inclusive.
	 **/
	public static void setColor(Graphics g, int red, int green, int blue)
	{	
		g.setColor(new Color(red, green, blue));		
	}
	
	
	/**
	 * Returns a random Color object which can be any of the 16,000,000+ possible colors.
	 **/
	public static Color getRandomColor()
	{
		int red   = random(0,255);
		int green = random(0,255);
		int blue  = random(0,255); 
		Color randomColor = new Color(red, green, blue);	
		return randomColor;	
	}
	
	
	/**
	 * Sets the current color to a random color value which can be any of the 16,000,000+ possible colors.
	 **/
	public static void setRandomColor(Graphics g)
	{
		int red   = random(0,255);
		int green = random(0,255);
		int blue  = random(0,255); 
		Color randomColor = new Color(red, green, blue);	
		g.setColor(randomColor);	
	}		
	
	
	/**
	 * Sets the entire background to a single color. <br>
	 * Precondition: The applet window cannot be greater than 4800 X 3600 in size.
	 **/
	public static void setBackground(Graphics g, Color bgColor)
	{	
		g.setColor(bgColor);
		g.fillRect(0,0,4800,3600);		
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
							
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Graphics methods which draw a large variety of "open" figures.
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	/**
	 * Draws a single pixel at the specified x,y location.
	 **/
	public static void drawPixel(Graphics g, int x, int y)
	{
		g.drawLine(x,y,x,y);
	}
	
	
	/**
	 * Draws a 3 pixel X 3 pixel "point" whose center is at the specified x,y location.
	 **/	
	public static void drawPoint(Graphics g, int x, int y)
	{
		g.fillRect(x-1,y-1,3,3);
	}
	
	
	/**
	 * Draws the line segment connecting coordinates x1,y2 and x2,y2.
	 **/
	public static void drawLine(Graphics g, int x1, int y1, int x2, int y2)
	{
		g.drawLine(x1,y1,x2,y2);
	}	
	
		
	/**
	 * Draws an open circle. <br>
	 * The user specifies the x,y coordinate of the center of the circle as well as the radius value.
	 **/
	public static void drawCircle(Graphics g, int centerX, int centerY, int radius)
	{
		int diameter = 2 * radius;
		g.drawOval(centerX-radius, centerY-radius, diameter, diameter);
	}
	
		
	/**
	 * Draws an open oval. <br>
	 * The user specifies the x,y coordinate of the center of the oval as well as the horizontal and vertical radii values.
	 **/
	public static void drawOval(Graphics g, int centerX, int centerY, int hRadius, int vRadius)
	{
		int hDiameter = 2 * hRadius;
		int vDiameter = 2 * vRadius;
		g.drawOval(centerX-hRadius, centerY-vRadius, hDiameter, vDiameter);
	}
	
		
	/**
	 * Draws and arc which looks like a curve. <br>
	 * An ARC is a "piece" of an OVAL. <br>
	 * The first 5 parameters (g and 4 ints) are the same as drawOval. <br>
	 * There are 2 additional parameters for the starting degree value and finishing degree of the arc. <br>
	 * 0 degrees is at the 12:00 position and the degrees progress in a CLOCKWISE fashion. <br>
	 * (90 degrees is at 3:00, 180 degrees is at 6:00, 270 degrees is at 9:00, 360 degrees is back at 12:00).
	 **/
	public static void drawArc(Graphics g, int centerX, int centerY, int xRadius, int yRadius, int start, int finish)
	{
		int xDiameter = 2 * xRadius;
		int yDiameter = 2 * yRadius;
		
		if (finish < start)
			finish += 360;
		int newStart  = 90 - start;   // shifts starting position from 3:00 to 12:00
		int newFinish = start-finish; // as opposed to finish-start.  Subtracting backwards changes from counter-clockwise to clockwise.
		
		g.drawArc(centerX-xRadius, centerY-yRadius, xDiameter, yDiameter, newStart, newFinish);
	}
	
		
	/**
	 *	Draws an open irregular triangle using the three sets of provided coordinates.<br>
	 **/
	public static void drawTriangle(Graphics g,int x1,int y1,int x2,int y2,int x3,int y3) ////// Added 06-25-08
	{
	 	Polygon triangle = new Polygon();
	 	triangle.addPoint(x1,y1);
	 	triangle.addPoint(x2,y2);
	 	triangle.addPoint(x3,y3);
	 	g.drawPolygon(triangle);
	 }
	 
	 	 
	 /**
	  *	Draws an open irregular quadrilateral using the four sets of provided coordinates.<br>
	  **/
	 public static void drawQuad(Graphics g,int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4) ////// Added 06-25-08
	 {
	 	Polygon quad = new Polygon();
	 	quad.addPoint(x1,y1);
	 	quad.addPoint(x2,y2);
	 	quad.addPoint(x3,y3);
	 	quad.addPoint(x4,y4);
	 	g.drawPolygon(quad);
	 }
 
 
	/**
	 * Draws an open rectangle. <br>
	 * The upper-left-hand corner is specified by x1,y1 and the lower-right-hand corner is specified by x2, y2. 
	 **/
	public static void drawRectangle(Graphics g, int x1, int y1, int x2, int y2)
	{
		int temp;
		if (x1 > x2) 
			{ temp = x1; x1 = x2; x2 = temp; }
		if (y1 > y2) 
			{ temp = y1; y1 = y2; y2 = temp; }
		int width  = x2 - x1;
		int height = y2 - y1;
		g.drawRect(x1,y1,width,height);
	}
	
		
	/**
	 * Draws an open rectangle with rounded corners. <br>
	 * The first 5 parameters (g and 4 ints) are the same as drawRect. <br>
	 * The final parameter "radius" specifies the pixels used in the rounded corner.
	 **/	
	public static void drawRoundedRectangle(Graphics g, int x1, int y1, int x2, int y2, int radius)
	{
		int temp;
		if (x1 > x2) { temp = x1; x1 = x2; x2 = temp; }
		if (y1 > y2) { temp = y1; y1 = y2; y2 = temp; }
		int width  = x2 - x1;
		int height = y2 - y1;
		int diameter = radius * 2;
		g.drawRoundRect(x1,y1,width,height,diameter,diameter);
	}
	
			
	/**
	 * Draws a spiral. <br>
	 * The center of the spiral is specified with the centerX,centerY parameters. <br>
	 * The radius parameter determines the size of the spiral. <br>
	 * It is actually the radius of the circle that the spiral would fit inside.			
	 **/
	public static void drawSpiral(Graphics g, int centerX, int centerY, int radius)
	{
		double spiralRadius = 0;
		double radian = 0;
		while (spiralRadius <= radius)
		{
			int x = (int) Math.round(Math.cos(radian) * spiralRadius) + centerX;
			int y = (int) Math.round(Math.sin(radian) * spiralRadius) + centerY;
			drawPixel(g,x,y);
			radian += 0.001;
			spiralRadius += 0.002;
		}
	}
	
			
	/**
	 * Draws a certain number of lines (numLines) in a burst like pattern. <br>
	 * The lines are evenly spaced and drawn from the center of a circle to its edge. <br>
	 * The size of the circle is specified by the radius parameter.
	 **/		
	public static void drawBurst(Graphics g, int centerX, int centerY, int radius, int numLines)
	{
		for (double radian = 0; radian < twoPI; radian += twoPI/numLines)
		{
			int x = (int) Math.round(Math.cos(radian) * radius) + centerX;
			int y = (int) Math.round(Math.sin(radian) * radius) + centerY;
			g.drawLine(centerX, centerY, x, y);
		}
	}	
	
				
	/**
	 * Draws a certain number of random lines in a burst like pattern. <br>
	 * The lines have random colors, random lengths and are drawn in random directions. <br>
	 * The parameters are the same as drawBurst. <br>
	 * Post Condition: The current graphics color will be changed to whatever was the color of the last line drawn.
	 **/				
	public static void drawRandomBurst(Graphics g, int centerX, int centerY, int radius, int numLines)
	{
		for (int j = 1; j <= numLines; j++)
		{
			double radian = twoPI * Math.random();
			double randomRadius = radius * Math.random();
			int x = (int) Math.round(Math.cos(radian) * randomRadius) + centerX;
			int y = (int) Math.round(Math.sin(radian) * randomRadius) + centerY;
			setRandomColor(g);
			g.drawLine(centerX, centerY, x, y);
		}
	}	
	
							
	/**
	 * Draws a regular polygon with a specified number of sides. <br>
	 * The center of this polygon is specified by centerX,centerY and its size is specified by radius. <br>
	 * (As in the radius of the circle the regular polygon would fit inside) <br>
	 * Precondition: sides >= 3
	 **/
	public static void drawRegularPolygon(Graphics g, int centerX, int centerY, int radius, int sides)
	{
		int xCoord[] = new int[sides];
		int yCoord[] = new int[sides];
	 
	 	double rotate;
	    if (sides % 2 == 1)
	    	rotate = halfPI;
	    else
	    	rotate = halfPI + Math.PI/sides;
	    			
		for (int k = 0; k < sides; k++)
		{
			xCoord[k] = (int) Math.round(Math.cos(twoPI * k/sides - rotate) * radius) + centerX;
			yCoord[k] = (int) Math.round(Math.sin(twoPI * k/sides - rotate) * radius) + centerY;
		}
		g.drawPolygon(xCoord,yCoord,sides);
	}
	
		
	/**
	 * Draws a star with a specified number of points. <br>
	 * The center of this star is specified by centerX,centerY and its size is specified by radius. <br>
	 * (As in the radius of the circle the star would fit inside) <br>
	 * Precondition: points >= 2
	 **/
	public static void drawStar(Graphics g, int centerX, int centerY, int radius, int points)
	{
		int halfRadius = getHalfRadius(radius, points);
		points *= 2;		
			
		int xCoord[] = new int[points];
		int yCoord[] = new int[points];
		
		int currentRadius;
				
		for (int k = 0; k < points; k++)
		{
			if (k % 2 == 0)
				currentRadius = radius;
			else
				currentRadius = halfRadius;
					
			xCoord[k] = (int) Math.round(Math.cos(twoPI * k/points - halfPI) * currentRadius) + centerX;
			yCoord[k] = (int) Math.round(Math.sin(twoPI * k/points - halfPI) * currentRadius) + centerY;
		}
		g.drawPolygon(xCoord,yCoord,points);
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
							
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Graphics methods which draw a large variety of "open" figures with "thick" borders.
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////	


	/**
	 * Draws a "thick" line segment connecting coordinates x1,y2 and x2,y2. <br>  
	 * The thickness is specified in the last parameter.
	 **/	
	public static void drawThickLine(Graphics g, int x1, int y1, int x2, int y2, int thickness)
	{
		if (thickness < 2)
			thickness = 2;
			
		int start = -thickness / 2;
		int finish;
		if (thickness % 2 == 0)
			finish = thickness / 2;
		else
			finish = thickness / 2 - 1;	
				
		for (int x = start; x <= finish; x++)
		   for (int y = start; y <= finish; y++)
			  g.drawLine(x1+x,y1+y,x2+x,y2+y);
	}	
		
	
	/**
	 * Draws a "thick" circle; <br>
	 * The user specifies the x,y coordinate of the center of the circle as well as the radius value; <br>
	 * The thickness is specified in the last parameter.
	 **/	
	public static void drawThickCircle(Graphics g, int centerX, int centerY, int radius, int thickness)
	{
		int diameter = 2 * radius - 1;
		
		if (thickness < 2)
			thickness = 2;
		thickness--;
		
		for (int j = 0; j < thickness; j++)
		   g.drawOval(centerX-radius+j, centerY-radius+j, diameter-2*j, diameter-2*j);
		   
		centerX++;
						
		for (int j = 0; j < thickness; j++)
		   g.drawOval(centerX-radius+j, centerY-radius+j, diameter-2*j, diameter-2*j);
		   
		centerY++;
				
		for (int j = 0; j < thickness; j++)
		   g.drawOval(centerX-radius+j, centerY-radius+j, diameter-2*j, diameter-2*j);

		centerX--;
				
		for (int j = 0; j < thickness; j++)
		   g.drawOval(centerX-radius+j, centerY-radius+j, diameter-2*j, diameter-2*j);  
	}	
	
		
	/**
	 * Draws a "thick" oval. <br>
	 * The user specifies the x,y coordinate of the center of the oval as well as the horizontal and vertical radii values. <br>
	 * The thickness is specified in the last parameter.
	 **/	
	public static void drawThickOval(Graphics g, int centerX, int centerY, int hRadius, int vRadius, int thickness)
	{
		int hDiameter = 2 * hRadius - 1;
		int vDiameter = 2 * vRadius - 1;
		
		if (thickness < 2)
			thickness = 2;
		thickness--;
			
		for (int j = 0; j < thickness; j++)
		   g.drawOval(centerX-hRadius+j, centerY-vRadius+j, hDiameter-2*j, vDiameter-2*j);
		   
		centerX++;
					
		for (int j = 0; j < thickness; j++)
		   g.drawOval(centerX-hRadius+j, centerY-vRadius+j, hDiameter-2*j, vDiameter-2*j);
		
		centerY++;
					
		for (int j = 0; j < thickness; j++)
		   g.drawOval(centerX-hRadius+j, centerY-vRadius+j, hDiameter-2*j, vDiameter-2*j);
		   
		centerX--;
					
		for (int j = 0; j < thickness; j++)
		   g.drawOval(centerX-hRadius+j, centerY-vRadius+j, hDiameter-2*j, vDiameter-2*j);         
	}	


	/**
	 * Draws a "thick" arc which will look like a thick curve. <br>
	 * The parameters are the same as drawArc, except there is an extra parameter at the end for the thickness.
	 **/	
	public static void drawThickArc(Graphics g, int centerX, int centerY, int xRadius, int yRadius, int start, int finish, int thickness)
	{
		int xDiameter = 2 * xRadius - 1;
		int yDiameter = 2 * yRadius - 1;

		if (thickness < 2)
			thickness = 2;
		thickness--;		
		
		for (int j = 0; j < thickness; j++)
		   drawArc(g,centerX, centerY, xRadius-j, yRadius-j, start, finish);
		   
		centerX++;
				
		for (int j = 0; j < thickness; j++)
		   drawArc(g,centerX, centerY, xRadius-j, yRadius-j, start, finish);
		   
		centerY++;
				
		for (int j = 0; j < thickness; j++)
		   drawArc(g,centerX, centerY, xRadius-j, yRadius-j, start, finish);
		   	
		centerX--;
				
		for (int j = 0; j < thickness; j++)
		   drawArc(g,centerX, centerY, xRadius-j, yRadius-j, start, finish);
	}		 
	
		
	/**
	 * Draws a "thick" open rectangle. <br>
	 * The parameters are the same as drawRectangle, except there is an extra parameter at the end for the thickness.
	 **/
	public static void drawThickRectangle(Graphics g, int x1, int y1, int x2, int y2, int thickness)
	{
		if (thickness < 2)
			thickness = 2;
		int temp;
		if (x1 > x2) 
			{ temp = x1; x1 = x2; x2 = temp; }
		if (y1 > y2) 
			{ temp = y1; y1 = y2; y2 = temp; }
		int width  = x2 - x1;
		int height = y2 - y1;
		for (int j = 0; j < thickness; j++)
		   g.drawRect(x1+j, y1+j, width-2*j, height-2*j);

	}	


	/**
	 * Draws an "thick" open rectangle with rounded corners. <br>
	 * The parameters are the same as drawRoundedRectangle, except there is an extra parameter at the end for the thickness.
	 **/
	public static void drawThickRoundedRectangle(Graphics g, int x1, int y1, int x2, int y2, int radius, int thickness)
	{		
		int temp;
		if (x1 > x2) { temp = x1; x1 = x2; x2 = temp; }
		if (y1 > y2) { temp = y1; y1 = y2; y2 = temp; }
		int width  = x2 - x1;
		int height = y2 - y1;
		int diameter = radius * 2;

		if (thickness < 2)
			thickness = 2;
		thickness--;
				
		for (int j = 0; j < thickness; j++)
		   g.drawRoundRect(x1+j, y1+j, width-2*j, height-2*j,diameter,diameter);
		   
		x1++;
						
		for (int j = 0; j < thickness; j++)
		   g.drawRoundRect(x1+j, y1+j, width-2*j, height-2*j,diameter,diameter);
		   
		y1++;
						
		for (int j = 0; j < thickness; j++)
		   g.drawRoundRect(x1+j, y1+j, width-2*j, height-2*j,diameter,diameter);
		
		x1--;
						
		for (int j = 0; j < thickness; j++)
		   g.drawRoundRect(x1+j, y1+j, width-2*j, height-2*j,diameter,diameter);         
	}		
	
	
	/**
	 * Draws a "thick" spiral. <br>
	 * The parameters are the same as drawSpiral, except there is an extra parameter at the end for the thickness.
	 **/
	public static void drawThickSpiral(Graphics g, int centerX, int centerY, int radius, int thickness)
	{
		if (thickness < 2)
			thickness = 2;
		double spiralRadius = 0;
		double radian = 0;
		int halfRadius = thickness / 2;
		while (spiralRadius <= radius)
		{
			int x = (int) Math.round(Math.cos(radian) * spiralRadius) + centerX;
			int y = (int) Math.round(Math.sin(radian) * spiralRadius) + centerY;
			fillCircle(g,x,y,halfRadius);
			radian += 0.01;
			if (thickness > 25)
				spiralRadius += 0.02 * Math.sqrt(thickness);
			else
				spiralRadius += 0.02 * cubeRoot(thickness);	
		}
	}	
	
		
	/**
	 * Draws a certain number of "thick" lines in a burst like pattern. <br>	 
	 * The parameters are the same as drawBurst, except there is an extra parameter at the end for the thickness.
	 **/			
	public static void drawThickBurst(Graphics g, int centerX, int centerY, int radius, int numLines, int thickness)
	{
		if (thickness < 2)
			thickness = 2;
		for (double radian = 0; radian < twoPI; radian += twoPI/numLines)
		{
			int x = (int) Math.round(Math.cos(radian) * radius) + centerX;
			int y = (int) Math.round(Math.sin(radian) * radius) + centerY;
			drawThickLine(g, centerX, centerY, x, y, thickness);
		}
	}	
	
				
	/**
	 * Draws a certain number of random "thick" lines in a burst like pattern. <br>
	 * The "thick" lines have random colors, random lengths and are drawn in random directions. <br>
	 * The parameters are the same as drawBurst, except there is an extra parameter at the end for the thickness. <br>
	 * Post Condition: The current graphics color will be changed to whatever was the color of the last line drawn.
	 **/							
	public static void drawThickRandomBurst(Graphics g, int centerX, int centerY, int radius, int numLines, int thickness)
	{
		if (thickness < 2)
			thickness = 2;
		for (int j = 1; j <= numLines; j++)
		{
			double radian = twoPI * Math.random();
			double randomRadius = radius * Math.random();
			int x = (int) Math.round(Math.cos(radian) * randomRadius) + centerX;
			int y = (int) Math.round(Math.sin(radian) * randomRadius) + centerY;
			setRandomColor(g);
			drawThickLine(g, centerX, centerY, x, y, thickness);
		}
	}		
	
		
	/**
	 * Draws a "thick" regular polygon with a specified number of sides. <br>
	 * The first 5 parameters (g and 4 ints) are the same as drawRegularPolygon. <br>
	 * The thickness is specified in the last parameter. <br>
	 * Precondition: sides >= 3
	 **/
	public static void drawThickRegularPolygon(Graphics g, int centerX, int centerY, int radius, int sides, int thickness)
	{
		int xCoord[] = new int[sides];
		int yCoord[] = new int[sides];
		
	 	double rotate;
	    if (sides % 2 == 1)
	    	rotate = halfPI;
	    else
	    	rotate = halfPI + Math.PI/sides;		
	 
	 	if (thickness > radius)
			thickness = radius;
		if (thickness < 2)
			thickness = 2;
		thickness--;
			 
	    for (int currentRadius = radius; currentRadius >= radius-thickness; currentRadius -= 0.1)
	    {
			for (int k = 0; k < sides; k++)
			{
				xCoord[k] = (int) Math.round(Math.cos(twoPI * k/sides - rotate) * currentRadius) + centerX;
				yCoord[k] = (int) Math.round(Math.sin(twoPI * k/sides - rotate) * currentRadius) + centerY;
			}
			g.drawPolygon(xCoord,yCoord,sides);
	    }	
	    	
	    centerX++; 
	    		 
	    for (int currentRadius = radius; currentRadius >= radius-thickness; currentRadius -= 0.1)
	    {
			for (int k = 0; k < sides; k++)
			{
				xCoord[k] = (int) Math.round(Math.cos(twoPI * k/sides - rotate) * currentRadius) + centerX;
				yCoord[k] = (int) Math.round(Math.sin(twoPI * k/sides - rotate) * currentRadius) + centerY;
			}
			g.drawPolygon(xCoord,yCoord,sides);
	    }	
	    	
	    centerY++; 
	    		 
	    for (int currentRadius = radius; currentRadius >= radius-thickness; currentRadius -= 0.1)
	    {
			for (int k = 0; k < sides; k++)
			{
				xCoord[k] = (int) Math.round(Math.cos(twoPI * k/sides - rotate) * currentRadius) + centerX;
				yCoord[k] = (int) Math.round(Math.sin(twoPI * k/sides - rotate) * currentRadius) + centerY;
			}
			g.drawPolygon(xCoord,yCoord,sides);
	    }	
	    	
	    centerX--; 
	    		 
	    for (int currentRadius = radius; currentRadius >= radius-thickness; currentRadius -= 0.1)
	    {
			for (int k = 0; k < sides; k++)
			{
				xCoord[k] = (int) Math.round(Math.cos(twoPI * k/sides - rotate) * currentRadius) + centerX;
				yCoord[k] = (int) Math.round(Math.sin(twoPI * k/sides - rotate) * currentRadius) + centerY;
			}
			g.drawPolygon(xCoord,yCoord,sides);
	    }		    		    	
	}	

		
	/**
	 * Draws a "thick" star with a specified number of points. <br>
	 * The first 5 parameters (g and 4 ints) are the same as drawStar. <br>
	 * The thickness is specified in the last parameter. <br>
	 * Precondition: points >= 2
	 **/
	public static void drawThickStar(Graphics g, int centerX, int centerY, int radius, int points, int thickness)
	{
		if (thickness < 2)
			thickness = 2;
		thickness--;	
		int originalRadius = radius;
		
	    for (int j = 1; j <= thickness; j++)
	    {
			drawStar(g,centerX,centerY,radius,points);
			radius--;
	    }
	    
	    centerX++;
	    radius = originalRadius;
		
	    for (int j = 1; j <= thickness; j++)
	    {
			drawStar(g,centerX,centerY,radius,points);
			radius--;
	    }	 
	    	
	    centerY++;
	    radius = originalRadius;
		
	    for (int j = 1; j <= thickness; j++)
	    {
			drawStar(g,centerX,centerY,radius,points);
			radius--;
	    }	
	    	
	    centerX--;
	    radius = originalRadius;
		
	    for (int j = 1; j <= thickness; j++)
	    {
			drawStar(g,centerX,centerY,radius,points);
			radius--;
	    }		    		    	      
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		


	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Graphics methods which draws a large variety of "filled-in" figures.
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////	


	/**
	 * Draws a solid "filled in" circle. <br>
	 * The user specifies the x,y coordinate of the center of the circle as well as the radius value.
	 **/	
	public static void fillCircle(Graphics g, int centerX, int centerY, int radius)
	{
		int diameter = 2 * radius;
		g.fillOval(centerX-radius, centerY-radius, diameter, diameter);
	}
	

	/**
	 * Draws a solid "filled in" oval. <br>
	 * The user specifies the x,y coordinate of the center of the oval as well as the horizontal and vertical radii values. 
	 **/
	public static void fillOval(Graphics g, int centerX, int centerY, int hRadius, int vRadius)
	{
		int hDiameter = 2 * hRadius;
		int vDiameter = 2 * vRadius;
		g.fillOval(centerX-hRadius, centerY-vRadius, hDiameter, vDiameter);
	}
	

	/**
	 * Draws a "solid" arc which will look either like a pie wedge or Pac-man. <br>
	 * The parameters are the same as drawArc.
	 **/
	public static void fillArc(Graphics g, int centerX, int centerY, int xRadius, int yRadius, int start, int finish)
	{
		int xDiameter = 2 * xRadius;
		int yDiameter = 2 * yRadius;

		if (finish < start)
			finish += 360;
		int newStart  = 90 - start;   // shifts starting position from 3:00 to 12:00
		int newFinish = start-finish; // as oppose to finish-start.  Subtracting backwards changes from counter-clockwise to clockwise.

		g.fillArc(centerX-xRadius, centerY-yRadius, xDiameter, yDiameter, newStart, newFinish);
	}
	
		 
	/**
	 *	Draws an solid "filled-in" irregular triangle using the three sets of provided coordinates.<br>
	 **/
	public static void fillTriangle(Graphics g,int x1,int y1,int x2,int y2,int x3,int y3) ////// Added 06-25-08
	{
		Polygon triangle = new Polygon();
	 	triangle.addPoint(x1,y1);
	 	triangle.addPoint(x2,y2);
	 	triangle.addPoint(x3,y3);
	 	g.fillPolygon(triangle);
	}
	 
	 
	/**
	 *	Draws an solid "filled-in" irregular quadrilateral using the four sets of provided coordinates.<br>
	 **/
	public static void fillQuad(Graphics g,int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4) ////// Added 06-25-08
	{
		Polygon quad = new Polygon();
	 	quad.addPoint(x1,y1);
	 	quad.addPoint(x2,y2);
	 	quad.addPoint(x3,y3);
	 	quad.addPoint(x4,y4);
	 	g.fillPolygon(quad);
	}
	 
				
	/**
	 * Draws a solid "filled in" rectangle. <br> 
	 * The parameters are the same as drawRectangle.
	 **/		
	public static void fillRectangle(Graphics g, int x1, int y1, int x2, int y2)
	{
		int temp;
		if (x1 > x2) 
			{ temp = x1; x1 = x2; x2 = temp; }
		if (y1 > y2) 
			{ temp = y1; y1 = y2; y2 = temp; }		
		int width  = x2 - x1;
		int height = y2 - y1;
		g.fillRect(x1,y1,width,height);
	}		
		

	/**
	 * Draws a solid "filled in" rectangle with rounded corners. <br> 
	 * The parameters are the same as drawRoundedRectangle.
	 **/		
	public static void fillRoundedRectangle(Graphics g, int x1, int y1, int x2, int y2, int radius)
	{
		int temp;
		if (x1 > x2) { temp = x1; x1 = x2; x2 = temp; }
		if (y1 > y2) { temp = y1; y1 = y2; y2 = temp; }
		int width  = x2 - x1;
		int height = y2 - y1;
		int diameter = radius * 2;
		g.fillRoundRect(x1,y1,width,height,diameter,diameter);
	}	
				
	
	/**
	 * Draws a solid "filled in" polygon with a specified number of sides. <br>
	 * The parameters are the same as drawRegularPolygon. <br>
	 * Precondition: sides >= 3
	 **/
	public static void fillRegularPolygon(Graphics g, int centerX, int centerY, int radius, int sides)
	{
		int xCoord[] = new int[sides];
		int yCoord[] = new int[sides];
	 
	 	double rotate;
	    if (sides % 2 == 1)
	    	rotate = halfPI;
	    else
	    	rotate = halfPI + Math.PI/sides;
	    	
		for (int k = 0; k < sides; k++)
		{
			xCoord[k] = (int) Math.round(Math.cos(twoPI * k/sides - rotate) * radius) + centerX;
			yCoord[k] = (int) Math.round(Math.sin(twoPI * k/sides - rotate) * radius) + centerY;
		}
		g.fillPolygon(xCoord,yCoord,sides);
	}
	
	private static int getHalfRadius(int radius, int points)
	{
		int halfRadius;
		if (points % 2 == 1)
			halfRadius = 193 * radius / 500;
		else	
			halfRadius = 233 * radius / 400; 
		return halfRadius;
	}
	

	/**
	 * Draws a solid "filled in" star with a specified number of points. <br>
	 * The parameters are the same as drawStar. <br>
	 * Precondition: points >= 2
	 **/
	public static void fillStar(Graphics g, int centerX, int centerY, int radius, int points)
	{
		int halfRadius = getHalfRadius(radius, points);
		points *= 2;		
			
		int xCoord[] = new int[points];
		int yCoord[] = new int[points];
		
		int currentRadius;
				
		for (int k = 0; k < points; k++)
		{
			if (k % 2 == 0)
				currentRadius = radius;
			else
				currentRadius = halfRadius;
					
			xCoord[k] = (int) Math.round(Math.cos(twoPI * k/points - halfPI) * currentRadius) + centerX;
			yCoord[k] = (int) Math.round(Math.sin(twoPI * k/points - halfPI) * currentRadius) + centerY;
		}
		g.fillPolygon(xCoord,yCoord,points);
	}	
		
				
}