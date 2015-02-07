package manager;
import java.util.Collection;

/**
 * Represents a class. Each class contains some sections, if applicable.
 * Each class also contains tutorials.
 */
public abstract class Class {
   private Collection<Tutorial> tutorials;
   private Collection<Section> sections;
   private Collection<User> students;
   private ClassAccessLevel access;
   /**
    * Adds the section to the collection.
    */
   abstract void addSection(Section section);

   /**
    * Removes the section from the collection.
    */
   abstract void removeSection(Section section);

   /**
    * Removes the tutorial from the class.
    */
   abstract void removeTutorial(Tutorial tutorial);

   /**
    * Adds the tutorial to the class.
    */
   abstract void addTutorial(Tutorial tutorial);

   /**
    * Removes the student from the class.
    */
   abstract void removeStudent(Student student);

   /**
    * Adds the student to the class.
    */
   abstract void addStudent(Student student);

   /**
    * Changes the access level in the class
    */
   abstract void changeAccessLevel(ClassAcessLevel newAccess);

   /** 
    * Represents the mimimum level to see tutorials in the class
    */
   enum ClassAccessLevel {
      Guest, Student, Assistant, Professor
   }
}
