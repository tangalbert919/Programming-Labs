package main;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
/**
 * Lab 15: Algorithms
 * 
 * @author Albert Tang
 */
public class Lab15 extends Applet {
	/**
	 * Algorithms are sets of instructions that computers use to perform whatever it needs to do. Organisms actually
	 * use algorithms to get things done, and a good example is you waking up and getting out of bed. We use algorithms
	 * every day, and most of the time, we don't realize those instructions we read from the instuction manual are
	 * algorithms.
	 */
	private int numBars;
	int barHeight[];
	int sortDelay;
	
	public void init() { // Initialize variables and build the array
		setSize(1000,650);
		numBars = 47;
		sortDelay = 10;
		barHeight = new int[numBars];
		getBarValues();
	}
	
	public void getBarValues() { // Random number generator and create bars for graph
		Expo.startSeed(3333);
		
		for (int k = 0; k < numBars; k++) 
			barHeight[k] = Expo.seedRandom(10, 600);
		
	}
	
	public void paint(Graphics g) { // Executes methods to produce a sorted graph
		showFrame(g);
		displayRandomBars(g);
		sortBars(g);
	}
	
	public void showFrame(Graphics g) { // The frame
		Expo.setColor(g, Expo.black);
		Expo.fillRectangle(g, 0, 0, 1000, 20); // Top bar
		Expo.fillRectangle(g, 0, 0, 20, 650); // Left bar
		Expo.fillRectangle(g, 0, 630, 1000, 650); // Bottom Bar
		Expo.fillRectangle(g, 980, 0, 1000, 650); // Right bar
	}
	public void displayRandomBars(Graphics g) { // Display the bars with their random height
		int x1 = 0;
		int y2 = 630;
		for (int i = 0; i < numBars; i++) {
			x1 = 30 + i * 20;
			int y1 = y2 - barHeight[i];
			int x2 = x1 + 10;
			Expo.setColor(g, Expo.red);
			Expo.fillRectangle(g, x1, y1, x2, y2);
			Expo.delay(sortDelay);
		}
		
	}
	/**
	 * For this, we will do what we call "bubble sorting". It is the easiest sorting method you can understand,
	 * but it is also the most inefficient (or least efficient) for large arrays.
	 */
	public void sortBars(Graphics g) { // Sort the bars by their height, and redraw them.
		for (int k = 1; k <= numBars; k++) {
			for (int l = 0; l < numBars - k; l++) {
				if (barHeight[l] > barHeight[l+1]) {
					// First, we erase the two bars.
					eraseBar(g, l, Color.WHITE);
					eraseBar(g, l+1, Color.WHITE);
					// Next, we switch the values between two arrays.
					int temp = barHeight[l+1];
					barHeight[l+1] = barHeight[l];
					barHeight[l] = temp;
					// Now, we re-draw the two bars.
					redrawBar(g,l,Color.red);
					redrawBar(g,l+1,Color.red);
					// The delay is so you can see it working.
					Expo.delay(sortDelay);
				}
			}
			// The last bar turns blue.
			redrawBar(g,numBars-k,Color.blue);
		}
	}
	public void eraseBar(Graphics g, int i, Color clr) { // Erase the bars
		int x1 = 30 + i * 20;
		int y2 = 630;
		int y1 = y2 - barHeight[i];
		int x2 = x1 + 10;
		Expo.setColor(g, clr);
		Expo.fillRectangle(g, x1, y1, x2, y2);
	}
	public void redrawBar(Graphics g, int i, Color clr) { // Redraw the bars
		int x1 = 30 + i * 20;
		int y2 = 630;
		int y1 = y2 - barHeight[i];
		int x2 = x1 + 10;
		Expo.setColor(g, clr);
		Expo.fillRectangle(g, x1, y1, x2, y2);
	}
}
