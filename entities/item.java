public abstract class Item {
    String name;
    String description;

    abstract void use();
    abstract void useInBattle();

    void pick_up() {
        player.inventory.add(this);  // This will eventually be a thing when player's inventory is an ArrayList of Item.
    }
}
