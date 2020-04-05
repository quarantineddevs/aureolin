package entities;

import animation.ErrorMessageEvent;
import rendering.AFrame;

public abstract class Consumable extends Item {
	
  // Game it's connected to (well actually window, but whatever)
  AFrame frame;
	
  String name;
  String description;
	
  int itemID;
  int msrp;  // Manufacturer suggested retail price
	
  abstract void use(PlayerCharacter player);
  abstract void useInBattle(PlayerCharacter player, Opponent enemy);
    
  boolean buy(PlayerCharacter player) {
    if(player.money >= this.msrp) {
      player.inventory.add(this);
    } else {
      new ErrorMessageEvent(this.frame, "You don't have enough money to buy " + name + ".");
    }
    return player.money >= this.msrp;
  }
}
