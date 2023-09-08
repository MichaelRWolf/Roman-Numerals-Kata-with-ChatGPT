import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

public class RomanFormatter {
    private static final Deque<Map.Entry<Integer, String>> arabicToRomanPairs = createArabicToRomanPairs();

    private static Deque<Map.Entry<Integer, String>> createArabicToRomanPairs() {

        // Initialize a deque with pairs of Arabic numerals and their corresponding Roman numerals
        Deque<Map.Entry<Integer, String>> pairs = new ArrayDeque<>();
        pairs.add(Map.entry(1000, "M"));
        pairs.add(Map.entry(900, "CM"));
        pairs.add(Map.entry(500, "D"));
        pairs.add(Map.entry(400, "CD"));
        pairs.add(Map.entry(100, "C"));
        pairs.add(Map.entry(90, "XC"));
        pairs.add(Map.entry(50, "L"));
        pairs.add(Map.entry(40, "XL"));
        pairs.add(Map.entry(10, "X"));
        pairs.add(Map.entry(9, "IX"));
        pairs.add(Map.entry(5, "V"));
        pairs.add(Map.entry(4, "IV"));
        pairs.add(Map.entry(1, "I"));
        return pairs;
    }

    public String arabicToRoman(int arabicNumber) {
        if (isBeyondBounds(arabicNumber)) {
            throw new IllegalArgumentException("Input is out of bounds. Must be between 1 and 3999.");
        }
        StringBuilder result = new StringBuilder();
        while (arabicNumber > 0) {
            Map.Entry<Integer, String> pair = arabicToRomanPairs.peek();
            int arabic = pair.getKey();
            String roman = pair.getValue();
            if (arabicNumber >= arabic) {
                result.append(roman);
                arabicNumber -= arabic;
            } else {
                arabicToRomanPairs.pop();
            }
        }
        return result.toString();
    }

    private boolean isBeyondBounds(int arabicNumber) {
        return arabicNumber < 1 || arabicNumber > 3999;
    }
}
