package Progress;

/**
 * Expandable list type that will be displayed in the left side bar.
 */
public abstract class List{
    private String name;
    
    /**
     * Adds a link to the list.
     */
    public abstract void addToList(String topic);
}
