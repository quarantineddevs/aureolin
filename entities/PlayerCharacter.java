package entities;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import rendering.APanel;
import rendering.Renderable;

public class PlayerCharacter extends Renderable {
	String name;
	boolean gender;	// 1 for m, 0 for f
	ArrayList<Item> inventory = new ArrayList<>();

	// TODO: Change for global location
	public int xPos;
	public int yPos;
	
	Combat currentCombat;

	APanel panel;

	public int hp;
	public int mp;
	public int xp;
	public int strength;
	public int defense;
	public int magic;
	public int resistance;
	public int fleetness;
	public int accuracy;
	public int money;

	public PlayerCharacter(APanel panel) {
		super(panel, true);
		this.panel = panel;
		
		this.xPos = 400;
		this.yPos = 400;
	}
	
	@Override
	public void render(Graphics g) {
		// TODO: Add texture
		g.setColor(Color.ORANGE);
		g.fillRect(xPos - 25, yPos - 25, 50, 50);
	}
	
}
