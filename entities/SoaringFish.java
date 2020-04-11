package entities;

import java.lang.Math;

import animation.ErrorMessageEvent;
import rendering.AFrame;

public class SoaringFish extends Opponent {
  AFrame frame;
  
  public String name = "Soaring Fish";
  public String description = "A flying fish that's been magically altered to increase its wingspan, allowing it to truly fly.";
  
  int hp = 15;
  int strength = 4;
  int defense = 5;
  int magic = 5;
  int resistance = 0;
  int fleetness = 10;
  int accuracy = 4;
  
  public int xpEarned = 40;
  
  public String type = "water";
  
  boolean turnDecider() {
    return true;  // Means player goes first
  }
  
  void ai(PlayerCharacter player) {
    if(hp < 15) {
      counter(player);
    } else if(player.inventory.get(0).name == "Fire א" || player.inventory.get(1).name == "Fire א" || player.inventory.get(2).name == "Fire א" || player.inventory.get(3).name == "Fire א") {/*It's doing nothing on purpose.*/
    } else {
      ram(player);
    }
  }
  
  void counter(PlayerCharacter player) {
    double r1 = (Math.random() * ((1.05 - 0.95) +1)) + 0.95;
    double r2 = (Math.random() * ((1.15 - 0.85) + 1)) + 0.85;
    if(this.accuracy * r1 / player.fleetness >= 1 || (Math.random() * ((1 - 0.1) +1)) + 0.1 > this.accuracy * r1 / player.fleetness) {
      player.hp -= Math.floor(this.strength * (15 - this.hp) * r2 / player.defense);
    } else {
       new ErrorMessageEvent(this.frame, "Attack missed!");
    }
  }
  void ram(PlayerCharacter player) {
    double r1 = (Math.random() * ((1.05 - 0.95) +1)) + 0.95;
    double r2 = (Math.random() * ((1.15 - 0.85) + 1)) + 0.85;
    if(this.accuracy * r1 / player.fleetness >= 1 || (Math.random() * ((1 - 0.1) +1)) + 0.1 > this.accuracy * r1 / player.fleetness) {
      player.hp -= Math.floor(this.strength * (2) * r2 / player.defense);
    } else {
       new ErrorMessageEvent(this.frame, "Attack missed!");
    }
  }
}