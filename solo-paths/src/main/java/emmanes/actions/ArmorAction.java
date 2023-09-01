package emmanes.actions;

import emmanes.game.Player;

public class ArmorAction implements Action {
    private int armor;

    private void setArmor(int armor) {
        if (armor < 0) {
            throw new IllegalArgumentException("Armor cannot be negative");
        } else {
            this.armor = armor;
        }
    }

    public ArmorAction(int armor) {
        this.setArmor(armor);
    }

    public void execute(Player player) {
        player.addArmor(armor);
    }
}
