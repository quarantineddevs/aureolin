package rendering;

import java.awt.Color;
import java.awt.Graphics;

import java.util.ArrayList;

import javax.swing.JPanel;

public class APanel extends JPanel {
	
	// Add this for Java knows what reason
	private static final long serialVersionUID = -23721312574526L;
	
	Color bgColor;
	
	// All objects to be rendered onto the screen.
	ArrayList<Renderable> objects;
	
	AFrame frame;
	
	public APanel(AFrame frame) {
		super();
		// For menu
		this.bgColor = Color.BLACK;
		objects = new ArrayList<>();
		this.frame = frame;
	}
	
	// repaint calls this with the appropriate Graphics object.
	@Override
	public void paintComponent(Graphics g) {
		// Draw over the entire screen in the background color.
		g.setColor(bgColor);
		g.fillRect(0, 0, 800, 600);
		// Render every Renderable object
		// So we don't have to access a field a million times
		String state = this.frame.state;
		for (Renderable object : objects) {
			// Logic here : don't render only if the state isn't menu and the object hides
			if (state == "main" || !object.hideable) {
				object.render(g);
			}
		}
	}

}
