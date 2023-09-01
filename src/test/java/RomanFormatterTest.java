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

    // Add more test methods here for additional cases
}
