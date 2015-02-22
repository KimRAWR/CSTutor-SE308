package Quiz;

import java.util.Collection;

/**
 * A studentQuiz is a sample quiz taken by the student. It has a set of pages  
 * of questions to be answered by the student. Once the student finishes the
 * set of questions, isSubmited become true indicating the student has finished
 * the quiz
 */
public abstract class StudentQuiz {

    /**
     *
     */
    abstract void turninQuiz();
    //consist of a set of pages of questions
    Collection<Page> quizquestions;
    //checks to see whether the quiz has been submited
    boolean isSubmited;
}