package Quiz;

import java.util.Collection;

/**
 * A page has a list of questions, the number of the questions, and the last 
 * page of questions will have hasSubmit to be true. This indicates that this
 * page has a submit button for people to turn in their quiz.
 */
public abstract class Page{
   //consists of a set of questions
   Collection<Questions> question;
   //shows how many questions there are
   int amtQuestions;
   //a value that indicates whether the page has a submit button or not
   boolean hasSubmit;
     
}
