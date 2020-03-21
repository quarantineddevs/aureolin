package rendering;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public abstract class Renderable {
	
	// Superclass of all renderable objects in-game.
	// Also provides some handy static methods for rendering.
	
	APanel panel;
	
	public Renderable(APanel panel) {
		this.panel = panel;
		this.panel.objects.add(this);
	}
	
	// Must be overridden in subclasses.
	public abstract void render(Graphics g);
	
	//// STATIC METHODS BELOW ////
	
	// Rendering with a texture
		// xPos and yPos are the center, NOT the corner
		public static void render(Graphics g, int width, int height, int xPos, int yPos, String textureName) {
			Rectangle rect = new Rectangle(xPos - width/2, yPos - height/2, width, height);
			Graphics2D g2d = (Graphics2D) g.create();
			BufferedImage textureFile = null;
			// TODO TODO TODO PLEASE someone figure out how to change this file path to work everywhere
			String fileName = "/users/adamhutchings/Coding/asmura/textures/" + textureName + ".png";
			try {
				// TODO: Change file path for different users
				textureFile = ImageIO.read(new File(fileName));
			} catch (IOException ioexception) {
				System.out.println(ioexception.getMessage());
			}
			g2d.setPaint(new TexturePaint(textureFile, rect));
			g2d.fill(rect);
			g2d.dispose();
		}

}
