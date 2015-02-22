package Chat;

import java.util.*;

/**
 * The ChatWindow object is derived from an overall view of Sections 2.6.1 - 2.6.4 of the requirements.
 * The ChatWindow is the primary data object of the Chat Tool.
 *
 * The data components of the ChatWindow are a Console window for output, a text box for input, and a
 * collection of students to see who's online.
 */

public abstract class ChatWindow {
    Console chatOutput;
    TextBox textInput;
    Collection<Student> students;

    /**
     * Enter is a button that transfers the text from the text box from a given student and adds it to the
     * list in the console
     */

    abstract void Enter();
}
