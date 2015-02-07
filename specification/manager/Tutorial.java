package manager;
import java.util.Collection;

/**
 * Represents a tutorial. Each tutorial contains some pages
 */
public abstract class Tutorial {
   private Collection<Page> pages;
   /**
    * Adds the page to the collection
    */
   abstract void addPage(Page page);

   /**
    * Removes the page from the collection
    */
   abstract void removeSection(Page page);
}
