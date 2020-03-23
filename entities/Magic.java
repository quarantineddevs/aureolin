package entities;

public abstract class Magic extends Item {
	String name;
	String description;
	
	int itemID;
	
	int MPCost;
	
	boolean mpCheck(PlayerCharacter player) {
		if(player.mp >= MPCost) {
			return true;
		} else {
			return false;
		}
	}
	
	abstract void use(PlayerCharacter player);
	abstract void useInBattle(PlayerCharacter player, Opponent enemy);
}