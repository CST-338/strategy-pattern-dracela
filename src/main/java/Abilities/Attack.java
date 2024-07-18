package Abilities;

import Monsters.Monster;

/**
 * @author Dominick Racela
 */

public interface Attack extends Ability {
    public abstract Integer attack(Monster attacker);
}
