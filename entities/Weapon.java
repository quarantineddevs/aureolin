package entities;

import java.lang.Math;

import animation.ErrorMessageEvent;
import rendering.AFrame;

public abstract class Weapon extends Item {
	
  // TODO: Figure out a way to implement the AFrame instance
  AFrame frame;
	
  int attackPower;
  
  void use(PlayerCharacter Player) {
	// Have it say you can't do that (in the window) when used outside of battle.
  }

   void useInBattle(PlayerCharacter player, Opponent enemy) {
    double r1 = (Math.random() * ((1.05 - 0.95) +1)) + 0.95;
    double r2 = (Math.random() * ((1.15 - 0.85) + 1)) + 0.85;
    if(player.accuracy * r1 / enemy.fleetness >= 1 || (Math.random() * ((1 - 0.1) +1)) + 0.1 > player.accuracy * r1 / enemy.fleetness) {  // When an instance of PlayerCharacter called player and an instance of Opponent called enemy gets made this will hopefully work.
      enemy.hp -= Math.floor(player.strength * this.attackPower * r2 / enemy.defense);
    } else {
       new ErrorMessageEvent(this.frame, "Attack missed!");
    }
  }
}
