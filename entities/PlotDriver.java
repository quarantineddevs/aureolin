package entities;

import animation.ErrorMessageEvent;
import rendering.AFrame;

public abstract class PlotDriver extends Item {
	AFrame frame;
	
	String name;
	String description;
	
	int itemID;
	
	void use(PlayerCharacter player) {
		new ErrorMessageEvent(this.frame, "You can't use that here.");
	}
	
	void useInBattle(PlayerCharacter player, Opponent enemy) {
		new ErrorMessageEvent(this.frame, "You can't use that here.");
	}
	
	@Override
	
	void remove(PlayerCharacter player) {
		new ErrorMessageEvent(this.frame, "You can't remove this.");
	}
}