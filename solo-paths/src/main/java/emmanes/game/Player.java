package emmanes.game;

import java.util.List;

public class Player {
    private String name;
    private int health;
    private int armor;
    private int score;
    private int gold;
    private List<String> inventory;

    public Player(String name, int health, int armor,
                    int score, int gold) {
        this.setName(name);
        this.setHealth(health);
        this.setArmor(armor);
        this.setScore(score);
        this.setGold(gold);
        //TODO: Implement inventory.
    }

    /**
     * Adds an item to the player's inventory.
     *
     * @param item the item being added to the player's inventory.
     */
    public void addToInventory(String item) {
        if ((item == null) || (item.isBlank())) {
            throw new IllegalArgumentException("Item cannot be null or empty");
        }
        this.inventory.add(item);
    }

    /**
     * Adds health to the player.
     *
     * @param health the health being added to the player.
     */
    public void addHealth(int health) {
        if (health < 0) {
            throw new IllegalArgumentException("Health cannot be negative");
        } if (health >= 300) {
            throw new IllegalArgumentException("Health cannot be higher than 300");
        } else {
            this.health += health;
        }
    }

    /**
     * Adds armor to the player.
     *
     * @param armor the armor being added to the player.
     */
    public void addArmor(int armor) {
        if (armor < 0) {
            throw new IllegalArgumentException("Armor cannot be negative");
        } if (armor >= 300) {
            throw new IllegalArgumentException("Armor cannot be higher than 300");
        } else {
            this.armor += armor;
        }
    }

    /**
     * Adds score to the player.
     *
     * @param score the score being added to the player.
     */
    public void addScore(int score) {
        if (score < 0) {
            throw new IllegalArgumentException("Score cannot be negative");
        } if (score >= 300) {
            throw new IllegalArgumentException("Score cannot be higher than 300");
        } else {
            this.score += score;
        }
    }

    /**
     * Adds gold to the player.
     *
     * @param gold the gold being added to the player.
     */
    public void addGold(int gold) {
        if (gold < 0) {
            throw new IllegalArgumentException("Gold cannot be negative");
        } if (gold >= 300) {
            throw new IllegalArgumentException("Gold cannot be higher than 300");
        } else {
            this.gold += gold;
        }
    }

    private void setName(String name) {
        if ((name == null) || (name.isBlank())) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }

    private void setHealth(int health) {
        if (health <= 0) {
            this.health = 1;
        }
        this.health = health;
    }

    private void setArmor(int armor) {
        if (armor < 0) {
            throw new IllegalArgumentException("Armor cannot be negative");
        } else {
            this.armor = armor;
        }
    }

    private void setScore(int score) {
        if (score < 0) {
            throw new IllegalArgumentException("Score cannot be negative");
        } else {
            this.score = score;
        }
    }

    private void setGold(int gold) {
        if (gold < 0) {
            throw new IllegalArgumentException("Gold cannot be negative");
        } else {
            this.gold = gold;
        }
    }


    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getArmor() {
        return this.armor;
    }

    public int getScore() {
        return this.score;
    }

    public int getGold() {
        return this.gold;
    }

    public List<String> getInventory() {
        return this.inventory;
    }
}
