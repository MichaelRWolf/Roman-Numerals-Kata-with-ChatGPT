public class RomanFormatter {

    // Arabic number to Roman numeral conversion method using recursion
    public String arabicToRoman(int arabicNumber) {
        if (arabicNumber >= 1000) {
            return "M" + arabicToRoman(arabicNumber - 1000);
        } else if (arabicNumber >= 500) {
            return "D" + arabicToRoman(arabicNumber - 500);
        } else if (arabicNumber >= 100) {
            return "C" + arabicToRoman(arabicNumber - 100);
        } else if (arabicNumber >= 10) {
            return "X" + arabicToRoman(arabicNumber - 10);
        } else if (arabicNumber >= 5) {
            return "V" + arabicToRoman(arabicNumber - 5);
        }
        return ""; // Placeholder for handling other cases
    }
}
