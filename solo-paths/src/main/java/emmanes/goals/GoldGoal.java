package emmanes.goals;

import emmanes.game.Player;

/**
 * A goal representing a minimum amount of gold.
 */
public class GoldGoal implements Goal {
    private int minimumGold;

    @Override
    public boolean isFulfilled(Player player) {
        return player.getGold() >= this.minimumGold;
    }

    /**
     * Adds a minimum gold goal.
     *
     * @param gold the minimum gold of the goal.
     */
    public GoldGoal(int gold) {
        this.setMinimumGold(gold);
    }

    private void setMinimumGold(int gold) {
        if (gold < 0) {
            throw new IllegalArgumentException("Gold must be positive");
        }
        this.minimumGold = gold;
    }
    
}
