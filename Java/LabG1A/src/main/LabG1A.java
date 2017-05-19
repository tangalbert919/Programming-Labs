package main;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

/**
 * Lab G1A: Advanced Graphics in Java
 * 
 * @author Albert Tang
 */
public class LabG1A extends Applet {
	
	private static final long serialVersionUID = 7283021600766607378L;
	
	public void paint(Graphics g) {
		setSize(900,700);
		grid(g);
		lines(g);
		openRectangles(g);
		filledRectangles(g);
		openOvals(g);
		filledOvals(g);
		openArcs(g);
		filledArcs(g);
		settingColors(g);
		openPolygons(g);
		filledPolygons(g);
		polyLines(g);
		randomPixels(g);
	}
	public void grid(Graphics g) {
		g.drawRect(25, 25, 800, 600);
		for (int x = 225; x < 825; x += 200)
			g.drawLine(x, 25, x, 625);
		for (int y = 225; y < 625; y += 200)
			g.drawLine(25, y, 825, y);
	}
	public void lines(Graphics g) {
		g.drawString("LINES", 50, 40);
		g.drawLine(50, 50, 200, 200);
		g.drawLine(125, 50, 125, 200);
		g.drawLine(50, 125, 200, 125);
		g.drawLine(50, 200, 200, 50);
	}
	public void openRectangles(Graphics g) {
		g.drawString("OPEN RECTANGLES", 250, 40);
		g.drawRect(250, 60, 75, 40);
		g.drawRect(340, 50, 60, 90);
		g.drawRoundRect(250, 125, 60, 60, 20, 20);
		g.drawRoundRect(345, 150, 50, 50, 50, 50);
	}
	public void filledRectangles(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawString("FILLED RACTANGLES", 450, 40);
		g.fillRect(450, 60, 75, 40);
		g.fillRect(540, 50, 60, 90);
		g.fillRoundRect(450, 125, 60, 60, 20, 20);
		g.fillRoundRect(545, 150, 50, 50, 50, 50);
	}
	public void openOvals(Graphics g) {
		g.drawString("OPEN OVALS", 650, 40);
		g.drawOval(650, 60, 75, 40);
		g.drawOval(740, 50, 60, 90);
		g.drawOval(650, 125, 60, 60);
		g.drawOval(745, 150, 50, 50);
	}
	public void filledOvals(Graphics g) {
		g.drawString("FILLED OVALS", 50, 240);
		g.fillOval(50, 260, 75, 40);
		g.fillOval(140, 250, 60, 90);
		g.fillOval(50, 325, 60, 60);
		g.fillOval(145, 350, 50, 50);
	}
	public void openArcs(Graphics g) {
		g.drawString("OPEN ARCS", 250, 240);
		g.drawArc(250, 260, 80, 40, 0, 180);
		g.drawArc(340, 250, 50, 80, 180, 180);
		g.drawArc(250, 335, 75, 75, 90, 270);
		g.drawArc(340, 350, 60, 60, 180, 270);
	}
	public void filledArcs(Graphics g) {
		g.drawString("FILLED ARCS", 450, 240);
		g.fillArc(450, 260, 80, 40, 0, 180);
		g.fillArc(540, 250, 50, 80, 180, 180);
		g.fillArc(450, 335, 75, 75, 90, 270);
		g.fillArc(540, 350, 60, 60, 180, 270);
	}
	public void settingColors(Graphics g) {
		g.drawString("SETTING COLORS", 650, 240);
		g.setColor(Color.BLACK);
		g.fillRect(650, 270, 35, 35);
		g.setColor(Color.blue);
		g.fillRect(690, 270, 35, 35);
		g.setColor(Color.cyan);
		g.fillRect(730, 270, 35, 35);
		g.setColor(Color.darkGray);
		g.fillRect(770, 270, 35, 35);
		g.setColor(Color.gray);
		g.fillRect(650, 310, 35, 35);
		g.setColor(Color.green);
		g.fillRect(690, 310, 35, 35);
		g.setColor(Color.lightGray);
		g.fillRect(730, 310, 35, 35);
		g.setColor(Color.magenta);
		g.fillRect(770, 310, 35, 35);
		g.setColor(Color.orange);
		g.fillRect(650, 350, 35, 35);
		g.setColor(Color.pink);
		g.fillRect(690, 350, 35, 35);
		g.setColor(Color.red);
		g.fillRect(730, 350, 35, 35);
		g.setColor(Color.yellow);
		g.fillRect(770, 350, 35, 35);
	}
	public void openPolygons(Graphics g) {
		g.setColor(Color.black);
		g.drawString("OPEN POLYGONS", 50, 440);
		int[] xPoints = {50,125,75,65,55,45};
		int[] yPoints = {450,460,500,485,525,490};
		g.drawPolygon(xPoints, yPoints, 6);
		int[] xPoints2 = {200,200,100,100,120,140,140,160,160,180};
		int[] yPoints2 = {525,600,600,550,525,550,570,570,525,500};
		g.drawPolygon(xPoints2, yPoints2, 10);
	}
	public void filledPolygons(Graphics g) {
		g.drawString("FILLED POLYGONS", 250, 440);
		int[] xPoints = {250, 325, 275, 265, 255, 245};
		int[] yPoints = {450, 460, 500, 485, 525, 490};
		g.fillPolygon(xPoints, yPoints, 6);
		int[] xPoints2 = {400,400,300,300,320,340,340,360,360,380};
		int[] yPoints2 = {525,600,600,550,525,550,570,570,525,500};
		g.fillPolygon(xPoints2, yPoints2, 10);
	}
	public void polyLines(Graphics g) {
		g.drawString("POLYLINES", 450, 440);
		// First polygon
		g.drawLine(450, 450, 525, 460);
		g.drawLine(525, 460, 475, 500);
		g.drawLine(475, 500, 465, 485);
		g.drawLine(465, 485, 455, 525);
		g.drawLine(455, 525, 445, 490);
		// Second polygon
		g.drawLine(600, 525, 600, 600);
		g.drawLine(600, 600, 500, 600);
		g.drawLine(500, 550, 520, 525);
		g.drawLine(520, 525, 540, 550);
		g.drawLine(540, 550, 540, 570);
		g.drawLine(540, 570, 560, 570);
		g.drawLine(560, 570, 560, 525);
		g.drawLine(560, 525, 580, 500);
		g.drawLine(580, 500, 600, 525);
	}
	public void randomPixels(Graphics g) {
		g.drawString("RANDOM PIXELS", 650, 440);
		for (int i = 0; i < 1000; i++) {
			Random rand = new Random();
			int red = rand.nextInt(255);
			int green = rand.nextInt(255);
			int blue = rand.nextInt(255);
			Color c = new Color(red, green, blue);
			g.setColor(c);
			int x = rand.nextInt(150) + 650;
			int y = rand.nextInt(150) + 450;
			g.drawLine(x, y, x, y);
		}
	}
	
}
