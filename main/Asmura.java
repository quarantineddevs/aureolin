package main;

import java.util.concurrent.TimeUnit;

import rendering.*;

public class Asmura {
	
	private static int FRAMERATE = 30;
	
	public static void main(String[] args) {
		// Create an AFrame (window for the game)
		AFrame frame = new AFrame();
		// TEST BLUE SQUARE
		new TestCenteredSquare(frame.panel);
		// Repaint it forever
		while (true) {
			frame.repaint();
			// Wait a certain amount
			try {
				TimeUnit.MILLISECONDS.sleep(1000/FRAMERATE);
			} catch (InterruptedException exception) {
				// TODO: Add error handling
			}
		}
	}

}
