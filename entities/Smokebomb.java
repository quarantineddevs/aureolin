package entities;

import animation.ErrorMessageEvent;
import rendering.AFrame; // So it need this to compile, but idk why. ¯\_(ツ)_/¯
public class Smokebomb extends Consumable {
	AFrame frame;
	
	String name = "Smokebomb";
	String description = "A low explosive that allows escape from battle in its lingering smoke";
	
	int itemID = 1003;
	int msrp = 17;
	
	void use(PlayerCharacter player) {
		new ErrorMessageEvent(this.frame, "There's nothing to escape from.");
	}
	
	void useInBattle(PlayerCharacter player, Opponent enemy) {
		//When battles happen, exit it.
	}
}