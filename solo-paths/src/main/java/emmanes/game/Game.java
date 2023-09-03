package emmanes.game;

import java.util.ArrayList;
import java.util.List;

import emmanes.goals.Goal;

/**
 * Connects a player to a story.
 */
public class Game {
    private Player player;
    private Story story;
    private List<Goal> goals;

    public Game(Player player, Story story, List<Goal> goals) {
        //TODO: Create set methods for player, story and goals.
        this.player = player;
        this.story = story;

        this.goals = new ArrayList<>();
    }

    public Player getPlayer() {
        return player;
    }

    public Story geStory() {
        return story;
    }

    public List<Goal> getGoals() {
        return this.goals;
    }

    /**
     * Returns the opening passage of the story.
     *
     * @return openingPassage the opening passage of the story.
     */
    public Passage begin() {
        return story.getOpeningPassage();
    }

    /**
     * Returns the passage that the link points to.
     *
     * @param link the link pointing to a passage.
     *
     * @return passage the passage that matches the link.
     */
    public Passage go(Link link) {
        if (link == null) {
            throw new IllegalArgumentException("Link cannot be null");
        }
        Passage passage = story.getPassage(link);
        if (passage == null) {
            throw new IllegalArgumentException("Link does not match a passage");
        }
        return passage;
    }
}
