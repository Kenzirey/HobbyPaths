package emmanes.actions;

import emmanes.game.Player;

public class GoldAction implements Action {
    private int gold;

    public GoldAction(int gold) {
        this.setGold(gold);
    }

    /**
     * Executes the gold action.
     */
    public void execute(Player player) {
        player.addGold(gold);
        
    }

    //TODO: Should I allow it to be negative, to count as losing gold action?
    private void setGold(int gold) {
        if (gold <= 0) {
            throw new IllegalArgumentException("Gold cannot be negative");
        }
        this.gold = gold;
    }
    
}
