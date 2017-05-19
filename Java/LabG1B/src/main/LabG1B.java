package main;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

/**
 * Lab G1B: Drawing homes in random places.
 * 
 * @author Albert Tang
 */
public class LabG1B extends Applet {
	
	private static final long serialVersionUID = 469679138149032045L;

	public void paint(Graphics g) {
		setSize(1000,700);
		Random rand = new Random();
		// We will randomize the coordinates, and then draw the house using them 4 times.
		for (int i = 0; i <= 1000; i++) {
			int x = rand.nextInt(1000);
			int y = rand.nextInt(700);
			drawHouse(g, x, y);
		}
	}
	public static void drawHouse(Graphics g, int x, int y) {
		// Draw the floors
		drawFloors(g, x, y);
		// Draw the roof
		drawRoof(g, x, y);
		// Draw the chimney
		drawChimney(g, x, y);
		// Draw the door
		drawDoor(g, x, y);
		// Draw the Windows
		drawWindows(g, x, y);
	}
	public static void drawFloors(Graphics g, int x, int y) {
		g.setColor(Color.BLUE);
		g.drawRect(x, y, 300, 100);
		g.drawRect(x, y+100, 300, 100);
	}
	public static void drawRoof(Graphics g, int x, int y) {
		g.setColor(Color.red);
		g.drawLine(x, y, x+150, y-100);
		g.drawLine(x+300, y, x+150, y-100);
		g.drawLine(x, y, x+300, y);
	}
	public static void drawChimney(Graphics g, int x, int y) {
		g.setColor(Color.red);
		g.drawLine(x+220, y-54, x+220, y-120);
		g.drawLine(x+220, y-120, x+250, y-120);
		g.drawLine(x+250, y-120, x+250, y-34);
	}
	public static void drawDoor(Graphics g, int x, int y) {
		g.setColor(Color.black);
		g.drawRect(x+130, y+140, 40, 60);
		g.drawOval(x+140, y+150, 20, 40);
		g.fillOval(x+164, y+170, 5, 5);
	}
	public static void drawWindows(Graphics g, int x, int y) {
		g.setColor(Color.black);
		g.drawRect(x+20, y+20, 60, 60);
		g.drawLine(x+20, y+50, x+80, y+50);
		g.drawLine(x+50, y+20, x+50, y+80);
		g.drawRect(x+220, y+20, 60, 60);
		g.drawLine(x+220, y+50, x+280, y+50);
		g.drawLine(x+250, y+20, x+250, y+80);
		g.drawRect(x+120, y+20, 60, 60);
		g.drawLine(x+120, y+50, x+180, y+50);
		g.drawLine(x+150, y+20, x+150, y+80);
		g.drawRect(x+20, y+120, 60, 60);
		g.drawLine(x+20, y+150, x+80, y+150);
		g.drawLine(x+50, y+120, x+50, y+180);
		g.drawRect(x+220, y+120, 60, 60);
		g.drawLine(x+220, y+150, x+280, y+150);
		g.drawLine(x+250, y+120, x+250, y+180);
	}
}
