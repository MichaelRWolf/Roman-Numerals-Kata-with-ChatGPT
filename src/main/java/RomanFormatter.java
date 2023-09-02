import java.util.LinkedHashMap;
import java.util.Map;

public class RomanFormatter {

    private static final int MIN_ROMAN_VALUE = 0;
    private static final int MAX_ROMAN_VALUE = 3999;

    private static final Map<Integer, String> arabicToRomanMap = new LinkedHashMap<>();

    static {
        arabicToRomanMap.put(1000, "M");
        arabicToRomanMap.put(900, "CM");
        arabicToRomanMap.put(500, "D");
        arabicToRomanMap.put(400, "CD");
        arabicToRomanMap.put(100, "C");
        arabicToRomanMap.put(90, "XC");
        arabicToRomanMap.put(50, "L");
        arabicToRomanMap.put(40, "XL");
        arabicToRomanMap.put(10, "X");
        arabicToRomanMap.put(9, "IX");
        arabicToRomanMap.put(5, "V");
        arabicToRomanMap.put(4, "IV");
        arabicToRomanMap.put(1, "I");
    }

    public String arabicToRoman(int arabicNumber) {
        if (arabicNumber < MIN_ROMAN_VALUE || arabicNumber > MAX_ROMAN_VALUE) {
            throw new IllegalArgumentException("Input value out of bounds: " + arabicNumber);
        }

        Map.Entry<Integer, String> entry = arabicToRomanMap.entrySet().iterator().next();
        int arabic = entry.getKey();
        String roman = entry.getValue();

        if (arabicNumber == arabic) {
            return roman; // No need to recurse, we've found a match
        } else if (arabicNumber < arabic) {
            arabicToRomanMap.remove(arabic); // Remove the top element
            return arabicToRoman(arabicNumber); // Recurse on the same argument
        } else {
            return roman + arabicToRoman(arabicNumber - arabic); // Recurse with a decremented arabicNumber
        }
    }

    private boolean isWithinBounds(int number) {
        return number >= MIN_ROMAN_VALUE && number <= MAX_ROMAN_VALUE;
    }
}
