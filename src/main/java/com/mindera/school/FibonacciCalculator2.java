package com.mindera.school;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

/**
 * Used to calculate the Fibonacci sequence
 * <p>
 * https://en.wikipedia.org/wiki/Fibonacci_number
 */
public class FibonacciCalculator2 {

    /**
     * Calculates n entries of the fibonacci sequence
     * <p>
     * In mathematics, the Fibonacci numbers, commonly denoted Fn, form a sequence, called the Fibonacci sequence,
     * such that each number is the sum of the two preceding ones, starting from 0 and 1
     * <p>
     * eg: 0,1,1,2,3,5,8,13,21,34,55,89,144
     */
    public String fibonacciSequence(final Integer n) throws InterruptedException {
        var cal = new Calculator(n);

        return cal.getResult();
    }

    /**
     * Calculates n entries of the fibonacci sequence for each entry in the list
     */
    public List<String> sequences(List<Integer> entries) throws InterruptedException, ExecutionException {
        ExecutorService threadPool = Executors.newFixedThreadPool(entries.size());

        var service = new ExecutorCompletionService<String>(threadPool);

        var calculators = entries.stream()
                .map(CalculateThread2::new)
                .collect(Collectors.toList());

        calculators.forEach(service::submit);

        List<String> results = new ArrayList<>(entries.size());
        for (int i = 0; i < calculators.size(); i++) {
            results.add(service.take().get());
        }

        return results;
    }
}
