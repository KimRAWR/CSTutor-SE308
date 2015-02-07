package manager;
import java.util.Collection;

/**
 * The Manager object is based on section 2.2 of the requirements. 
 * The manager contains a collection of classes, each of which contains content.
 *
 */
public abstract class Manager {
   Collection<Class> data;
   Class currentSelection;
   /**
    * CreateClass creates a new class object with the given name, 
    * if a class with that name does not already exist.
    */
   abstract void createClass(String className);

   /**
   * createSection creates a section in the currently selected class.
   */
   abstract void createSection(String sectionName, User professor);

   /**
   * Gets the page from the editor and inserts it in the correct section.
   */
   abstract void createPage(Page page, Tutorial under);

   /**
    * Removes the page from the tutorial, searching for it.
    */
   abstract void removePage(Page page);

   /**
    * Removes the section from the class
    */
   abstract void removeSection(Section section);

   /**
    * Removes the section from the class
    */
   abstract void removeClass(Class classChoice);
   
   /**
    * Moves the page into another section
    */
   abstract void movePage(Page page, Tutorial newTutorial);


}
