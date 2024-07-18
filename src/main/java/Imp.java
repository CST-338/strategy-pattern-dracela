import java.util.HashMap;

/**
 * @author Dominick Racela
 */

public class Imp extends Monster{
    public Imp(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        super(maxHP, xp, items);
    }

    @Override
    public String toString() {
        return "Imp has : " + super.toString();
    }
}
