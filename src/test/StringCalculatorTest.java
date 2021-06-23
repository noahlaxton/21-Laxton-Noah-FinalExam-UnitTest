import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {

    @Test
    public void negativeNumberTest

    {
        StringCalculatorTest test = new StringCalculatorTest();
        assertThrows(IllegalArgumentException.class, () -> test.add("-1, 5"))
    }

    @Test
    public void over100Test

    {
        StringCalculatorTest test = new StringCalculatorTest();
        int actual = test.add("1001, 5");
        int expected = 5;
        assertEquals(actual, expected);
    }

}
