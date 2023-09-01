public class RomanFormatter {

    // Arabic number to Roman numeral conversion method using recursion
    public String arabicToRoman(int arabicNumber) {
        if (arabicNumber >= 1000) {
            return "M" + arabicToRoman(arabicNumber - 1000);
        }
        return ""; // Placeholder for handling other cases
    }
}
