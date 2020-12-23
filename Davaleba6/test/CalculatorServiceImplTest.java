import com.edu.btu.CalculatorServiceImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorServiceImplTest {

    @Test
    public void Test_Sum() {
        CalculatorServiceImpl calculator = new CalculatorServiceImpl();
        assertEquals(25, calculator.sum(10, 15));
    }

    @Test
    public void Test_Prod() {
        CalculatorServiceImpl calculator = new CalculatorServiceImpl();
        assertEquals(150, calculator.prod(10, 15));
    }

}

// 5.30 მაკლია ზღვარზე და იმედია საკმარის იიქნება ეს დავალება