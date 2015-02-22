package User;

import java.util.Collection;

/**
 * UserDB holds all of the registered users for cstutor. It is is derived from
 * <a href="../../requirements/functionalRequirements/login.html"> Section 2.6 
 * </a> the requirements.
 *
 * @author Kyle Reis
 */
public abstract class UserDB {
    Collection<User> users;
    
    /**
     * Adds the given user to the UserDB. Checks to make sure a user with the 
     * same email address doesn't already exist in the UserDB.
     * @param user The User to be added.
     */
    abstract void addUser(User user);
    
    /**
     * Gets a user from the UserDB based on the email address.
     * 
     * @param email The email address for the user that we want to find.
     * @return The user that has the given email or null if user doesn't exist.
     */
    abstract User getUser(String email);
}
