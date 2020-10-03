package com.sammidev;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;


@Execution(value = ExecutionMode.CONCURRENT)
class SlowTest {

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    void show() throws InterruptedException {
        Thread.sleep(10_000);
    }

    @Test
    void show2() {
        assertEquals(1+1,2);
    }
}
