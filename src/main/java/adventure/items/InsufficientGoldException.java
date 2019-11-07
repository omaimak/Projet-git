package adventure.items;

/**
 * A class to implement an exception when a player has insufficient gold to use a
 * OneArmedBandit item
 */
public class InsufficientGoldException extends Exception
{
    public InsufficientGoldException(String message) {
        super(message);
    }
}