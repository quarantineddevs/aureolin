public abstract class Item {
  public String name;
  public Sting description;

  void receive() {
      player.inventory.add(this);  // player.inventory will be an ArrayList of Item when player gets made
  }

  abstract void use()
  abstract void useInBattle()
}
