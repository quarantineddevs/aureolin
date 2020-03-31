package entities;

public class PotionAleph extends Consumable {
  String name = "Potion א";
  String description = "A common item for healing without access to organized healthcare.";
	
  int itemID = 1001;
  int msrp = 5;
	
  void use(PlayerCharacter player) {
    player.hp += 5;
  }
	
  void useInBattle(PlayerCharacter player, Opponent enemy) {
    use(player);
  }
}
