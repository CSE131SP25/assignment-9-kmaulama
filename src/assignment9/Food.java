package assignment9;
//chatgpt was used to assist
import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Food {

	public static final double FOOD_SIZE = 0.02;
	private double x, y;
	private Color color;
	
	/**
	 * Creates a new Food at a random location
	 */
	public Food() { // food created and placed randomly in the canvas
		this.x = Math.random(); 
		this.y = Math.random();
		this.color = new Color((float)Math.random(), (float)Math.random(), (float)Math.random());
	}
	
	/**
	 * Draws the Food
	 */
	public void draw() {
		StdDraw.setPenColor(color);
		StdDraw.filledSquare(x, y, FOOD_SIZE);
	}
	
	
		public double getX() {
			return x;
		}
		
		public double getY() {
			return y;
		}
		
		
		public void respawn() { // after the fruit is eaten, it spawns in a different place
			this.x = Math.random();
			this.y = Math.random();
		}

	
}
