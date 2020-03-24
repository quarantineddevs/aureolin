package entities;

public abstract class Consumable extends Item {
  String name;
  String description;
	
  int itemID;
  int msrp;  // Manufacturer suggested retail price
	
  abstract void use(PlayerCharacter player);
  abstract void useInBattle(PlayerCharacter player, Opponent enemy);
    
  void buy(PlayerCharacter player) {
    if(player.money >= this.msrp) {
      player.inventory.add(this);
    } else {
      // No
    }
  }
}