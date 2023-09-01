package emmanes.game;

import java.util.List;

/**
 * A smaller segment of the game's story.
 */
public class Passage {

    private String title;
    private String content;
    private List<Link> links;
    
    public Passage(String title, String content) {
        this.setTitle(title);
        this.setContent(content);
    }

    private void setTitle(String title) {
        if ((title == null) || (title.isBlank())) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        this.title = title;
    }

    private void setContent(String content) {
        if ((content == null) || (content.isBlank())) {
            throw new IllegalArgumentException("Content cannot be null or empty");
        }
        this.content = content;
    }

    /**
     * Returns the title (identificator) of the passage. 
     *
     * @return title returns the title (identificator) of the passage.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns the content of the passage.
     *
     * @return returns the content of the passage.
     */
    public String getContent() {
        return content;
    }

    /**
     * Adds a link if it is not null.
     *
     * @param link the link being added.
     *
     * @return success returns true if the link was added successfully.
     */
    public boolean addLink(Link link) {
        boolean success = false;

        if (link != null) {
            success = links.add(link);
        } else {
            throw new IllegalArgumentException("Link cannot be null");
        } 
        return success;
    }

    /**
     * Returns the list of existing links.
     *
     * @return links the list containing links.
     */
    public List<Link> getLinks() {
        return links;
    }

    @Override
    public String toString() {
        return title + "\n" + content;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        //TODO: Studer uttrykket og lær syntaxen.
        hash = 31 * hash + (title == null ? 0 : title.hashCode());
        hash = 31 * hash + (content == null ? 0 : content.hashCode());
        return hash;
    }

    /**
     * Checks to see if links is empty or not.
     *
     * @return links returns true if links is not empty.
     */
    public boolean hasLinks() {
        return !links.isEmpty();
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Passage type) {
            return title.equals(type.getTitle()) && content.equals(type.getContent());
          } else {
            return false;
          }
    }



}
