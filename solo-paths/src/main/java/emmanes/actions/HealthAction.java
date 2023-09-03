package emmanes.actions;

import emmanes.game.Player;

public class HealthAction implements Action { 

    private int health;

    public HealthAction(int health) {
        this.setHealth(health);
    }

    public void execute(Player player) {
        player.addHealth(health);
    }

    private void setHealth(int health) {
        if (health <= 0) {
            throw new IllegalArgumentException("Health cannot be negative");
        } else {
            this.health = health;
        }
    }
    
}
