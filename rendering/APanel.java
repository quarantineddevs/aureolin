package rendering;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class APanel extends JPanel {
	
	// Repaint calls this with the appropriate Graphics object.
	public void paintComponent(Graphics g) {
		// Draw over the entire screen in white.
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 800, 600);
	}

}
