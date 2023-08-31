package emmanes;

/**
 * A link between passages.
 */
public class Link {
    private String text;
    private String reference;

    public Link(String text, String reference) {
        this.text = text;
        this.reference = reference;
    }

    /**
     * Descriptive text indiciating a choice/action in the story.
     * 
     * @return text descriptive text indicating a choice/action in the story.
     */
    public String getText() {
        return text;
    }

    /**
     * The reference of the passage that this link points to.
     *
     * @return reference the reference of the passage that this link points to.
     */
    public String getReference() {
        return reference;
    }

    public String toString() {
        return "[" + text + "](" + reference + ")";
    }

    /**
     * Checks to see if two link objects are equal.
     * Overriden to remove link comparison problems, 
     * as the only thing that matters is the reference.
     */
    @Override
    public boolean equals(Object o) {
        if (object instanceof Link type) {
            return reference.equals(type.getReference());
          } else {
            return false;
          }
    }

    /**
     * Returns an integer value using hash formula.
     * Override to remove problems with Link fields not being used for comparison.
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (reference == null ? 0 : reference.hashCode());
        return hash;
    }

}

