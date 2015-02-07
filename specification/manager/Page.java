package manager;
import java.util.Collection;

/**
 * Each Page is either a page in the tutorial or a quiz. However, they are treated the same
 * way by the manager, as they are part of a Tutorial.
 */
public abstract class Page {
   String name;
}
