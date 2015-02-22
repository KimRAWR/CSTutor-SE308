package Manager;
import java.util.Collection;

/**
 * The Manager object is based on section 2.2 of the requirements. 
 * 
 * The manager contains a collection of classes. The selectedClass is the
 * currently selected class, and the selectedSection is the currently selected
 * section within that class.
 */
public abstract class Manager {
   Collection<Class> data;
   Class selectedClass;
   Section selectedSection;

   /**
    * SelectSection sets the selectedSection to the given section, if it
    * is within the selectedClass.
    */
   abstract void selectSection(Section select);
   /**
    * SelectClass sets the selectedClass to the given class, if it exists.
    */ 
   abstract void selectClass(Class select);
   /**
    * CreateClass creates a new class object with the given name, 
    * if a class with that name does not already exist.
    */
   abstract void createClass(String className);

   /**
   * createSection creates a section in the currently selected class with
   * the given professor, if a class is selected.
   */
   abstract void createSection(String sectionName, User professor);

   /**
   * Adds the given page to the given tutorial, if the tutorial exists.
   */
   abstract void createPage(Page page, Tutorial under);

   /**
    * RemovePage removes the given page, if it exists.
    */
   abstract void removePage(Page page);

   /**
    * RemoveSection removes the currently selected section.
    */
   abstract void removeSection();

   /**
    * RemoveClass removes the currently selected class
    */
   abstract void removeClass();
   
   /**
    * MovePage moves the given page into the given tutorial, if it exists.
    */
   abstract void movePage(Page page, Tutorial newTutorial);

   /**
    * AddUnit adds the given unit to the selected section.
    */ 
   abstract void addUnit(Unit unit);

   /**
    * RemoveUnit removes the given unit from the selected section, if it
    * exists.
    */ 
   abstract void removeUnit(Unit unit);

   /**
    * MoveTutorial moves the given tutorial to the given unit if it exists, 
    * or into the currently selected section, if unit is null.
    */
   abstract void moveTutorial(Tutorial tutorial, Unit newUnit);
}
