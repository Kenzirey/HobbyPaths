package emmanes.actions;

import emmanes.game.Player;

public class ScoreAction implements Action {
    private int score;

    public ScoreAction(int score) {
        this.setScore(score);
    }

    private void setScore(int score) {
        if (score < 0) {
            throw new IllegalArgumentException("Score cannot be negative");
        } else {
            this.score = score;
        }
    }

    /**
     * Executes the score action.
     */
    public void execute(Player player) {
        player.addScore(score);
    }

}
