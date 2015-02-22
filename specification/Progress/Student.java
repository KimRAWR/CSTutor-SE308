package Progress;

import java.util.Collection;

/**
 * A student object that contains the name of the student and other information.
 */

public abstract class Student {
	private String name;
	private Collection<Class> enrolledClasses;

   /**
    * Adds a class to the student's list of enrolled classes.
    * @param   cl  class to be added
    */
   public abstract void addClass(Class cl);
}
