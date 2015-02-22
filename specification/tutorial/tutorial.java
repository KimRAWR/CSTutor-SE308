package Tutorial;

import java.util.Collection;
//import chat.toolbar;

/**
 * A tutorial is the broad term for the general track that includes 
 * information about topics and is composed of either tutorial pages
 * or quizzes to assess information from the tutorial pages.
 */
public abstract class Tutorial {
   Collection<Page> tutorialPages;
   Collection<Page> quizzes;
}