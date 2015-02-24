package StudentTutorial;

import java.util.Collection;
import Tutorial.*;

/**
* A page is an individual topic within a tutorial.
*/
public abstract class StudentPage {
   Description description;
   CodeExample example;
   String tryItYourself;
   String textEditor;
   String console;

   RoadmapModule module;

   abstract void run();
   abstract void next();
   abstract void prev();

   //ChatToolbar chat;
}