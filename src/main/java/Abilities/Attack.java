package Abilities;

import Monsters.Monster;

/**
 * @author Dominick Racela
 * Date: 30JUL2024
 */

public interface Attack extends Ability {

  public abstract Integer attack(Monster attacker);
}
