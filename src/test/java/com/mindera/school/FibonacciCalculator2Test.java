package com.mindera.school;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.concurrent.ExecutionException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FibonacciCalculator2Test {

    private FibonacciCalculator2 fibonacciCalculator;

    @BeforeEach
    void setup() {
        this.fibonacciCalculator = new FibonacciCalculator2();
    }

    @Test
    void highestFibonacci() throws InterruptedException {
        assertEquals("0,1,1,2,3", fibonacciCalculator.fibonacciSequence(5));
    }

    @Test
    void fibonacciSequence() throws InterruptedException, ExecutionException {
        var results = fibonacciCalculator.sequences(List.of(5, 6, 7));

        assertTrue(results.contains("0,1,1,2,3"));
        assertTrue(results.contains("0,1,1,2,3,5"));
        assertTrue(results.contains("0,1,1,2,3,5,8"));
    }

}