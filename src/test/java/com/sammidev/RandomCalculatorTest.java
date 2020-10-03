package com.sammidev;

import com.sammidev.resolver.RandomParameterResolver;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(RandomParameterResolver.class)
public class RandomCalculatorTest {
    private Calculator calculator;

    @Test
    void testRandom(Random random) {
        double a = random.nextDouble();
        double b = random.nextDouble();
        assertEquals(a+b, new Calculator(a,b).adding());
    }
}
