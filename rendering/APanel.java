package rendering;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class APanel extends JPanel {
	
	// Add this for Java knows what reason
	private static final long serialVersionUID = -23721312574526L;
	
	Color bgColor;
	
	public APanel() {
		super();
		// For menu
		this.bgColor = Color.BLACK;
	}
	
	// repaint calls this with the appropriate Graphics object.
	@Override
	public void paintComponent(Graphics g) {
		// Draw over the entire screen in the background color.
		g.setColor(bgColor);
		g.fillRect(0, 0, 800, 600);
	}

}
