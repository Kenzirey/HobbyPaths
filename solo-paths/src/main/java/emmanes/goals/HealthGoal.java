package emmanes.goals;

import emmanes.game.Player;

/**
 * Adds a minimum health goal.
 */
public class HealthGoal implements Goal {
    private int minimumHealth;

    @Override
    public boolean isFulfilled(Player player) {
        return player.getHealth() >= this.minimumHealth;
    }

    /**
     * Adds a health goal.
     *
     * @param health the health of the goal.
     */
    public HealthGoal(int health) {
        this.setMinimumHealth(health);
    }

    private void setMinimumHealth(int health) {
        if (health < 0) {
            throw new IllegalArgumentException("Minimum health must be positive");
        } else {
            this.minimumHealth = health;
        }
    }

}
