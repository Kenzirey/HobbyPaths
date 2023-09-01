package emmanes.actions;

import emmanes.game.Player;

/**
 * An action representing change of the player's state.
 */
public interface Action {
    //TODO: implement Player Observer.
    public void execute(Player player);
}
