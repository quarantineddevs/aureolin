package rendering;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

import entities.PlayerCharacter;
import animation.ErrorMessageEvent;
import main.Asmura;

public class AFrame extends JFrame implements KeyListener {
	
	// For reasons unknown to me
	public static final long serialVersionUID = 378294032845375L;
	
	// The size of the window
	public static Dimension windowSize = new Dimension(800, 600);
	
	public APanel panel;
	
	// The state of the window
	public String state;
	
	public Asmura game;
	
	private TextRenderer textRenderer;
	
	// When an error was received.
	private int errorStartTime;
	
	private PlayerCharacter player;
	
	// Constructor (like __init__ in Python, roughly equal to C++)
	public AFrame(Asmura game) {
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
		this.panel = new APanel(this);
		this.add(this.panel);
		// For menu stuff
		this.state = "menu";
		this.game = game;
		this.textRenderer = new TextRenderer(this.panel);
		this.textRenderer.errorText = "";
		this.player = new PlayerCharacter(this.panel);
	}
	
	@Override
	public void repaint() {
		this.panel.repaint();
		// Checking the error status
		if (this.game.time > errorStartTime + 30) {
			textRenderer.errorText = "";
		}
	}
	
	// Runs on closing the window (AKA exiting the game)
	private void close() {
		// Actually closing the window
		this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
		// TODO: Add cleanup code here if needed
	}
	
	// Error handling (semi-un-hardcoded)
	public void raiseScreenError(String errorMessage) {
		// Error lasts for one second
		errorStartTime = this.game.time;
		textRenderer.errorText = errorMessage;
	}
	
	// Run whenever a key is pressed
	public void keyPressed(KeyEvent keyEvent) {
		int key = keyEvent.getKeyCode();
		if (key == KeyEvent.VK_ESCAPE) {
			this.close();
		} else if (key == KeyEvent.VK_ENTER) {
			// Enter starts game (changes background to white if in menu)
			if (this.state == "menu") {
				// TODO: Add functions for doing these together
				this.setStateMain();
			}
		} else if (key == KeyEvent.VK_Q) {
			// q toggles between escaped menu and main game
			if (this.state == "main") {
				this.setStateEscaped();
			} else if (this.state == "escaped") {
				this.setStateMain();
			}
		} else if (key == KeyEvent.VK_E) {
			new ErrorMessageEvent(this, "NO PRESSING E");
		}
		// Trigger player movement only if the player is visible
		if (state == "main") {
			if (key == KeyEvent.VK_W) {
				player.yPos -= 25;
			} else if (key == KeyEvent.VK_S) {
				player.yPos += 25;
			} else if (key == KeyEvent.VK_A) {
				player.xPos -= 25;
			} else if (key == KeyEvent.VK_D) {
				player.xPos += 25;
			}
		}
	}
	
	// Changing screen states
	public void setStateMain() {
		this.state = "main";
		this.panel.bgColor = Color.WHITE;
		textRenderer.topText = "Main Game";
	}
	
	public void setStateEscaped() {
		this.state = "escaped";
		this.panel.bgColor = Color.GRAY;
		textRenderer.topText = "Escaped Menu";
	}
	
	// Methods we have to implement but don't actually use
	public void keyTyped(KeyEvent keyEvent) {}
	public void keyReleased(KeyEvent keyEvent) {}

}
