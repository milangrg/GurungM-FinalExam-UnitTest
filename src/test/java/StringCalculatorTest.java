import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

        import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {

    private StringCalculator test;

    @BeforeEach
    public void setUp() {
        test = new StringCalculator();
    }

    @AfterEach
    public void tearDown() {
        test = null;
    }

    @Test
    public void detectCapitalUseTest1() {
        myString.setString("USA");
        assertTrue(myString.detectCapitalUse());
    }

    @Test
    public void detectCapitalUseTest2() {
        myString.setString("FlaG");
        assertFalse(myString.detectCapitalUse());
    }

    @Test
    public void detectCapitalUseTest3() {
        myString.setString("softwareengineering");
        assertTrue(myString.detectCapitalUse());
    }

}
