package entities;

public class Combat {
	PlayerCharacter player;
	Opponent enemy;
	
	boolean playerTurnChoice;
	boolean playerFirst;
	boolean turn;
	int turnCount;
	
	public Combat(PlayerCharacter player, Opponent enemy) {
		this.player = player;
		this.enemy = enemy;
		
		if(player.fleetness < enemy.fleetness) {
			playerTurnChoice = false;
			playerFirst = enemy.turnDecider();
		} else {
			playerTurnChoice = true;
			// Ask to go first or second. For now, assume yes.
			playerFirst = true;
		}
		turnCount = 1;
		while(player.hp > 0 || enemy.hp > 0) {
			turnRunner(player, enemy, playerFirst, turnCount);
		}
	}
	
	public void turnRunner(PlayerCharacter player, Opponent enemy, boolean playerFirst, int turnCount) {
		turn = playerFirst;
		if(!playerFirst) {
			enemy.ai(player);
		} else {
			/* Ask the player for their selection.
			   Players will choose from inventory.
			   For now assume: */
			player.inventory.get(0).useInBattle(player, enemy);
		}
		turn = !turn;
		if(playerFirst) {
			/* Ask the player for their selection.
			   Players will choose from inventory.
			   For now assume: */
			player.inventory.get(0).useInBattle(player, enemy);
		} else {
			enemy.ai(player);
		}
		turnCount++;
	}
}