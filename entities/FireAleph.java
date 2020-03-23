package entities;

public class FireAleph extends Magic {
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
		  } else if(enemy.type == "water") {
		  	enemy.hp -= 0;
		  } else {
		  	enemy.hp -= 1;
		  }
	  	  player.mp -= 1;
		} else {
			// Have say not enough mp
		}
	}
}