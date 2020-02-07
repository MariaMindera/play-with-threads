package com.mindera.school;

import java.util.concurrent.Callable;

public class CalculateThread2 implements Callable<String> {
    private Calculator calculator;

    public CalculateThread2(int max) {
        this.calculator = new Calculator(max);
    }

    @Override
    public String call() throws Exception {
        return calculator.getResult();
    }
}
