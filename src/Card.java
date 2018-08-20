import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Card {

    private static HashMap<String, Integer> alphabeticCardValue = new HashMap<>();
    private int intCardValue;

    static {
        alphabeticCardValue.put("J", 11);
        alphabeticCardValue.put("Q", 12);
        alphabeticCardValue.put("K", 13);
        alphabeticCardValue.put("A", 14);
    }

    public Card(String cardCode) throws IllegalArgumentException {

        String cardColor = cardCode.substring(0, 1).toUpperCase();
        String cardValue = cardCode.substring(1).toUpperCase();

        List<String> cardColors = Arrays.asList("S", "C", "D", "H");

        if (!cardColors.contains(cardColor))
            throw new IllegalArgumentException("card color isn't valid: " + cardColor);

        if (alphabeticCardValue.get(cardValue) == null) {
            // raises exception if cardValue is a letter, but not J/Q/K/A
            intCardValue = Integer.parseInt(cardValue);
            if (intCardValue > 10 || intCardValue < 2) throw new IllegalArgumentException("card number isn't valid: " + intCardValue);
        } else {
            intCardValue = alphabeticCardValue.get(cardCode.substring(1).toUpperCase());
        }
    }

    public int getValue() {
        return intCardValue;
    }
}
