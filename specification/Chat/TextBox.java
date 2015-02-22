package Chat;

/**
 * TextBox is an object that takes user inputted text and transfers to the data to the console.
 */


abstract class TextBox{
    String buffer;

    /**
     * pushText will take the text in the buffer, and push it to the console.
     */
     abstract void pushText();
}
