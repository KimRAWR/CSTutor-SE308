package Quiz;

import java.util.Collection;

/**
 * A studentQuiz is a sample quiz taken by the student. It has a set of pages  
 * of questions to be answered by the student. Once the student finishes the
 * set of questions, isSubmited become true indicating the student has finished
 * the quiz
 */
abstract class studentQuiz {
    Collection<Page> quizquestions;
    boolean isSubmited;
}
/**
 * A page has a list of questions, the number of the questions, and the last 
 * page of questions will have hasSubmit to be true. This indicates that this
 * page has a submit button for people to turn in their quiz.
 */
abstract class Page{
   Collection<Questions> question;
   int amtQuestions;
   boolean hasSubmit;
     
}

/**
 * A Question consist of a description of a question, number of question, and
 * a choice for the question.
 */
abstract class Questions{
   int questionNum;
   Description question;
   char answer;
}
/**
 * The description is meant for student to see what each question is about.
 */
abstract class Description
{
   String intro;
   String syntax;
}
/**
 * EditQuestion is a way for teachers to edit questions, with specific font and
 * size.
 */
abstract class EditQuestion{
   String fontStyle;
   int fontSize;
   String question;
 
}
/**
 * This advicepage allows teachers to give feedback on tutorial pages to review
 * as well as the questions that got wrong.
 */
abstract class AdvicePage
{
   String advice;
   Page pageToReview;
}
