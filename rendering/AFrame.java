package rendering;

import java.awt.Dimension;

import javax.swing.JFrame;

public class AFrame extends JFrame {
	
	// For reasons unknown to me
	public static final long serialVersionUID = 378294032845375L;
	
	// The size of the window
	public static Dimension windowSize = new Dimension(800, 600);
	
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
	}

}
