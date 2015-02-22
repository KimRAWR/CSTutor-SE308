package Tutorial;

import java.util.Collection;

/**
* A page is an individual topic within a tutorial.
*/
public abstract class Page {
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