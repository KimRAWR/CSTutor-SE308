package AuthorTutorial;

import java.util.Collection;
import Tutorial.*;

/**
* An AuthorPage is the author's representation of what a page element 
* consists of.
*/
public abstract class AuthorPage {
   Description description;
   CodeExample example;
   String tryItYourself;

   EditTextButtons toolbar;

   abstract void save();
   abstract void preview();

   //ChatToolbar chat;
}