package com.mindera.school;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciCalculatorTest {

    private FibonacciCalculator fibonacciCalculator;

    @BeforeEach
    void setup() {
        this.fibonacciCalculator = new FibonacciCalculator();
    }

    @Test
    void highestFibonacci() throws InterruptedException {
        assertEquals("0,1,1,2,3", fibonacciCalculator.fibonacciSequence(5));
    }

    @Test
    void fibonacciSequence() throws InterruptedException {
        var results = fibonacciCalculator.sequences(List.of(5, 6, 7));
        assertEquals("0,1,1,2,3", results.get(0));
        assertEquals("0,1,1,2,3,5", results.get(1));
        assertEquals("0,1,1,2,3,5,8", results.get(2));
    }

    // TODO - Can you write a test that doesn't guarantee order but is potentially faster?
}