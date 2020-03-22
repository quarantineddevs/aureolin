package rendering;

import java.awt.Color;
import java.awt.Graphics;

public class TestCenteredSquare extends Renderable {
	
	// Draw a 200x200 red square in the center of the screen.
	// WILL BE DELETED LATER
	
	APanel panel;

	public TestCenteredSquare(APanel panel) {
		super(panel);
		this.panel = panel;
	}

	@Override
	public void render(Graphics g) {
		// Draw central blue square
		g.setColor(Color.BLUE);
		g.fillRect(300, 200, 200, 200);
	}

}
