package com.testscases;

import com.phil.Calculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

class CalculatorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Add Two Numbers")
    void add() {
        assertEquals(13.0, Calculator.add(10,3.0));
        assertEquals(36.997, Calculator.add(10.089,26.908));
    }

    @Test
    @DisplayName("Multiply Two number")
    void multiply() {
        assertEquals(60,Calculator.multiply(6,10));
    }
    @RepeatedTest(10)
    @DisplayName("Compare three numbers")
    void compareNumbers(){
        assertEquals(8.001,Calculator.compareThreeNumbers(-8,8,8.001));
    }

    @DisplayName("Palindrome")
    @ParameterizedTest
    @ValueSource(strings={"racecar", "radar", "able was I ere I saw elba"})
    void palindromes(String candidate) {
        assertTrue(Calculator.Palindrome(candidate));
    }
    @TestFactory
    Collection<DynamicTest> dynamicTestsFromCollection(){
        return Arrays.asList(
                dynamicTest("1st dynamic test",() -> assertTrue(Calculator.Palindrome("madam"))),
                dynamicTest("2nd dynamic test", () -> assertEquals(4, Calculator.multiply(2, 2)))
        );
    }
}