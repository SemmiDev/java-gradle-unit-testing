/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.sammidev;

import com.sammidev.generator.SimpleNameGenerator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import org.opentest4j.TestAbortedException;

import java.beans.BeanInfo;
import java.beans.BeanProperty;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

@DisplayNameGeneration(SimpleNameGenerator.class)
class AppTest {

    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    // BEFORE EACH AND AFTER EACH WILL RUN EACH @TEST
    @BeforeEach
    void beforeEach() {
        System.out.println("BEFORE UNIT TEST");
    }

    @AfterEach
    void afterEach() {
        System.out.println("AFTER UNIT TEST");
    }

    // BEFORE AND AFTER ALL JUST RUN ONCE WHEN APP START AND END
    @BeforeAll
    static void beforeAll() {
        System.out.println("BEFORE ALL");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("AFTER ALL");
    }

    Calculator calculator = new Calculator(6d,2d);
    Calculator calculator2 = new Calculator(2d,0);

    @Test
    void testAddSuccess() {
        double result = calculator.adding();
        assertEquals(8d,result);
    }

    @Test
    @Disabled("Coming Soon")
    void testDivideSuccess() {
        double result = calculator.division();
        assertEquals(3d,result);
    }

    @Test
    void testDividedError() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator2.division();
        });
        assertEquals(exception.getMessage(), "can't divide by zero");
    }

    @Test
//    @DisplayName("TEST SUBSTRACTION")
    void testSubstractSuccess() {
        double result = calculator.substraction();
        assertEquals(4d,result);
    }

    @Test
    void testAborted() {
        String profileName = System.getenv("NAME");
        if ("SAMMIDEV" != profileName) {
            throw new TestAbortedException();
        }
    }

    // LEBIH MUDAH MENGGUNAKAN ASSUMPTION
    @Test
    void testAssumption() {
        assumeTrue("SAMMIDEV" == System.getenv("NAME"));
        System.out.println("WILL EXECITE IF ASSUME WAS TRUE");
    }


    @Test
    @EnabledOnOs({OS.WINDOWS, OS.LINUX})
    void onlyRunOnWinAndLinux() {
        System.out.println("WIN AND LINUX");
    }
    @Test
    @EnabledOnOs(OS.MAC)
    void onlyRunOnMac() {
        System.out.println("MAC OS");
    }

    @Test
    @EnabledOnJre(value = JRE.JAVA_11)
    void onlyRunJava11() {
        System.out.println("11");
    }

    @Test
    @DisabledOnJre(JRE.JAVA_15)
    void disableRunOnJava15() {
        // put your unit test
    }

    // RANGE
    @Test
    @EnabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_15)
    void onlyRunOnRange8until15() {
        System.out.println("8 ->> 15");
    }

    @Test
    @EnabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
    void testSystemProperties() {
        System.out.println("COOL");
    }

    @Test
    void printSytemProperties() {
        System.getProperties().forEach((k,v) -> {
            System.out.println(k + " ->> " + v);
        });
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "NAME", matches = "SAM")
    void enabledOnlyName() {
        // bla bla bla
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    void DisabledOnlyName() {
        // bla bla bla
    }
}