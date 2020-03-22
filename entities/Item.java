public abstract class Item {
    String name;
    String description;

    abstract void use();
    abstract void useInBattle();

    void pick_up(PlayerCharacter player) {
        player.inventory.add(this);  // This  will eventually be a thing when an instance of player is made in main.
    }
}
