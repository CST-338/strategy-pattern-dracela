package Monsters;

import java.util.HashMap;
import java.util.Objects;
import java.util.Random;

import Abilities.Attack;

/**
 * @author Dominick Racela
 */

public abstract class Monster {
    private Integer hp;
    private Integer xp;
    private Integer maxHP;
    private HashMap<String, Integer> items;
    Integer agility = 10;
    Integer defense = 10;
    Integer strength = 10;
    Attack attack;

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getXp() {
        return xp;
    }

    public HashMap<String, Integer> getItems() {
        return items;
    }

    public void setItems(HashMap<String, Integer> items) {
        this.items = items;
    }

    public Integer getMaxHP() {
        return maxHP;
    }

    public Integer getAgility() {
        return agility;
    }

    public Integer getDefense() {
        return defense;
    }

    public Integer getStrength() {
        return strength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monster monster = (Monster) o;
        return Objects.equals(getHp(), monster.getHp()) && Objects.equals(getXp(), monster.getXp()) && Objects.equals(getMaxHP(), monster.getMaxHP()) && Objects.equals(getItems(), monster.getItems());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHp(), getXp(), getMaxHP(), getItems());
    }

    public Monster(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        this.maxHP = maxHP;
        hp = this.maxHP;
        this.xp = xp;
        this.items = items;
    }

    Integer getAttribute(Integer min, Integer max) {
        Random rand = new Random();
        if (min > max) {
            Integer temp = min;
            min = max;
            max = temp;
        }
        return rand.nextInt(max-min) + min;
    }

    boolean takeDamage(Integer damage) {
        if (damage > 0) {
            this.setHp(this.getHp() - damage);
            System.out.println("The creature was hit for " + damage + " damage");
        }
        if (this.getHp() > 0) {
            System.out.println(this.toString());
            return true;
        } else {
            System.out.println("Oh no! The creature has perished");
            return false;
        }
    }

    /**
     * TODO: attackTarget
     * @param target
     * @return
     */
    public Integer attackTarget(Monster target) {
        target.takeDamage(attack(target));
    }

    @Override
    public String toString() {
        return "hp=" + hp + "/" + maxHP;
    }
}
