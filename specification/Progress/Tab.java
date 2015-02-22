package Progress;

import java.util.Collection;
/**
 * A sub-section of the left side bar that contains expandable lists.
 */  
public abstract class Tab
{
    private String title;
    private Collection<List> expandableLists;

    /**
      * Adds an expandable list to list collection, which is sorted
      * alphabetically.
      * @param   l  expandable list to be displayed
      */
    public abstract void addList(List l);
}
