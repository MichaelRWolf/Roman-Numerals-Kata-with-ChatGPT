import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;
import java.util.AbstractMap;

public class RomanFormatter {

    private static final Deque<Map.Entry<Integer, String>> arabicToRomanPairs = createArabicToRomanPairs();

    private static Deque<Map.Entry<Integer, String>> createArabicToRomanPairs() {
        Deque<Map.Entry<Integer, String>> pairs = new ArrayDeque<>();
        pairs.addLast(new AbstractMap.SimpleEntry<>(1000, "M"));
        pairs.addLast(new AbstractMap.SimpleEntry<>(900, "CM"));
        pairs.addLast(new AbstractMap.SimpleEntry<>(500, "D"));
        pairs.addLast(new AbstractMap.SimpleEntry<>(400, "CD"));
        pairs.addLast(new AbstractMap.SimpleEntry<>(100, "C"));
        pairs.addLast(new AbstractMap.SimpleEntry<>(90, "XC"));
        pairs.addLast(new AbstractMap.SimpleEntry<>(50, "L"));
        pairs.addLast(new AbstractMap.SimpleEntry<>(40, "XL"));
        pairs.addLast(new AbstractMap.SimpleEntry<>(10, "X"));
        pairs.addLast(new AbstractMap.SimpleEntry<>(9, "IX"));
        pairs.addLast(new AbstractMap.SimpleEntry<>(5, "V"));
        pairs.addLast(new AbstractMap.SimpleEntry<>(4, "IV"));
        pairs.addLast(new AbstractMap.SimpleEntry<>(1, "I"));
        return pairs;
    }

    public String arabicToRoman(int arabicNumber) {
        if (isBeyondBounds(arabicNumber)) {
            throw new IllegalArgumentException("Value is out of bounds. Must be between 1 and 3999.");
        }

        return arabicToRomanRecursive(arabicNumber, new ArrayDeque<>(arabicToRomanPairs));
    }

    private String arabicToRomanRecursive(int arabicNumber, Deque<Map.Entry<Integer, String>> pairs) {
        if (arabicNumber == 0) {
            return "";
        }

        Map.Entry<Integer, String> pair = pairs.peek();

        if (arabicNumber == pair.getKey()) {
            return pair.getValue();
        } else if (arabicNumber > pair.getKey()) {
            return pair.getValue() + arabicToRomanRecursive(arabicNumber - pair.getKey(), pairs);
        } else {
            pairs.pop();
            return arabicToRomanRecursive(arabicNumber, pairs);
        }
    }

    private boolean isBeyondBounds(int arabicNumber) {
        return arabicNumber < 1 || arabicNumber > 3999;
    }
}
