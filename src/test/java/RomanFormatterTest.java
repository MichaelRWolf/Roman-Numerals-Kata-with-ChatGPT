import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RomanFormatterTest {

    // Test method for Roman numeral to Arabic number conversion
    @Test
    public void testRomanToArabic_basic() {
        RomanFormatter formatter = new RomanFormatter();
        int result = formatter.romanToArabic("I");
        assertEquals(1, result);
    }

    // Add more test methods here for additional cases
}
