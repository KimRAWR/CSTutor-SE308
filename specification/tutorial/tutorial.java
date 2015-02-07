package tutorial;

import java.util.Collection;
//import chat.toolbar;

/**
 * A tutorial is the broad term for the general track that includes 
 * information about topics and is composed of either tutorial pages
 * or quizzes to assess information from the tutorial pages.
 */
abstract class Tutorial {
   Collection<Page> tutorialPages;
   Collection<Page> quizzes;
}

/**
* A page is an individual topic within a tutorial.
*/
abstract class Page {
   Description description;
   CodeExample example;
   String tryItYourself;
   String textEditor;
   String console;

   Collection<EditTextButtons> toolbar;

   abstract void run();
   abstract void save();
   abstract void preview();

   //ChatToolbar chat;
}

/**
 * The description is intended for the author to include any background 
 * information about the topic at hand.
 */
abstract class Description {
   String intro;
   String syntax;
}

/**
 * The code example is for the author to show how the topic is used. 
 */
abstract class CodeExample {
   String code;
   String output;
}

/**
 * EditTextButtons comprise the toolbar that gives the authors or editors the
 * ability to format text within any of the text input fields.
 */
abstract class EditTextButtons {
   String fontStyle;
   boolean isBold;
   boolean isItalicized;
   boolean isUnderlined;
   int fontSize;

   enum FontColor {
      black, red, orange, yellow, green, blue, purple;
   }
}
