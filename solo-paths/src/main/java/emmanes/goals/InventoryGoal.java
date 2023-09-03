package emmanes.goals;

import java.util.ArrayList;
import java.util.List;
import emmanes.game.Player;

/**
 * A goal of mandatory items.
 */
public class InventoryGoal implements Goal {
    private List<String> mandatoryItems;

    @Override
    public boolean isFulfilled(Player player) {
        if (player == null) {
            throw new IllegalArgumentException("Player is null");
        }

        for (String item : mandatoryItems) {
            if (!player.getInventory().contains(item)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Creates a goal of mandatory items.
     *
     * @param mandatoryItems the mandatory items required for the goal.
     */
    public InventoryGoal(List<String> mandatoryItems) {
        if ((mandatoryItems == null) || mandatoryItems.isEmpty()) {
            throw new IllegalArgumentException("mandatory items cannot be empty.");
        }
        this.mandatoryItems = new ArrayList<>();
        this.setInventoryGoal(mandatoryItems);
    }

    /**
     * Adds mandatory items to the inventory goal.
     *
     * @param mandatoryItems the mandatory items being added to the goal.
     */
    public void setInventoryGoal(List<String> mandatoryItems) {
        mandatoryItems.stream()
                .filter(item -> item != null && !item.isBlank())
                .forEach(item -> this.mandatoryItems.add(item));
    }

}
