package com.sammidev;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

import java.util.Random;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RepeatTest extends ParentCalculatorTest {

    @DisplayName("test calculator random")
    @RepeatedTest(
            value = 50,
            name  = "{displayName} ke {currentRepetition} dari {totalRepetitions}"
    )
    void testRand(Random random) {
        double a = random.nextDouble();
        double b = random.nextDouble();
        Calculator calculator = new Calculator(a, b);
        assertEquals(a+b, calculator.adding());
    }

    void testRandom(TestInfo testInfo, Random random) {
        double first = random.nextDouble();
        System.out.println(first);
        double second = random.nextDouble();
        System.out.println(second);

        Calculator calculator = new Calculator(first, second);
        double result = calculator.adding();
        assertEquals(first + second, result);
    }

    @DisplayName("Test calculator random")
    @RepeatedTest(
            value = 10,
            name = "{displayName} ke {currentRepetition} dari {totalRepetitions}"
    )
    void testRandomRepeated(Random random, RepetitionInfo repetitionInfo, TestInfo testInfo){
        double first = random.nextDouble();
        System.out.println(first);
        double second = random.nextDouble();
        System.out.println(second);

        Calculator calculator = new Calculator(first, second);
        double result = calculator.adding();
        assertEquals(first + second, result);
    }
}
