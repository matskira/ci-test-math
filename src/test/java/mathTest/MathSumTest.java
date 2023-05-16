package mathTest;

import br.com.devmpoda.math.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathSumTest {

    private Calculator calculator;

    @Test
    void testeSumIsEqualAPositiveNumber() {
        Assertions.assertEquals(2, Calculator.sum(1, 1));
    }

}
