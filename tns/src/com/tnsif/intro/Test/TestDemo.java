package com.tnsif.intro.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestDemo {

	// Runs ONCE before all test methods (must be static)
    @BeforeAll
    static void beforeAllTests() {
        System.out.println("Before All Tests");
    }

    // Runs BEFORE each test method
    @BeforeEach
    void beforeEachTest() {
        System.out.println("Before Each Test");
    }

    // Test case 1
    @Test
    void testOne() {
        System.out.println("Executing Test One");
    }

    // Test case 2
    @Test
    void testTwo() {
        System.out.println("Executing Test Two");
    }

    // Runs AFTER each test method
    @AfterEach
    void afterEachTest() {
        System.out.println("After Each Test");
    }

    // Runs ONCE after all test methods (must be static)
    @AfterAll
    static void afterAllTests() {
        System.out.println("After All Tests");
    }
}
