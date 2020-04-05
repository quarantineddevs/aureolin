package entities;

public abstract class Opponent {
  public String name;
  public String description;
  
  int hp;
  int strength;
  int defense;
  int magic;
  int resistance;
  int fleetness;
  int accuracy;
  
  int xpEarned;
  
  public String type;
  
  abstract boolean turnDecider();
  abstract void ai(PlayerCharacter player);
}
