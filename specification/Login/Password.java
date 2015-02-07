package Login;

/**
 * Password is a hash of the password that the user entered when registering. 
 * It is is derived from
 * <a href="../../requirements/functionalRequirements/login.html"> Section 2.6 
 * </a> the requirements.
 *
 * @author kylereis
 */
abstract class Password {
    String Hash;
    
    /**
     * Gets the hashed version of the password.
     * @return the hash of the password.
     */
    abstract String getPassword();
    
    /**
     * Hashes the password after first validating that the password meets length
     * and character requirements.
     * @param password The password that is trying to be set.
     * @return true if the password was valid and set.
     */
    abstract boolean setPassword(String password);
}
