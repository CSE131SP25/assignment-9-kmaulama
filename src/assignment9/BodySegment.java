package assignment9;
//chatgpt was used to assist
import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class BodySegment {

	private double x, y, size;
	private Color color;
	
	public BodySegment(double x, double y, double size) {
		this.x = x;
		this.y = y;
		this.size = size;
		this.color = Color.blue;  // You can change this or use ColorUtils
	}
	
	/**
	 * Draws the segment
	 */
	public void draw() {
		StdDraw.setPenColor(color);
		StdDraw.filledSquare(x, y, size);
	}
	
	// Optional: getters for x and y if needed elsewhere
		public double getX() {
			return x;
		}
		
		public double getY() {
			return y;
		}
	
}
