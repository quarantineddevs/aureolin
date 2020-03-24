package entities;

import java.util.ArrayList;

public class PlayerCharacter {
    String name;
    boolean gender;  // 1 for m, 0 for f
    ArrayList<Item> inventory = new ArrayList<>();

    int hp;
    int mp;
    int xp;
    int strength;
    int defense;
    int magic;
    int resistance;
    int fleetness;
    int accuracy;
    int money;

    public PlayerCharacter(String name, boolean gender, int hp, int mp, int xp, int strength, int defense, int magic, int resistance, int fleetness, int accuracy, int money) {
        this.name = name;
        this.gender = gender;
        this.hp = hp;
        this.mp = mp;
        this.xp = xp;
        this.strength = strength;
        this.defense = defense;
        this.magic = magic;
        this.resistance = resistance;
        this.fleetness = fleetness;
        this.accuracy = accuracy;
        this.money = money;
    }
}
