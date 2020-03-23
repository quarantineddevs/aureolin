package entities;

public abstract class Magic extends Item {
	String name;
	String description;
	
	int itemID;
	
	int mpCost;
	
	boolean mpCheck(PlayerCharacter player) {
		if(player.mp >= mpCost) {
			return true;
		} else {
			return false;
		}
	}
	
	abstract void use(PlayerCharacter player);
	abstract void useInBattle(PlayerCharacter player, Opponent enemy);
}