package rendering;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class APanel extends JPanel {
	
	private Color bgColor;
	
	// repaint calls this with the appropriate Graphics object.
	@Override
	public void paintComponent(Graphics g) {
		// Draw over the entire screen in white.
		g.setColor(bgColor);
		g.fillRect(0, 0, 800, 600);
	}

}
