package entities;

import animation.ErrorMessageEvent;
import rendering.AFrame;

public class FireAleph extends Magic {
	
	AFrame frame;
	
	String name = "Fire א";
	String description = "A basic spell that sets enemies ablaze. Some enemies will be particularly damaged by fire, for example creatures of ice.";
			
	int itemID = -1001;
	
	int mpCost = 1;
	
	void use(PlayerCharacter player) {
		// Have say not usable
	}
	
	void useInBattle(PlayerCharacter player, Opponent enemy) {
		if(mpCheck(player)) {			
		if(enemy.type == "grass" || enemy.type == "ice") {
			enemy.hp -= 3;
		} else if(enemy.type != "water") {
			enemy.hp -= 1;
		}
		player.mp -= 1;
	} else {
		new ErrorMessageEvent(this.frame, "You don't have enough mp to use this.");
	}
	}
}
