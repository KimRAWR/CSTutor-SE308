package Manager;
import java.util.Collection;

/**
 * Derived from section 2.2
 *
 * A tutorial is a collection of information pages and quizzes. Multiple
 * pages make up a tutorial. A tutorial can be part of a larger unit.
 */
public abstract class Tutorial {
   private Collection<Page> pages;
   /**
    * AddPage adds the given page to the collection
    */
   abstract void addPage(Page page);

   /**
    * RemovePage removes the page from the collection, if it exists.
    */
   abstract void removePage(Page page);
}
