package Monsters;

import java.util.HashMap;

/**
 * @author Dominick Racela
 */

public class Kobold extends Monster {
    public Kobold(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        super(maxHP, xp, items);
    }

    @Override
    public String toString() {
        return "Monsters.Kobold has : " + super.toString();
    }
}
