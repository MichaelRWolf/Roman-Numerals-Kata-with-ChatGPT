import org.junit.Test;
import static org.junit.Assert.assertEquals;

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
}
