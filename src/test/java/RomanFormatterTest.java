import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RomanFormatterTest {

    // Test method for Arabic number 1000 mapping to "M"
    @Test
    public void testArabicToRoman_thousand() {
        RomanFormatter formatter = new RomanFormatter();
        String result = formatter.arabicToRoman(1000);
        assertEquals("M", result);
    }

    // Test method for Arabic number 2000 mapping to "MM"
    @Test
    public void testArabicToRoman_two_thousand() {
        RomanFormatter formatter = new RomanFormatter();
        String result = formatter.arabicToRoman(2000);
        assertEquals("MM", result);
    }

    // Test method for Arabic number 100 mapping to "C"
    @Test
    public void testArabicToRoman_hundred() {
        RomanFormatter formatter = new RomanFormatter();
        String result = formatter.arabicToRoman(100);
        assertEquals("C", result);
    }

    // Test method for Arabic number 10 mapping to "X"
    @Test
    public void testArabicToRoman_ten() {
        RomanFormatter formatter = new RomanFormatter();
        String result = formatter.arabicToRoman(10);
        assertEquals("X", result);
    }

    // Test method for Arabic number 5 mapping to "V"
    @Test
    public void testArabicToRoman_five() {
        RomanFormatter formatter = new RomanFormatter();
        String result = formatter.arabicToRoman(5);
        assertEquals("V", result);
    }

    // Test method for Arabic number 50 mapping to "L"
    @Test
    public void testArabicToRoman_fifty() {
        RomanFormatter formatter = new RomanFormatter();
        String result = formatter.arabicToRoman(50);
        assertEquals("L", result);
    }

    // Add more test methods here for additional cases

    // Test method for Arabic number out of bounds
    @Test
    public void testArabicToRoman_outOfBounds() {
        RomanFormatter formatter = new RomanFormatter();
        assertThrows(IllegalArgumentException.class, () -> formatter.arabicToRoman(4000));
    }

    @Test
    public void testInterestingValues() {
        RomanFormatter formatter = new RomanFormatter();
        assertEquals("MCMXC", formatter.arabicToRoman(1990));
        assertEquals("MMXIV", formatter.arabicToRoman(2014));
        assertEquals("MMCMXCIV", formatter.arabicToRoman(2994));
        assertEquals("XLII", formatter.arabicToRoman(42));
        assertEquals("CCCLXXXVIII", formatter.arabicToRoman(388));
        assertEquals("DCLXVI", formatter.arabicToRoman(666));
        assertEquals("CMXCIX", formatter.arabicToRoman(999));
        assertEquals("DCCCXC", formatter.arabicToRoman(890));
        assertEquals("CM", formatter.arabicToRoman(900));
    }
}