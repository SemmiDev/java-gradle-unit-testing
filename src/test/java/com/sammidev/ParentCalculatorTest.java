package com.sammidev;

import com.sammidev.resolver.RandomParameterResolver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(value = RandomParameterResolver.class)
public abstract class ParentCalculatorTest {
    Calculator calculator;

    @BeforeEach
    void beforeEach() {
        System.out.println("OPEN");
    }
    @AfterEach
    void afterEach() {
        System.out.println("CLOSE");
    }
}

class RandomCalculatorTestChild extends ParentCalculatorTest {

    @Test
    void testRandom(Random random) {
        double a = random.nextDouble();
        double b = random.nextDouble();
        calculator = new Calculator(a,b);
        assertEquals(a*b, calculator.multiplication());
        System.out.println(a*b);
    }

    @Test
    void testRando2(Random random) {
        double a = random.nextDouble();
        double b = random.nextDouble();
        calculator = new Calculator(a,b);
        assertEquals(a/b, calculator.division());
        System.out.println(a/b);
    }
}