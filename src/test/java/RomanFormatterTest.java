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

    // Add more test methods here for additional cases
}
