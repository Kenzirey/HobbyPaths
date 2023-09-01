package emmanes.game;

public class Game {
    private Player player;
    private Story story;
    // goals

    public Game(Player player, Story story) {
        this.player = player;
        this.story = story;

        // TODO: Implement goals
    }

    public Player getPlayer() {
        return player;
    }

    public Story geStory() {
        return story;
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
