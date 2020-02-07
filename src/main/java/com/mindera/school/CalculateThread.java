package com.mindera.school;

public class CalculateThread extends Thread {
    private String result;
    private Calculator calculator;

    public CalculateThread(int max) {
        this.calculator = new Calculator(max);
    }

    @Override
    public void run() {
        result = calculator.getResult();
    }

    public String getResult() {
        return result;
    }
}
