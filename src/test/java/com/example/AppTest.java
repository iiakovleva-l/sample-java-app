package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test
    void testAddPositiveNumbers() {
        App classUnderTest = new App();
        assertEquals(5, classUnderTest.add(2, 3));
    }

    @Test
    void testAddNegativeNumbers() {
        App classUnderTest = new App();
        assertEquals(-5, classUnderTest.add(-2, -3));
    }
}