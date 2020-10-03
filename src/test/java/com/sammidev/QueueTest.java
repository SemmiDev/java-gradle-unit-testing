package com.sammidev;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

@DisplayName("A Queue")
public class QueueTest {

    List<String> list;

    @Nested
    @DisplayName("Nestedd")
    class Nesteddd {

        @BeforeEach
        void beforeEach() {
            System.out.println("before");
            list = new ArrayList<>();
            list.add("a");
        }

        @Test
        void test() {
            list.add("a");
            System.out.println(list.size());
            System.out.println("test");
        }

        @AfterEach
        void afterEach() {
            System.out.println(list.size());
            System.out.println("after");
        }
    }
}
