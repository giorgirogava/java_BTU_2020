import Practical_5.CalculatorServiceImpl;
import junit.CurrencyService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorServiceTest {


    CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    @Test
    public void sumTest() {
        assertEquals(11, calculatorService.sum(7, 4), 1);
    }


    @Test
    public void prodTest() {
        assertEquals(60.0, calculatorService.prod(12, 5), 1);
    }

}
