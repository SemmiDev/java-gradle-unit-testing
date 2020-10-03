package com.sammidev;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.DisplayName;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RandomCalculatorTest2 extends ParentCalculatorTest{

    static int add(int a, int b) {
        return a + b;
    }

    @DisplayName("test calculator with parameter")
    @ParameterizedTest(name = "{displayName} with data {0}")
    @ValueSource(ints = {1,2,3,4,5})
    void testWithParameter(int value) {
        int result = value + value;
        System.out.println(result);
        assertEquals(result, add(value,value));
    }

    static List<Integer> parameterSource() {
        return Arrays.asList(1,2,3,4,5);
    }

    @ParameterizedTest
    @MethodSource(value = {"parameterSource"})
    void testWithMethodSource(int value) {
        System.out.println(add(value,value));
        assertEquals(value + value, add(value,value));
    }
}