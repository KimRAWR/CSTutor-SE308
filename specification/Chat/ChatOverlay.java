package Chat;

/**
 * ChatOverlay is a class that will encompass the overlay bar at the bottom of our application.
 * It will house data such as the ChatWindow, and will have methods that show and hide the window, respectively.
 */

abstract class ChatOverlay{
    ChatWindow chatWindow;
    Boolean isShowing;

    /**
     * showWindow will pop the window out if isShowing is false
     */
    abstract void showWindow();

    /**
     * hideWindow will minimize the ChatWindow if isShowing is true;
     */
    abstract void hideWindow();
}
