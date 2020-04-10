package entities;

import java.lang.Math;

import animation.ErrorMessageEvent;
import rendering.AFrame;

public class StunAleph extends Magic {
  AFrame frame;
  
  String name = "Stun א";
  String description = "A spell that stuns opponents with a minor electric shock.";
  
  int itemID = -1002;
  
  int mpCost = 4;
  
  void use(PlayerCharacter player) {
    new ErrorMessageEvent(this.frame, "You can't use that here.");
  }
  
  void useInBattle(PlayerCharacter player, Opponent enemy) {
    double r = (Math.random() * ((1 - 0.01) +1)) + 0.01;
    if(r < 0.5) {  // 4% chance
      new ErrorMessageEvent(this.frame, "Spell failed!");
    } else if(r < 0.1) {  // 6% chance
      enemy.stunned1 = true;
    } else if(r < 0.29) {  // 20% chance
      enemy.stunned3 = true;
    } else if (r < 1) {  // 70% chance
      enemy.stunned2 = true;
    }
  }
}