package com.sammidev;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

class incSlowTest {

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    void show() throws InterruptedException {
        Thread.sleep(10_000);
    }
}
