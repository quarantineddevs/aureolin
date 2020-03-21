package rendering;

public abstract class Renderable {
	
	// Superclass of all renderable objects in-game.
	// Also provides some handy static methods for rendering.
	
	APanel panel;
	
	public Renderable(APanel panel) {
		this.panel = panel;
	}

}
