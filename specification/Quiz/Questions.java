package Quiz;

/**
 * A Question consist of a description of a question, number of question, and
 * a choice for the question.
 */
public abstract class Questions{
   // Indicate what number the question is
   int questionNum;
   // Gives a description of what the questions request for
   Description question;
   // multiple choices for the question
   char[] answer;
}
