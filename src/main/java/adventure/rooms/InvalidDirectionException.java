package adventure.rooms;

/**
 * A class to raise an exception when an Invalid Direction is encountered in this game
 */
public class InvalidDirectionException extends Exception
{
    public InvalidDirectionException(String message) {
        super(message);
    }
}
