package entities;

import animation.ErrorMessageEvent;
import java.lang.Math;
import rendering.AFrame;

public class GiantOwl extends Opponent {
	AFrame frame;
	
	public String name = "Giant Owl";
	public String description = "A four-foot tall carnivorous avian that preys on lone travellers";
	
	public int hp = 4;
	public int strength = 2;
	public int defense = 5;
	public int magic = 0;
	public int resistance = 1;
	public int fleetness = 6;
	public int accuracy = 4;
	
	public int xpEarned = 10;
	
	public String type = "";
	
	boolean turnDecider() {
		return true;
	}
	
	void ai(PlayerCharacter player) {
		double r1 = (Math.random() * ((1.05 - 0.95) +1)) + 0.95;
	    double r2 = (Math.random() * ((1.15 - 0.85) + 1)) + 0.85;
		if(this.accuracy * r1 / player.fleetness >= 1 || (Math.random() * ((1 - 0.1) +1)) + 0.1 > this.accuracy * r1 / player.fleetness) {
	      player.hp -= Math.floor(this.strength * 3 * r2 / player.defense);
	    } else {
		  new ErrorMessageEvent(this.frame, "Attack missed!");
        }
	}
}