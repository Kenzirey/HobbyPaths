package emmanes.game;

import java.util.Collection;
import java.util.Map;

/**
 * A collection of passages.
 */
public class Story {
    private String title;
    private Map<Link, Passage> passages;
    private Passage openingPassage;

    public Story(String title, Passage openinPassage) {
        this.setTitle(title);
        //TODO: Implement Story constructor methods
    }

    private void setTitle(String title) {
        if ((title == null) || (title.isBlank())) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        this.title = title;
    }

    /**
     * Returns the title of the story.
     *
     * @return title the title of the story.
     */
    public String getTitle() {
        return title;
    }
    
    /**
     * Returns the opening passage of the story.
     *
     * @return openingPassage the opening passage of the story.
     */
    public Passage getOpeningPassage() {
        return openingPassage;
    }

    /**
     * Adds a passage to the story's passages.
     *
     * @param passage the passage being added to the story.
     */
    public void addPassage(Passage passage) {
        //We only care about the title of the passage.
        Link link = new Link(passage.getTitle(), passage.getTitle());
        this.passages.put(link, passage);
    }

    /**
     * Returns the passage that a link points to.
     *
     * @param link the link that points to the passage.
     *
     * @return passages the passage the link points to.
     */
    public Passage getPassage(Link link) {
        if (link == null) {
            throw new IllegalArgumentException("Link cannot be null");
        }
        return this.passages.get(link);
    }

    /**
     * Returns all the passages in the story.
     *
     * @return passages the passages in the story.
     */
    public Collection<Passage> getPassages() {
        return this.passages.values();
    }

}
