package emmanes.goals;

import emmanes.game.Player;

public interface Goal {
    //TODO: Implement Goal observer.
    public boolean isFulfilled(Player player);
}
