package com.sammidev.generator;

import org.junit.jupiter.api.DisplayNameGenerator;

import java.lang.reflect.Method;

public class SimpleNameGenerator implements DisplayNameGenerator {
    @Override
    public String generateDisplayNameForClass(Class<?> testClass) {
        return "TEST FOR " + testClass.getSimpleName();
    }

    @Override
    public String generateDisplayNameForNestedClass(Class<?> nestedClass) {
        return "TEST FOR " + nestedClass.getSimpleName();
    }

    @Override
    public String generateDisplayNameForMethod(Class<?> testClass, Method testMethod) {
        return "TEST FOR " + testClass.getSimpleName() + testMethod.getName();
    }
}
