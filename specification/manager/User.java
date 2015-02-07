package manager;
import java.util.Collection;

/**
 * Each user has an access level associated with them.
 */
public abstract class User {
   String name;
   AccessLevel access;

   /**
    * Access level represents the level of access the user has.
    */
   enum AccessLevel {
      Guest, Student, Assistant, Professor
   }
}
