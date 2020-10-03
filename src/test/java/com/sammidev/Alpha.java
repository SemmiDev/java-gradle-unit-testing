package com.sammidev;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.MethodOrderer.*;

@TestMethodOrder(Alphanumeric.class)
public class Alpha {

    @Test
    void testA() {
        assertEquals(1+1, 2);
    }

    @Test
    void testB() {
        assertEquals(1+1, 2);
    }

    @Test
    void testC() {
        assertEquals(1+1, 2);
    }
}

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Orderr {

    @Test
    void test0() {
        assertEquals(1+1, 2);
    }

    @Test
    @Order(1)
    void test1() {
        System.out.println("PERTAMA");
        assertEquals(1+1, 2);
    }
    @Test
    @Order(2)
    void test2() {
        System.out.println("KEDUA");
        assertEquals(1+1, 2);
    }
    @Test
    @Order(3)
    void test3() {
        System.out.println("KETIGA");
        assertEquals(1+1, 2);
    }
    @Test
    @Order(4)
    void test4() {
        System.out.println("KEEMPAT");
        assertEquals(1+1, 2);
    }
}