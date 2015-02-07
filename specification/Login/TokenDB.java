package Login;

import java.util.Collection;

/**
 * TokenDB holds all of the currently valid password reset tokens. 
 * It is is derived from
 * <a href="../../requirements/functionalRequirements/login.html"> Section 2.6 
 * </a> the requirements.
 *
 * @author kylereis
 */
abstract class TokenDB {
    Collection<String> tokens;
    
    /**
     * Adds a token to the collection of currently valid tokens.
     * @param token the token to be added.
     */
    abstract void addToken(String token);
    
    /**
     * Checks to make sure that the token is a currently valid token.
     * @param token the token to be checked.
     * @return true if token is a valid token.
     */
    abstract boolean isToken(String token);
    
    /**
     * Removes a token from the collection of tokens.
     * @param token the token to be removed.
     */
    abstract void removeToken(String token);
}
