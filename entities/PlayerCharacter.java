import java.util.ArrayList;

public class PlayerCharacter {
    String name;
    boolean gender;  // 1 for m, 0 for f
    ArrayList<Item> inventory = new ArrayList<>();

    void PlayerCharacter(String name, boolean gender) {
        this.name = name;
        this.gender = gender;
    }
}
