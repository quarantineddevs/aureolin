import java.util.ArrayList;

public class PlayerCharacter {
    String name;
    boolean gender;  // 1 for m, 0 for f
    ArrayList<Item> inventory = new ArrayList<>();

    int hp;
    int strength;
    int defense;
    int magic;
    int resistance;
    int fleetness;
    int accuracy;

    public PlayerCharacter(String name, boolean gender, int hp, int strength, int defense, int magic, int resistance, int fleetness, int accuracy) {
        this.name = name;
        this.gender = gender;
        this.hp = hp;
        this.strength = strength;
        this.defense = defense;
        this.magic = magic;
        this.resistance = resistance;
        this.fleetness = fleetness;
        this.accuracy = accuracy;
    }
}
