package rendering;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class AFrame extends JFrame implements KeyListener {
	
	// For reasons unknown to me
	public static final long serialVersionUID = 378294032845375L;
	
	// The size of the window
	public static Dimension windowSize = new Dimension(800, 600);
	
	private APanel panel;
	
	// The state of the window
	private String state;
	
	// Constructor (like __init__ in Python, roughly equal to C++)
	public AFrame() {
		// Set title to "Return from Asmura"
		super("Return from Asmura");
		// Set size
		super.setPreferredSize(windowSize);
		// Make the window visible (why does this needs to be a thing?)
		super.setVisible(true);
		// Make the program exit when the window closes
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Sizes everything correctly
		super.pack();		
		addKeyListener(this);	
		this.panel = new APanel();
		this.add(this.panel);
		// For menu stuff
		this.state = "menu";
	}
	
	@Override
	public void repaint() {
		this.panel.repaint();
	}
	
	// Runs on closing the window (AKA exiting the game)
	private void close() {
		// Actually closing the window
		this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
		// TODO: Add cleanup code here if needed
	}
	
	// Run whenever a key is pressed
	public void keyPressed(KeyEvent keyEvent) {
		int key = keyEvent.getKeyCode();
		if (key == KeyEvent.VK_ESCAPE) {
			this.close();
		}
	}
	
	// Methods we have to implement but don't actually use
	public void keyTyped(KeyEvent keyEvent) {}
	public void keyReleased(KeyEvent keyEvent) {}

}
