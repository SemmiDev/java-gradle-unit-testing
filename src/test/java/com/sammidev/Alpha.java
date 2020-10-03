package com.sammidev;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.MethodOrderer.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(Alphanumeric.class)
public class Alpha {
    int a = 0;

    @BeforeAll
    void BisaTidakHarusStatic() {
        System.out.println("before");
    }
    @AfterAll
    void BisaTidakHarusStaticc() {
        System.out.println("after");
    }

    @Test
    void testA() {
        a++;
        System.out.println(a);
        assertEquals(1+1, 2);
    }

    @Test
    void testB() {
        a++;
        System.out.println(a);
        assertEquals(1+1, 2);
    }

    @Test
    void testC() {
        a++;
        System.out.println(a);
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