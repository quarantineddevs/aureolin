package entities;

public abstract class Magic extends Item {
	String name;
	String description;
	
	int itemID;
	
	int mpCost;
	
	boolean mpCheck(PlayerCharacter player) {
		return player.mp >= mpCost;
	}
	
	abstract void use(PlayerCharacter player);
	abstract void useInBattle(PlayerCharacter player, Opponent enemy);
}
