package com.sammidev;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("integration-test")
public class SampleTag {

    @Test
    @Tag("integ-a")
    void intergrationTest1() {
        System.out.println("INTERGRATION TEST 1");
        assertEquals(1,1);
    }

    @Test
    @Tag("integ-b")
    void intergrationTest2() {
        System.out.println("INTERGRATION TEST 2");
        assertEquals(1,1);
    }

    @Test
    @Tag("integ-c")
    void intergrationTest3() {
        System.out.println("INTERGRATION TEST 3");
        assertEquals(1,1);
    }
}