package manager;
import java.util.Collection;

/**
 * Represents a section of a class. Each section contains some pages.
 */
public abstract class Section {
   private Collection<User> students;
   private User professor;
   private Class parent;

   /**
    * Adds the student to the section
    */
   abstract void addStudent(User student);

   /**
    * Removes the student from the section
    */
   abstract void removeStudent(User student);

   /**
    * Changes the professor of the section
    */
   abstract void changeProfessor(User professor);
}
