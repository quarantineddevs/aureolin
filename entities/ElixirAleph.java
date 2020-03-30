package entities;

public class ElixirAleph extends Consumable {
	String name = "Elixir א";
	String description = "An item that restores your magical energy instantly.";
	
	int itemID = 1002;
	int msrp = 7;
	
	void use(PlayerCharacter player) {
		player.mp += 2;
	}
	
	void useInBattle(PlayerCharacter player, Opponent enemy) {
		use(player);
	}
}