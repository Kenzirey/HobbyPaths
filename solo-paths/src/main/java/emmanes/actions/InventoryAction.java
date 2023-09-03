package emmanes.actions;

import emmanes.game.Player;

public class InventoryAction implements Action {
    private String item;


    /**
     * Executes the inventory action.
     */
    public void execute(Player player) {
        player.addToInventory(item);
    }

    public InventoryAction(String item) {
        this.setItem(item);
    }

    private void setItem(String item) {
        if ((item == null) || item.isBlank()) {
            throw new IllegalArgumentException("Item cannot be null or empty");
        } else {
            this.item = item;
        }
    }

    
}
