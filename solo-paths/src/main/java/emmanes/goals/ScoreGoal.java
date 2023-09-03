package emmanes.goals;

import emmanes.game.Player;

/**
 * A goal that is fulfilled when the player's score reaches a certain value.
 */
public class ScoreGoal implements Goal {
    private int minimumScore;

    @Override
    public boolean isFulfilled(Player player) {
        return player.getScore() >= this.minimumScore;
    }

    /**
     * Creates a new score goal.
     * 
     * @param minimumScore the minimum score for the goal.
     */
    public ScoreGoal(int minimumScore) {
        this.setMinimumScore(minimumScore);
    }

    private void setMinimumScore(int minimumScore) {
        if (minimumScore < 0) {
            throw new IllegalArgumentException("Minimum score must be positive");
        } else {
            this.minimumScore = minimumScore;
        }
    }






    
}
