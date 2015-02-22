package Manager;
import java.util.Collection;

/**
 * Represents a section of a class. Each section contains some students from
 * the class. Each section also has a professor. Like classes, they may have
 * their own units and tutorials, but also have access to the overall class'
 * units and tutorials.
 *
 * Derived from section 2.2.
 */
public abstract class Section {
   private Collection<User> students;
   private Collection<Unit> units;
   private Collection<Tutorial> tutorials;
   private User professor;
   private Class parent;

   /**
    * AddTutorial adds the specified tutorial to the section
    */ 
   abstract void addTutorial(Tutorial tutorial);

   /**
    * RemoveTutorial removes the specified tutorial removes the section
    * if it is in the section.
    */ 
   abstract void removeTutorial(Tutorial tutorial);

   /**
    * AddUnit adds the specified unit to the section
    */ 
   abstract void addUnit(Unit unit);

   /**
    * RemoveUnit removes the specified unit from the section, if it exists
    */ 
   abstract void removeUnit(Unit unit);

   /**
    * AddStudent adds the specified student to the section
    */
   abstract void addStudent(User student);

   /**
    * RemoveStudent removes the specified student from the section if
    * the student is in the section.
    */
   abstract void removeStudent(User student);

   /**
    * ChangeProfessor changes the professor of the section
    */
   abstract void changeProfessor(User professor);
}
