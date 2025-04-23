package assignment9;
// chatgpt was used to assist

import java.awt.event.KeyEvent;

import edu.princeton.cs.introcs.StdDraw;

public class Game {
	
	private Snake snake;
	private Food food; // call from food.java
	private int score = 0; // keep score
	
	public Game() {
		StdDraw.enableDoubleBuffering();
		
		
				snake = new Snake();
				food = new Food();
	}
	
	public void play() { // main loop
		while (snake.isInbounds()) { // called from snake.java if the snake head is out of bounds then the game ends. 
			int dir = getKeypress();
			
			if (dir != -1) {
				snake.changeDirection(dir); // gets directions
			}

			snake.move();
			
			
			
			if (snake.eatFood(food)) {
				food = new Food(); // respawn food using .draw in food.java
				score++; // score updated
			}

			updateDrawing();
		}
		
		
		StdDraw.clear(); // if snake goes out of bounds.
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.text(0.5, 0.5, "Game Over!");
		StdDraw.show();
		
		
		
		StdDraw.clear();
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.text(0.5, 0.6, "Game Over!");
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.text(0.5, 0.5, "Final Score: " + score);
		StdDraw.show();
	}
	
	
	private int getKeypress() { // keys for movement
		if(StdDraw.isKeyPressed(KeyEvent.VK_W)) {
			return 1;
		} else if (StdDraw.isKeyPressed(KeyEvent.VK_S)) {
			return 2;
		} else if (StdDraw.isKeyPressed(KeyEvent.VK_A)) {
			return 3;
		} else if (StdDraw.isKeyPressed(KeyEvent.VK_D)) {
			return 4;
		} else {
			return -1;
		}
	}
	
	/**
	 * Clears the screen, draws the snake and food, pauses, and shows the content
	 */
	private void updateDrawing() {
		StdDraw.clear();
		snake.draw();
		food.draw();
		StdDraw.pause(50);
		StdDraw.show();
		
		StdDraw.setPenColor(StdDraw.BLACK);// score
		StdDraw.textLeft(0.02, 0.98, "Score: " + score);
	}
	
	public static void main(String[] args) {
		Game g = new Game();
		g.play();
	}
}
